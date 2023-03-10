package Excepciones;

import java.util.Scanner;

public class DontComprobatedException {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Introduzca un valor");
		int dato;
		
		
		try {
			dato=Integer.parseInt(scan.next());
			int divison=10/dato;
			System.out.println(divison);
		} catch (ArithmeticException e) {
			System.out.println("La excepcion es "+e.getMessage());
		}catch (NumberFormatException ex) {
			System.out.println("El dato insertado es un caracter pedazo... (Dejese a imaginacion del usuario)"+ ex.getMessage());
		}finally {
			System.out.println("Aqui se termina la exception");
		}
	
	}
}
