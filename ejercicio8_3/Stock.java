package ejercicio8_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Stock {
	private List<Producto> listaProductos;
	
	public Stock() {
		listaProductos = new ArrayList<Producto>();
	}
	
	public void agregar(Producto p) {
		listaProductos.add(p);
	}
	
	public void listar() {
		for(Producto cadaUno : listaProductos)
			System.out.println(cadaUno);
		
	}
	
	public Producto productoEnK(int k) {
		return listaProductos.get(k);		
	}
	
	public int buscarPorCodigo(Integer cod) {
		int posicion=0;
		for(Producto cadaUno : listaProductos) {
			if(cadaUno.getCodigo().equals(cod))
				return posicion;
			posicion++;

		}
		return -1;
	}

	public void incrementarPrecio(Integer cod) {
		int pos = buscarPorCodigo(cod);
		if (pos>=0) {
			productoEnK(pos).setImporte(productoEnK(pos).getImporte()*1.1);
		}else
			System.out.println("Codigo inexistente");
					
	}			
	
	public int stockProducto(Producto p) {
		int pos = listaProductos.indexOf(p);
		if (pos>=0) {
			return listaProductos.get(pos).getCantidad();
		}
		return 0;
	}

	public List<Producto> productosConMenosDe(int n){
		List<Producto> listAux = new ArrayList<Producto>();
		for(Producto cadaUno : listaProductos)
			if(cadaUno.getCantidad()<n)
				listAux.add(cadaUno);
		return listAux;
		
		
	}
	public List<Producto> productosConMasDe(int n){
		List<Producto> listAux = new ArrayList<Producto>();
		for(Producto cadaUno : listaProductos)
			if(cadaUno.getCantidad()>=n)
				listAux.add(cadaUno);
		return listAux;
		
		
	}
	
	public void ordenarPorCodigo() {
		ComparatorCodigo comparadorPorCodigo = new ComparatorCodigo();
		Collections.sort(listaProductos,comparadorPorCodigo);
	}
	
	public void ordenarPorCantidad() {
		ComparatorCantidad comparadorPorCantidad = new ComparatorCantidad();
		Collections.sort(listaProductos,comparadorPorCantidad);
	}
}


