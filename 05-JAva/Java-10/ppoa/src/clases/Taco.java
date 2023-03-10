package clases;

public class Taco {
	String tipoDeTortillaString,sizeTortilla,guisado;
	int numeroDeTortillas;
	double precio;
	
	public Taco() {
		super();
	}
	public Taco(String tipoDeTortillaString, String sizeTortilla, String guisado, int numeroDeTortillas,
			double precio) {
		super();
		this.tipoDeTortillaString = tipoDeTortillaString;
		this.sizeTortilla = sizeTortilla;
		this.guisado = guisado;
		this.numeroDeTortillas = numeroDeTortillas;
		this.precio = precio;
	}
	public String getTipoDeTortillaString() {
		return tipoDeTortillaString;
	}
	public void setTipoDeTortillaString(String tipoDeTortillaString) {
		this.tipoDeTortillaString = tipoDeTortillaString;
	}
	public String getSizeTortilla() {
		return sizeTortilla;
	}
	public void setSizeTortilla(String sizeTortilla) {
		this.sizeTortilla = sizeTortilla;
	}
	public String getGuisado() {
		return guisado;
	}
	public void setGuisado(String guisado) {
		this.guisado = guisado;
	}
	public int getNumeroDeTortillas() {
		return numeroDeTortillas;
	}
	public void setNumeroDeTortillas(int numeroDeTortillas) {
		this.numeroDeTortillas = numeroDeTortillas;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void subirPrecio(int subida) {
		precio+=subida;
	
	}
	public String ponerSalsa(String salsa) {
		return("Ahora su taco tiene salsa "+ salsa);
	}
	public String preparar(int cantidad) {
		return ("Se han preparado la cantidad de "+cantidad +" tacos de "+guisado+ " con tortilla "+sizeTortilla+ " de "+tipoDeTortillaString);
	}
	public String vender(int cantidad) {
		return ("Usted a vendido la  cantidad de "+cantidad+" tacos a un precio de "+precio+" dando un total de "+(precio*cantidad)+"pesos ganados");
	}

}
