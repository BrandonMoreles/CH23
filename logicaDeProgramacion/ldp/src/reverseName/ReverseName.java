package reverseName;

import java.util.Scanner;

public class ReverseName {

	public static void main(String[] args) {
		reverse(data());
	}
	public static String data() {
		Scanner scan= new Scanner(System.in);
		System.out.println("Digita el nombre a reversear");
		String dato= scan.next();
		return dato;
	}
	public static void reverse(String name) {
		char[]letter;
		letter=name.toCharArray();
		for(int i=letter.length-1;i>=0;i--) {
			System.out.print(letter[i]);
		} 
	}

}
