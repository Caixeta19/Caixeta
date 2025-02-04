package estudo.de.caso;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

//Integrantes: Guilherme da Silva Barros - 0019601
//			   Vinícius Lopes Gomes - 0018718
//			   Guilherme De Queiroz Caixêta - 0019429
//			   Felipe Nunes - 0018696

public class Reclamacao {
	
	private int numeroIdentificacao;
	private String endereco;
	private int tamanhoBuraco;
	private String localizacao;
	private Date dataHoraReclamacao;
	private String situacao;
	
	public Reclamacao(String endereco, int tamanho, String localizacao) {
		this.numeroIdentificacao = gerarNumeroIdentificacao();
		this.endereco = endereco;
		this.tamanhoBuraco = tamanhoBuraco;
		this.localizacao = localizacao;
		this.dataHoraReclamacao = new Date();
		this.situacao = "Registrada";
	
	}
	
	private int gerarNumeroIdentificacao() {
		Random random = new Random();
		return random.nextInt(10000);
	}

	public int getNumeroIdentificacao() {
		return numeroIdentificacao;
	}

	public void setNumeroIdentificacao(int numeroIdentificacao) {
		this.numeroIdentificacao = numeroIdentificacao;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getTamanhoBuraco() {
		return tamanhoBuraco;
	}

	public void setTamanhoBuraco(int tamanhoBuraco) {
		this.tamanhoBuraco = tamanhoBuraco;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public Date getDataHoraReclamacao() {
		return dataHoraReclamacao;
	}

	public void setDataHoraReclamacao(Date dataHoraReclamacao) {
		this.dataHoraReclamacao = dataHoraReclamacao;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM,yyyy HH:mm");
		return "Reclamacao Número da Reclamação = " + numeroIdentificacao + ", Endereço = " + endereco + ", Tamanho do Buraco = "
				+ tamanhoBuraco + ", Localizacao =" + localizacao + ", Data e Hora da Reclamacao=" + sdf.format(dataHoraReclamacao)
				+ ", Situação =" + situacao + "]";
	}
	


}
