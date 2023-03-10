package Clases;

public class Circulo extends FigurasGeometricas {
	private double radio;
	
	public Circulo(double radio) {
		super("Circulo");
		this.radio = radio;
	}

	@Override
	public double areas() {
		return (radio*radio)*Math.PI;
	}

	public double getDiametro() {
		return radio;
	}

	public void setDiametro(double radio) {
		this.radio =radio;
	}

	@Override
	public void pedirDatos() {
		// TODO Auto-generated method stub
		
	}
	
}
