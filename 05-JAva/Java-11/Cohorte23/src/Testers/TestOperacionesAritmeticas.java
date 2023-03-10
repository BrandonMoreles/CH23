package Testers;

import Clases.OperacionesAritmeticas;
import Clases.Suma;

public class TestOperacionesAritmeticas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Suma s=new Suma(2, 4);
		OperacionesAritmeticas ss=new Suma(23,322);
		System.out.println(s.sumar());
		System.out.println(ss.sumar());
		s.mensaje();
	}

}
