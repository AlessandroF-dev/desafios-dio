package banco_digital;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta corrente = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		corrente.depositar(100);
		corrente.transferir(100, poupanca);

		poupanca.transferir(150, corrente);

		corrente.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
