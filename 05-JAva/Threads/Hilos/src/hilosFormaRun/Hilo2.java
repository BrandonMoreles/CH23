package hilosFormaRun;

import java.util.Iterator;

public class Hilo2 implements Runnable{
	private String nombre;
	public Hilo2(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	@Override
	public void run() {
		System.out.println("Comienza el run "+this.getNombre());
		for (int i = 0; i < 10; i++) {
			System.out.println(i +" "+nombre);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
