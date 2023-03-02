package control;

import javax.swing.JOptionPane;

public class Orden3 {
	public void ordenar() {
		String texto="";
		int dato1=Integer.parseInt(JOptionPane.showInputDialog("Dame el primer numero"));
		int dato2=Integer.parseInt(JOptionPane.showInputDialog("Dame el segundo numero"));
		int dato3=Integer.parseInt(JOptionPane.showInputDialog("Dame el tercer numero"));
		if (dato1>=dato2&&dato1>=dato3) {
			texto=dato2>dato3?dato1+", "+dato2 +", "+dato3:dato1+", "+dato3 +", "+dato2;
		}
		else if(dato2>=dato3&&dato2>=dato1) {
			texto=dato1>=dato3?dato2+", "+dato1 +", "+dato3:dato2+", "+dato3 +", "+dato1;
		}
		else if(dato3>=dato2&&dato3>=dato1) {
			texto=dato1>dato2?dato3+", "+dato1 +", "+dato2:dato3+", "+dato2 +", "+dato1;
		}
	JOptionPane.showMessageDialog(null, texto);}}

