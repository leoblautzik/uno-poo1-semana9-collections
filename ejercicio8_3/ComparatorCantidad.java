package ejercicio8_3;

import java.util.Comparator;

public class ComparatorCantidad implements Comparator<Producto> {

	@Override
	public int compare(Producto o1, Producto o2) {
		if(o1.getCantidad()<o2.getCantidad())
			return -1;
		if(o1.getCantidad()>o2.getCantidad())
			return 1;
		return 0;
	}

}
