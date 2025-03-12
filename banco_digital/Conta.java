package banco_digital;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public boolean sacar(double valor) {
        if (saldo < valor) {
            System.out.println(dateFormat.format(new Date())
                    + " Saldo insuficiente! Saldo atual: " + getDeValorMonetario(saldo)
                    + ". Valor solicitado para saque: " + getDeValorMonetario(valor)
            );
            return false;
        } else {
            saldo -= valor;
            System.out.println(dateFormat.format(new Date()) + " Saque realizado com sucesso! Saldo atual: " + getDeValorMonetario(saldo));
            return true;
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println(dateFormat.format(new Date()) + " Depositado com sucesso! Saldo atual: " + getDeValorMonetario(saldo));
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        boolean isValorSacado = this.sacar(valor);

        if (isValorSacado) {
            contaDestino.depositar(valor);
            System.out.println(dateFormat.format(new Date()) + " Transferido com sucesso! Saldo atual: " + getDeValorMonetario(saldo));
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.println(dateFormat.format(new Date()) + " Titular: " + this.cliente.getNome());
        System.out.println(dateFormat.format(new Date()) + " Agencia: " + this.agencia);
        System.out.println(dateFormat.format(new Date()) + " Numero: " + this.numero);
        System.out.println(dateFormat.format(new Date()) + " Saldo: " + getDeValorMonetario(saldo));
    }

    protected String getDeValorMonetario(double saldo) {
        return NumberFormat.getCurrencyInstance().format(saldo);
    }
}
