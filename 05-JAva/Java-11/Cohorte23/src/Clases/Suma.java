package Clases;

public class Suma implements OperacionesAritmeticas, Mensajes{
	private double a,b;
	
	public Suma(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	

	public Suma() {
	}


	@Override
	public double sumar() {
		// TODO Auto-generated method stub
		return this.a+this.b;
	}

	@Override
	public double restar() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void mensaje() {
		System.out.println("Hola, soy una suma");
	}
	
}
