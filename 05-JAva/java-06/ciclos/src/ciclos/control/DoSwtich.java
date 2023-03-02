package ciclos.control;
import java.util.Scanner;

import ciclos_forDoWhile.CicloDo;
import ciclos_forDoWhile.UsoFor;
import ciclos_forDoWhile.UsoWhile;

public class DoSwtich {
	public void controlador() {
		Scanner enter= new Scanner(System.in);
		Menus mp=new Menus();
		UsoWhile uW=new UsoWhile();
		UsoFor uF=new UsoFor();
		CicloDo cD=new CicloDo();
		int choice;
		do {
			mp.menuPrincipal();
			System.out.println();
			System.out.println("Introduzca una opcion");
			choice= enter.nextInt();
			switch (choice) {
			case 1:
				uW.cicloW();
				break;
			case 2:uW.centinelaW();
				
				break;
			case 3:uW.bandera();
				
				break;
			case 4:uF.cicloFor();
	
				break;
			case 5:uF.letrasFor();
	
				break;
			case 6:cD.digitosDo();
	
				break;

			default:System.out.println("bye bye");
				break;
			}
			if (choice<0||choice>6) {
				break;
			}
			System.out.println("Continuar? 1=Si, 2=No");
			int eleccion= enter.nextInt();
			if (eleccion!=1) {
				System.out.println("Bye bye");
				break;
			}
			}
		while(choice>0&&choice<7);
}}
