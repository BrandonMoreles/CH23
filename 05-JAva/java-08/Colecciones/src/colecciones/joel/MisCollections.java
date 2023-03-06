package colecciones.joel;

import java.util.*;

public class MisCollections {

	public static void main(String[] args) {
		MisCollections c=new MisCollections();
		//imprimir(c.listaCollection());
		//imprimir(c.setCollection());
		mapCollections();
	}

	private static void mapCollections() {
	Map miMap=new HashMap();
	miMap.put("Key1", "Value1");
	miMap.put("Key2", "Value2");
	miMap.put("Key3", "Value3");
	miMap.put("Key4", "Value4");
	imprimir(miMap.values());
	
	}
	
	
	
	/*Set setCollection() {
		// TODO Auto-generated method stub
		Set miSet=new HashSet();
		miSet.add("uno");
		miSet.add("dos");
		miSet.add("tres");
		miSet.add("cinco");
		miSet.add("cuatro");
		miSet.remove("uno");
		miSet.clear();
		
		return miSet;
	}*/
	
	
	
	
	
	
/*private List listaCollection() {
		List miLista=new ArrayList();
		System.out.println("EL tamaño de la lista es de "+ miLista.size());
		System.out.println("Esta llena? " +!miLista.isEmpty());
		miLista.add(1);
		miLista.add(2);
		miLista.add(3);
		miLista.add(1,"Te quiero");
		miLista.set(2,"hola que tal");
		miLista.remove(0);
		miLista.get(2);
		miLista.contains(1);		
		System.out.println("EL tamaño de la lista es de "+ miLista.size());
		System.out.println("Esta llena? " +!miLista.isEmpty());
		return miLista;
		}*/

static void imprimir(Collection collection) {
	for(Object elementos: collection) {
		System.out.println("La vas a matar perro "+elementos);}
}


	
	
	
	
	
	
	
	
	/* static void wrapperClass() {
		byte numeroB=12;
		System.out.println("Tamaño de un byte "+ Byte.SIZE);
		System.out.println("Valor maximo de un byte "+Byte.MAX_VALUE);
		System.out.println("Valor minimo de un byte "+ Byte.MIN_VALUE);
		System.out.println("--> "+ numeroB);
		System.out.println();
		System.out.println("Integer");
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println();
		System.out.println("Short");
		System.out.println(Short.BYTES);
		System.out.println(Short.SIZE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println();
		System.out.println("Long");
		System.out.println(Long.BYTES);
		System.out.println(Long.SIZE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println();
		System.out.println("Double");
		System.out.println(Double.BYTES);
		System.out.println(Double.SIZE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
	 }*/
	 
	 
	 
	 
	 
}
