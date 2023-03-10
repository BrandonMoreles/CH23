package Clases;

import java.util.concurrent.Flow.Publisher;

public abstract class FigurasGeometricas {
	private String nombre;
	public FigurasGeometricas(String nombre) {
		this.nombre=nombre;
	}
	
	@Override
	public String toString() {
		return "FigurasGeometricas [nombre=" + nombre + ", areas()=" + areas() + "]";
	}

	public abstract double areas();
	
	public abstract void pedirDatos();
}
