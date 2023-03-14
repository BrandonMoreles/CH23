package hilosFormaThread;

public class Hilo1 extends Thread {
	public Hilo1(String name) {
		super(name);
		
	}
	@Override
	public void run() {
		System.out.println("Aqui iniciamos "+this.getName());
		
		for(int i=0;i<=10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		System.out.println("Aqui termina "+this.getName());
	}

	
}
