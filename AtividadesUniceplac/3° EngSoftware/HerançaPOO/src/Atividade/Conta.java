package Atividade;

public class Conta {
	int taxa;
	protected double saldo;

	public double getSaldo() {
		return saldo;
	}
	
	public void deposita(double valor) {
		 this.saldo =  saldo + valor;
	}
	
	public void saca(double valor) {
		this.saldo = saldo - valor;
	}
	
	public void atualiza( double taxa) {
		this.saldo += this.saldo * taxa/100;
	}
	

}
