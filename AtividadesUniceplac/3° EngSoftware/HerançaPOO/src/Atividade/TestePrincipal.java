package Atividade;

public class TestePrincipal {

	public static void main(String[] args) {
		
		Conta c = new Conta();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);
		
		
		System.out.println("Saldo Conta:" + c.getSaldo());
		System.out.println("Saldo Conta Corrente:" + cc.getSaldo());
		System.out.println("Saldo Conta Poupanca:" + cp.getSaldo());
		
		
		
		
		
		
		

	}

}
