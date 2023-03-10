package Clases;

public class Triangulo extends FigurasGeometricas{
	private int base, altura;

	@Override
	public double areas() {
		return (base*altura)/2;
	}
	
	public Triangulo(int base, int altura) {
		super("Rectangulo");
		this.base = base;
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public void pedirDatos() {
		// TODO Auto-generated method stub
		
	}
	
}
