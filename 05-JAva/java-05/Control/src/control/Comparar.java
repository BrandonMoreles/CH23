package control;

import javax.lang.model.element.Element;
import javax.swing.JOptionPane;

public class Comparar {
		public void compara(){
			int dato1=Integer.parseInt(JOptionPane.showInputDialog("Dame el valor numero 1"));
			int dato2=Integer.parseInt(JOptionPane.showInputDialog("Dame el valor numero 2"));
			String texto=dato1>dato2?"El dato uno es mayor, el dos menor":"El dato dos es mayor, el uno menor";
			JOptionPane.showMessageDialog(null, texto);
		}
}
