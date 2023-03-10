package Testers;

import javax.lang.model.element.Element;

import Clases.AlumnoB;
import Clases.PersonaP;

public class TestPB {
	public static void main(String[] args) {
		PersonaP p=new PersonaP("Pepe Loro", 23);
		AlumnoB a= new AlumnoB(727, 9.8, "Joel Pedraza", 19);
		System.out.println(a.getNombre());
		System.out.println(a.getPromedio());
		System.out.println(a.toString());
		System.out.println(p.toString());
		a.mostrarDatos();
		a.mostrarDatos("El chido");
	}
}
