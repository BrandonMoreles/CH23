package testHilos;

import hilosFormaThread.Hilo1;

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread h= new Hilo1("YoMero");
		h.start();
		Thread h1=new Hilo1("Pepe");
		h1.start();
		Thread h2=new Hilo1("Arnold");
		h2.start();
	
	System.out.println(h.getState());
	}

}
