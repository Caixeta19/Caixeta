package estudo.de.caso;

import java.util.Scanner;

//Integrantes: Guilherme da Silva Barros - 0019601
//			   Vinícius Lopes Gomes - 0018718
//			   Guilherme De Queiroz Caixêta - 0019429
//			   Felipe Nunes - 0018696

public class TesteObras {

	public static void main(String[] args) {
		
		GerenciaDeObras controle = new GerenciaDeObras();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("\nMenu de opções:");
			System.out.println("1) Registrar reclamação");
			System.out.println("2) Excluir reclamação");
			System.out.println("3) Consultar reclamação");
			System.out.println("4) Registrar conserto");
			System.out.println("5) Sair");
			System.out.println("Escolha uma opção: ");
			int opcao = scan.nextInt();
			scan.nextLine();
			
			switch(opcao) {
			case 1:
				System.out.println("Endereço (Rua, Número, Bairro): ");
				String endereco = scan.nextLine();
				System.out.println("Tamanho do Buraco (0 a 10): ");
				int tamanhoBuraco = scan.nextInt();
				scan.nextLine();
				System.out.println("Localização (Rua ou Calçada): ");
				String localizacao = scan.nextLine();
				Reclamacao novaReclamacao = new Reclamacao(endereco, tamanhoBuraco, localizacao);
				controle.registrarReclamacao(novaReclamacao);
				break;
			case 2:
				System.out.println("Número da Reclamação a ser excluida: ");
				int numReclamacaoExcluir = scan.nextInt();
				controle.excluirReclamacao(numReclamacaoExcluir);
				break;
			case 3:
				System.out.println("Número da Reclamação a ser consultada");
				int numReclamacaoConsultar = scan.nextInt();
				Reclamacao reclamacaoConsultada = controle.consultarReclamacao(numReclamacaoConsultar);
				if (reclamacaoConsultada != null) {
					System.out.println("Reclamação encontrada: ");
					System.out.println(reclamacaoConsultada);
				} else {
					System.out.println("Reclamação não encontrada.");
				}
				break;
			case 4:
				System.out.println("Número da Reclamação");
				int numeroReclamacao = scan.nextInt();
				System.out.println("Valo do Conserto: ");
				double valorConserto = scan.nextDouble();
				Conserto novoConserto = new Conserto(numeroReclamacao, valorConserto);
				controle.registrarConserto(novoConserto);
				break;
			case 5:
				System.out.println("Encerrando o programa...");
				System.exit(0);
			default:
				System.out.println("Opção inválida.");
				
				
			
			}
		}

	}

}
