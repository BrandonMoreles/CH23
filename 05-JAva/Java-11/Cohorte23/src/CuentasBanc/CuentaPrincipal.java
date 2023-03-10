package CuentasBanc;

import java.util.Scanner;

public class CuentaPrincipal {
	private float Saldo=0;
	private int NumConsig=0;
	private int NumRetiros=0;
	private float TasaAnual;
	private float ComisionMensual;
	private boolean activo; 

	Scanner scan=new Scanner(System.in);
	
	
	public CuentaPrincipal(float saldo, int numConsig, int numRetiros, float tasaAnual, float comisionMensual,
			boolean activo, Scanner scan) {
		super();
		Saldo = saldo;
		NumConsig = numConsig;
		NumRetiros = numRetiros;
		TasaAnual = tasaAnual;
		ComisionMensual = comisionMensual;
		this.activo = activo;
		this.scan = scan;
	}
	
	
	
	

	public boolean isActivo() {
		return(Saldo>=10000?true:false);
	}





	public void setActivo(boolean activo) {
		this.activo = activo;
	}





	public float getSaldo() {
		return Saldo;
	}
	public void setSaldo(float saldo) {
		Saldo = saldo;
	}
	public int getNumConsig() {
		return NumConsig;
	}
	public void setNumConsig(int numConsig) {
		NumConsig = numConsig;
	}
	public int getNumRetiros() {
		return NumRetiros;
	}
	public void setNumRetiros(int numRetiros) {
		NumRetiros = numRetiros;
	}
	public float getTasaAnual() {
		return TasaAnual;
	}
	public void setTasaAnual(float tasaAnual) {
		TasaAnual = tasaAnual;
	}
	public float getComisionMensual() {
		return ComisionMensual;
	}
	public void setComisionMensual(float comisionMensual) {
		ComisionMensual = comisionMensual;
	} 
	
	public void consignar() {
		if(activo) {
		System.out.print("Digite la cantidad a ingresar");
		Saldo+=scan.nextFloat();
		NumConsig+=1;}else {System.out.println("Tu cuenta esta inactiva");}
	} 
	public void retirar() {
		if(Saldo>=10000) {
		System.out.print("Digite la cantidad a retirar");
		Saldo-=scan.nextFloat();}else {System.out.println("Cuenta inactiva");}
		NumRetiros+=1;
	}
	public void calcular() {
		System.out.println("Imprima la taza mensual");
		TasaAnual=scan.nextFloat();
		
	}
	
	public void extracto() {
		if(NumRetiros>4) {
			ComisionMensual+=(NumRetiros-4*1000);
		}
	}
	
}
