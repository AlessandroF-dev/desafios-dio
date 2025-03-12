package banco_digital;

import java.util.Date;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println(dateFormat.format(new Date()) + " === Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
}
