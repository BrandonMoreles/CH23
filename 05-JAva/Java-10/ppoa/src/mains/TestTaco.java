package mains;

import clases.Taco;

public class TestTaco {
public static void main(String[] args) {
	Taco taco1=new Taco("Harina","Grande","Barbacoa",2,9.6d);
	System.out.println(taco1.getPrecio());
	taco1.subirPrecio(2);
	System.out.println(taco1.getPrecio());
	System.out.println(taco1);
}
}
