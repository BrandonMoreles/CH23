package mains;

import clases.AraPerimetro;
import clases.FigGeo;

public class TstFiguras {
	public static void main(String[] args) {
		AraPerimetro ap=new AraPerimetro();
		FigGeo fig=new FigGeo();
		
		fig.setArea(ap.area(5));
		System.out.println(fig.getArea());
		
		System.out.println(ap.areaCirculo(5));
	}
}
