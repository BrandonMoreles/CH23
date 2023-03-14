package testHilos;

import hilosFormaRun.Hilo2;

public class TestRunnable {
public static void main(String[] args) {
	Hilo2 h=new Hilo2("Pepe");
	Thread st=new Thread(h);
	st.start();
	System.out.println(st.getState());
	new Thread(new Hilo2("Josefo")).start();
	new Thread(new Hilo2("Josefito")).start();
}
}
