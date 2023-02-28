package control;

import javax.swing.JOptionPane;

public class EstructuraIf {
	public void controlIf() {
		long nota=6;
		if (nota>5){
			System.out.println("Hola");}
		else {System.out.println("Nel carnal");}}
		public void compara(){
			int dato1=Integer.parseInt(JOptionPane.showInputDialog("Dame el valor numero 1"));
			int dato2=Integer.parseInt(JOptionPane.showInputDialog("Dame el valor numero 2"));
			String texto=dato1>dato2?dato1+" es mayor, que "+dato2:dato1==dato2?dato1+"  y  "+ dato2 +" son iguales":dato1 + "es mayor que " + dato2;
JOptionPane.showMessageDialog(null, texto);}
		
		
		
		
		
		
		
public void anidado(){
	 int numero=Integer.parseInt(JOptionPane.showInputDialog("Dame el numero"));
	 if (numero>0){
		 JOptionPane.showMessageDialog(null, "El valor es positivo");}
	 else if(numero<0) {JOptionPane.showMessageDialog(null, "El valor es neativo");}
	 else {JOptionPane.showMessageDialog(null, "Es cero");}}

}

