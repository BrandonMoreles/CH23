package tiposDeDatos;
import javax.swing.JOptionPane;

public class Ejercicios2 {
	public static void main(String[] args) {
		 float far= Float.parseFloat(JOptionPane.showInputDialog("Dame la temperatura en farenheit"));
		 float celsiuf=(float) ((far-32)/1.8);
		 float kelvinf=(float) (celsiuf+273.5);
		 
		 
		 JOptionPane.showInternalMessageDialog(null,"La temperatura en celsius es "+ celsiuf);
		 JOptionPane.showInternalMessageDialog(null,"La temperatura en kelvin es "+ kelvinf );
		 
		 
		 int num= Integer.parseInt(JOptionPane.showInputDialog("Dame el numero a verificar"));
		 String resultado =num%2==0?"Es par":"No es par";
		 JOptionPane.showInternalMessageDialog(null,resultado);
			}}

