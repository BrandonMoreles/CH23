package funciones;

public class Funciones {
	
	public static int sumar(int num1, int num2) {
		int resultado=num1+num2;
		return resultado;
	}
	public static int restar(int num1, int num2) {
		int resultado=num1-num2;
		return resultado;
	}
	public static int mult(int num1, int num2) {
		int resultado=num1*num2;
		return resultado;
	}
	public static int div(int num1, int num2) {
		int resultado=num1/num2;
		return resultado;
	}//Cierre de division
	
	
	
	public static void imprimirAsteriscos() {
		System.out.println("**********");
	}//Cierre de imprimir asteriscos
	
	
	public static String awitaDeLimon(String agua, String azucar, String limon) {
		return(agua+limon+azucar);
	}//Cirre de awita de limon
	
	
	public static void altura() {
		
		double base =100d;
		double angulElev=Math.toRadians(30);
		double altura=Math.tan(angulElev)*base;
		double hipo=Math.sqrt(Math.pow(base,2)+Math.pow(altura,2));
		System.out.println("La altura es de "+ altura);
		System.out.println("La base es de "+base);
		System.out.println("La hipotenusa es "+hipo);
		System.out.println("Sus angulos son de 90, 30 y 60 grados");
		System.out.println(Math.tan(angulElev));
	}//Cierre de altura
	
	
	public static void main(String[] args) {
		//System.out.println(sumar(2,4));
		//imprimirAsteriscos();
		//System.out.println(awitaDeLimon("agua","limon", "azucar"));
		altura();
		String[]stringss=new String[2];
	}

}
