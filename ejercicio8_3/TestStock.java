package ejercicio8_3;

import java.util.List;

public class TestStock {

	public static void main(String[] args) {
		
		Producto mouse = new Producto(100,"Mouse",300,50);
		Producto monitor = new Producto(34,"Monitor",12000,5);
		Producto ryzen = new Producto(145,"Ryzen",8080,10);
		Producto teclado = new Producto(111,"Teclado",500,150);
		
		Stock informatica = new Stock();
		informatica.agregar(mouse);
		informatica.agregar(monitor);
		informatica.agregar(ryzen);
		informatica.agregar(teclado);
		
		informatica.listar();
		System.out.println(informatica.productoEnK(2));
		System.out.println(informatica.buscarPorCodigo(340));
		
		informatica.incrementarPrecio(145);
		informatica.listar();
		System.out.println(informatica.stockProducto(teclado));
		
		List<Producto> listaMenosDe = informatica.productosConMenosDe(50);
		for(Producto cadaUno : listaMenosDe)
			System.out.println(cadaUno);
		
		List<Producto> listaMasDe = informatica.productosConMasDe(50);
		for(Producto cadaUno : listaMasDe)
			System.out.println(cadaUno);
		
		
		informatica.incrementarPrecio(111);
		informatica.ordenarPorCodigo();
		informatica.listar();
		
		

	}

}
