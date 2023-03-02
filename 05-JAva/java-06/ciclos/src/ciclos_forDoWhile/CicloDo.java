package ciclos_forDoWhile;

import java.util.Scanner;



public class CicloDo {
	public void digitosDo(){
		System.out.println("Introduzca una numero entre 0 y 9");
		Scanner enter= new Scanner(System.in);
		int num, acum=0;
		do {
			num=enter.nextInt();			acum+=num;
			System.out.println(acum);
		}while(num>=0&&num<=9);
	}
}
