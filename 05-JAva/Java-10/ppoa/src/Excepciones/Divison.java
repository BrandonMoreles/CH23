package Excepciones;

public class Divison {
	private int numerador,denominador;

	public Divison(int numerador, int denominador) throws OpException{
		if(denominador==0) {
			throw new OpException("El demominador es cero");
		}
		this.numerador = numerador;
		this.denominador = denominador;
	}
	public void visualizarD() {
		System.out.println("El resultado de la division es "+(this.numerador/this.denominador));

	}
}
