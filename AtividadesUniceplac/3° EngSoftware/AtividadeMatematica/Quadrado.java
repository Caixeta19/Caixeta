package AtividadeMatematica;

	class Quadrado implements FormasGeometricas {
	    private double lado;

	    public Quadrado(double lado) {
	        this.lado = lado;
	    }

	    @Override
	    public double calcularArea() {
	        return lado * lado;
	    }

	    @Override
	    public double calcularPerimetro() {
	        return 4 * lado;
	    }
	}

