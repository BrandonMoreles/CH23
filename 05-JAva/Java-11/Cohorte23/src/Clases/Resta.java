package Clases;

public class Resta implements OperacionesAritmeticas, Mensajes{
	private int a,b;
	public Resta(int a, int b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public void mensaje() {
		System.out.println("Esto es una resta");
		
	}
	@Override
	public double sumar() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double restar() {
		return a-b;
	}
	

}
