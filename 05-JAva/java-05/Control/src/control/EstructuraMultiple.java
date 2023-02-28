package control;

import javax.sound.midi.Soundbank;
import javax.swing.JOptionPane;

public class EstructuraMultiple {
	public void vocales() {
		char letra=JOptionPane.showInputDialog("Dame la letra a cerificar").charAt(0);
		switch (letra) {
		case'a': 
		case'A':
		case'E':
		case'I':
		case'O':
		case'U':
		case'e':
		case'i':
		case'o':
		case'u':
			System.out.println("Es vocal");
			break;
			default:System.out.println("No es vocal");
			break;
		}
	}
	
	
		public void Notas() {
			int numero=Integer.parseInt(JOptionPane.showInputDialog("Dame la letra a cerificar"));
			switch (numero) {
			case 10: 
			case 9:System.out.println("Excelente");break;
			case 8:System.out.println("Bueno");break;
			case 7:System.out.println("Regular");break;
			case 6:System.out.println("Deficiente");break;
			case 5:
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:System.out.println("Reprobado");break;
				default:System.out.println("Fuera de rango");
				break;
				
			}}
}
