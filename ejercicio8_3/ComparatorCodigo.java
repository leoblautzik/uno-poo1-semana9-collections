package ejercicio8_3;

import java.util.Comparator;

public class ComparatorCodigo implements Comparator<Producto> {

	@Override
	public int compare(Producto o1, Producto o2) {
		
		return o1.getCodigo().compareTo(o2.getCodigo());
	}

}
