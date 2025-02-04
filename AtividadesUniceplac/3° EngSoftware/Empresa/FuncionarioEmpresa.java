package Empresa;

public class FuncionarioEmpresa {
	
	private int matricula;
	private String nome;
	private int idade;
	private String cargo;
	private double salario;
	
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "FuncionarioEmpresa [matricula=" + matricula + ", nome=" + nome + ", idade=" + idade + ", cargo=" + cargo
				+ ", salario=" + salario + "]";
	}
	
	
	
	
	

}
