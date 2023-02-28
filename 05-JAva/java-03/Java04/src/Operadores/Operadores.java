package Operadores;
import javax.swing.JOptionPane;

public class Operadores {
	 public static void main (String[] args){
	 Integer numero=Integer.parseInt(JOptionPane.showInputDialog("Dame el numero a verificar "));
	 String texto=numero>0&&numero%2==0?"Es positivo y par":numero>0||numero%2!=0?"Es positivo impar":numero<0||numero%2==0?"Es megativo par":"Es negativo impar";
	 JOptionPane.showInternalMessageDialog(null, texto);
	 
	 
	 Integer num=Integer.parseInt(JOptionPane.showInputDialog("Dame el numero a buscar el rango"));
	 String respuesta=num<11&&num>0?"Esta entre 0 y 10":"No esta entre 0 y 10";
	 JOptionPane.showInternalMessageDialog(null, respuesta);
	 
	 String name1=(JOptionPane.showInputDialog("Dame el numero a verificar"));
	 String name2=(JOptionPane.showInputDialog("Dame el numero a verificar"));
	// String resp2=name1==name2?"Efectivamente capo, son iguales":"Nel, no son iguales";
	if(name1.equals(name2)){ JOptionPane.showInternalMessageDialog(null,"Son iguales");}
	else {JOptionPane.showInternalMessageDialog(null,"Nel");}
	
	 }}
