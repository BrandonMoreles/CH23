package ciclos_forDoWhile;

import java.net.Socket;
import java.util.Scanner;

import javax.lang.model.element.Element;
import javax.swing.JOptionPane;

public class UsoWhile {
	Scanner enter=new Scanner(System.in);
	public void cicloW() {
		int iterador=0;
		while(iterador<10) {
			System.out.println(iterador);
			iterador+=1;
		}
		
	}
	public void centinelaW() {
		final int centinela = -1;
		System.out.println("Introduzca una nota");
		int nota=enter.nextInt();
		while(nota!=centinela) {
			System.out.println("Nel papito");
			System.out.println("Introduzca una nota");
			nota=enter.nextInt();		}};
	public void bandera() {
			
			boolean valorb=false;
			while(!valorb) {
				System.out.println("Introduzca un numero");
				int number=enter.nextInt();
				if(number>0&&number<=5){
					int poten=(int)(Math.pow(number, 2));
					System.out.println("El resultado es --> "+poten);
				}else {valorb=true;
						System.out.println("Hasta la protzima");
				}
			}

	}
}
