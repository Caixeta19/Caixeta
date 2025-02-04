package Atividade;

public class Polimorfismo {

	public static void main(String[] args) {
		
		Conta[] contas= new Conta[3];
		contas[0] = new Conta();
		contas[1] = new ContaCorrente();
		contas[2] = new ContaPoupanca();
		
		for (Conta conta : contas) {
            conta.deposita(1000);
            conta.atualiza(10);
            System.out.println(conta.getSaldo());

	}

}
}