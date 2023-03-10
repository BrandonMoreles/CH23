package Testers;

import Clases.*;

public class TestFig {
	public static void main(String[] args) {
		
	//Las clases abstractas debe de tener por lo menos un metodo abstracto
	//
	/*FigurasGeometricas rectangulo=new Rectangulo(12, 9);
	System.out.println(+rectangulo.areas());
	FigurasGeometricas circ=new Circulo(12);
	System.out.println(circ.areas());
	FigurasGeometricas trian=new Triangulo(12, 4);
	System.out.println(trian.areas());
	Cuadrado cuadrado=new Cuadrado(6);
	System.out.println(cuadrado.areas()+""+cuadrado.getLado());
	System.out.println(cuadrado.toString());
	System.out.println(circ.toString());*/
	
	Rectangulo rectangulo1=new Rectangulo(0, 0);
	rectangulo1.pedirDatos();
	System.out.println(rectangulo1.toString());
	
}}
