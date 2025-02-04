package estudo.de.caso;

import java.text.SimpleDateFormat;
import java.util.Date;

//Integrantes: Guilherme da Silva Barros - 0019601
//			   Vinícius Lopes Gomes - 0018718
//			   Guilherme De Queiroz Caixêta - 0019429
//			   Felipe Nunes - 0018696

public class Conserto {
	
	private int numeroReclamacao;
	private Date dataHoraConserto;
	private double valorConserto;
	
	public Conserto(int numeroReclamacao, double valorConserto) {
		this.numeroReclamacao = numeroReclamacao;
		this.dataHoraConserto = new Date();
		this.valorConserto = valorConserto;
	}

	public int getNumeroReclamacao() {
		return numeroReclamacao;
	}

	public void setNumeroReclamacao(int numeroReclamacao) {
		this.numeroReclamacao = numeroReclamacao;
	}

	public Date getDataHoraConserto() {
		return dataHoraConserto;
	}

	public void setDataHoraConserto(Date dataHoraConserto) {
		this.dataHoraConserto = dataHoraConserto;
	}

	public double getValorConserto() {
		return valorConserto;
	}

	public void setValorConserto(double valorConserto) {
		this.valorConserto = valorConserto;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		return "Conserto Número da Reclamacao = " + numeroReclamacao + ", Data e Hora do Conserto=" + dataHoraConserto
				+ ", Valor do Conserto=" + valorConserto;
	}
	

	

}
