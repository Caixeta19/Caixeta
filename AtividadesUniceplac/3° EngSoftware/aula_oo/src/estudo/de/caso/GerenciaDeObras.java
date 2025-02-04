package estudo.de.caso;

import java.util.ArrayList;

//Integrantes: Guilherme da Silva Barros - 0019601
//			   Vinícius Lopes Gomes - 0018718
//			   Guilherme De Queiroz Caixêta - 0019429
//			   Felipe Nunes - 0018696

public class GerenciaDeObras {
	
	private ArrayList<Reclamacao> reclamacoes;
	private ArrayList<Conserto> consertos;
	
	public GerenciaDeObras() {
		reclamacoes = new ArrayList<>();
		consertos = new ArrayList<>();
	}

	public void registrarReclamacao(Reclamacao reclamacao) {
		reclamacoes.add(reclamacao);
		System.out.println("Reclamação registrada com sucesso! Número de Identificação: " + reclamacao.getNumeroIdentificacao());
		
	}
	
	public void registrarConserto(Conserto conserto) {
		consertos.add(conserto);
		System.out.println("Conserto realizado com sucesso");
		
		for (Reclamacao reclamacao : reclamacoes) {
			if (reclamacao.getNumeroIdentificacao() == conserto.getNumeroReclamacao()) {
				reclamacao.setSituacao("Consertada");
				break;
				
			}
		}
	}
	
	public Reclamacao consultarReclamacao(int numeroReclamacao) {
		for(Reclamacao reclamacao : reclamacoes) {
			if (reclamacao.getNumeroIdentificacao() == numeroReclamacao) {
				return reclamacao;
			}
		}
		return null;
	}
	
	public void excluirReclamacao(int numeroReclamacao) {
		Reclamacao reclamacaoParaExcluir = null;
		for (Reclamacao reclamacao: reclamacoes) {
			if (reclamacao.getNumeroIdentificacao() == numeroReclamacao) {
				reclamacaoParaExcluir = reclamacao;
				break;
			}
		}
		
		if (reclamacaoParaExcluir != null) {
			reclamacoes.remove(reclamacaoParaExcluir);
			System.out.println("Reclamção excluida com sucesso!");
		} else {
			System.out.println("Reclamação não encontrada.");
		}
		
	}
	
	public void mostrarReclamacoes() {
		if (reclamacoes.isEmpty()) {
			System.out.println("Nenhuma reclamação no registro.");
		} else {
			System.out.println("Lista de Reclamações: ");
			for (Reclamacao reclamacao : reclamacoes) {
				System.out.println(reclamacao);
			}
		}
	}
	
}
