package Clases;

import java.util.Scanner;

public class NuevoHola {
	private String nombre;

	public NuevoHola(String nombre) {
		this.nombre = nombre;
	}
	public void Saludo(){
		System.out.println("Hola desde Java " +this.nombre);
	}
	public static void saludoNombre(String name) {
		System.out.println("Hola como estas "+ name);
	}
}
