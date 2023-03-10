package clases;

public class AraPerimetro {
	public double area(double lado) {
		double area=lado*lado;
		return area;
	}
	public double perimetro(double lado) {
		double perimetro=lado*4;
		return perimetro;
	}
	public double AreaTriangle(int base,int altura) {
		return (base*altura)/2;	
	}
	public double perimetroTriangle(int ladoA,int ladoB,int ladoC) {
		return(ladoA+ladoB+ladoC);
	}
	public double areaCirculo(double diametro) {
		return(Math.pow((diametro/2),2)*Math.PI);
	}
	public double perimetroCirculo(double diametro) {
		return Math.PI*diametro;
	}
}
