package CuentasBanc;

public class CuentaAhorros extends CuentaPrincipal{
	public CuentaAhorros(float saldo, int numConsig, int numRetiros, float tasaAnual, float comisionMensual) {
		super(saldo, numConsig, numRetiros, tasaAnual, comisionMensual);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void retirar() {
		// TODO Auto-generated method stub
		super.retirar();
	}
	@Override
	public void consignar() {
		// TODO Auto-generated method stub
		super.consignar();
	}
	@Override
	public void calcular() {
		// TODO Auto-generated method stub
		super.calcular();
	}
	@Override
	public void extracto() {
		// TODO Auto-generated method stub
		super.extracto();
	}
}
