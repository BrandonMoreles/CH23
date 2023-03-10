package Clases;

public class Cuadrado extends FigurasGeometricas{
	private int lado;
	
	@Override
	public double areas() {
		return lado*lado;
	}
	
	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public Cuadrado(int lado) {
		super("Cuadrado");
		this.lado = lado;
	}

	@Override
	public void pedirDatos() {
		// TODO Auto-generated method stub
		
	}	
}
