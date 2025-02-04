package Atividade;

public class ContaCorrente extends Conta {

  public void deposita (double valor) {
	super.deposita(valor - 0.10);		
	}
	
public void atualiza(double valor) {
	super.atualiza(2 * taxa);
	
}
	
	

}
