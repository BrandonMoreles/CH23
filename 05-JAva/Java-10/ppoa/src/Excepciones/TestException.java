package Excepciones;

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Divison d= new Divison(12, 0);
			d.visualizarD();
		} catch (OpException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			
		}
		System.out.println("Continua la ejecucion");
	}

}
