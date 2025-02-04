package AtividadeMatematica;

public class ConstrutoresMatematica {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Circulo circulo = new Circulo(10);
	        Quadrado quadrado = new Quadrado(8);

	        System.out.println("A área do círculo: " + circulo.calcularArea());
	        System.out.println("O perímetro do círculo: " + circulo.calcularPerimetro());

	        System.out.println("A área do quadrado: " + quadrado.calcularArea());
	        System.out.println("O comprimento do quadrado: " + quadrado.calcularPerimetro());
	    }

	}



