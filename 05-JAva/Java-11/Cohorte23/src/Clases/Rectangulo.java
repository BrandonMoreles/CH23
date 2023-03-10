package Clases;

import java.io.Closeable;
import java.util.Scanner;

public class Rectangulo extends FigurasGeometricas{
	private double base,altura;
	
	public Rectangulo(double base, double altura) {
		super("Rectangulo");
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double areas() {
		// TODO Auto-generated method stub
		return base*altura;
	}
	@Override
	public void pedirDatos() {
		Scanner scan= new Scanner(System.in);
		System.out.println("Introduzca el valor de la base");
		base= scan.nextDouble();
		System.out.println("Introduzca el valor de la altura");
		altura=scan.nextDouble();
		scan.close();
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}
