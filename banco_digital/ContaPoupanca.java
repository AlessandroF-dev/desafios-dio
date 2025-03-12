package banco_digital;

import java.util.Date;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println(dateFormat.format(new Date()) + " === Extrato Conta Poupan�a ===");
		super.imprimirInfosComuns();
	}
}
