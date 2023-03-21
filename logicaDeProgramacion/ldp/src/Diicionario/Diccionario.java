package Diicionario;

import java.util.HashMap;
import java.util.Scanner;

public class Diccionario {
	public static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		buscar(dic());
	}
	public static HashMap<String, String> dic() {
		HashMap<String, String> diccionario= new HashMap<>();
		diccionario.put("gato","cat");
		diccionario.put("perro","dog");
		diccionario.put("sol","sun");
		diccionario.put("odio","hate");
		diccionario.put("escribir","write");
		diccionario.put("leer","read");
		diccionario.put("comer","eat");
		diccionario.put("caminar","walk");
		diccionario.put("correr","run");
		diccionario.put("beber","drink");
		return diccionario;
	}
	public static void buscar(HashMap<String, String> diccionario) {
		System.out.println("Palabra a buscar");
		String palabra=scan.next();
		String resultado=diccionario.get(palabra);
		if(resultado!=null) {System.out.println(resultado);}
		else {System.out.println("Palabra no encontrada");}
	}
}
