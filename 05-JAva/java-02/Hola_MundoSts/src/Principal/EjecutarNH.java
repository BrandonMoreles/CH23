package Principal;
import java.util.Scanner;

import Clases.NuevoHola;

public class EjecutarNH {

	public static void main(String[] args) {
		NuevoHola nh=new NuevoHola("Joel");
		nh.Saludo();
		Scanner enter=new Scanner(System.in);
		System.out.print("Dame tu nombre");
		String nombre;
		nombre=enter.nextLine();
		nh.saludoNombre(nombre);
	}

}
