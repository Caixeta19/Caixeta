package Atividade;

public class ContaPoupanca extends Conta {
	
	public void atualiza(double taxa) {
		super.atualiza(3 * taxa);
	}

}
