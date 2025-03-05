package conta_banco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite a agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        String mensagemFormatada = String.format("Olá %s, " +
                        "obrigado por criar uma conta em nosso banco, " +
                        "sua agência é %s, " +
                        "conta %s " +
                        "e seu saldo %s já está disponível para saque.",
                numero, agencia, nomeCliente, saldo);

        System.out.println(mensagemFormatada);
    }
}
