package clases;

public class FigGeo {
		private double perimetro,area;

		public FigGeo(double perimetro, double area) {
			super();
			this.perimetro = perimetro;
			this.area = area;
		}

		public FigGeo() {
			super();
		}

		public double getPerimetro() {
			return perimetro;
		}

		public void setPerimetro(double perimetro) {
			this.perimetro = perimetro;
		}

		public double getArea() {
			return area;
		}

		public void setArea(double area) {
			this.area = area;
		}
		
}
