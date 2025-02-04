package ZeroException;

public class Teste {
	
	    public static void main(String[] args) {
	        Divisao divisao = new Divisao();
	        double numerador = 10.0;
	        double denominador = 0.0;

	        try {
	            double resultado = divisao.calcula(numerador, denominador);
	            System.out.println("Resultado da divisão: " + resultado);
	        } catch (DivisaoPorZeroException e) {
	            System.out.println("Erro: " + e.getMessage());
	        }
	 

     }
 }




