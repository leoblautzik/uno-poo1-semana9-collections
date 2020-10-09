package ejercicio8_3;
/*
Se tiene ordenada por código de producto, una lista 
donde cada Producto, tiene como atributos 
código,  descripción, importe y  stock. 
Implementar métodos para:
A) Imprimir la lista completa.//indistinto
B) Dado un entero k, imprimir el k-ésimo elemento.//ArrayList
C) Incrementar el importe de un producto dado en un 10%. //indistinto
D) Devolver el stock de un producto dado o cero si no esta.// indistinto
E) Devolver una lista de productos con stock inferior a 50 unidades.    
F) Devolver una lista de productos con stock superior o igual a 50 unidades.
G) Imprimir la lista completa Ordenada por código de producto
*/

public class Producto implements Comparable<Producto>{
	private Integer codigo;
	private String descripcion;
	private double importe;
	private int cantidad;
	
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", descripcion=" + descripcion + ", importe=" + importe + ", cantidad="
				+ cantidad + "]";
	}

	public Producto(int codigo, String descripcion, double importe, int cantidad) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.importe = importe;
		this.cantidad = cantidad;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public int compareTo(Producto o) {
			return this.codigo.compareTo(o.codigo);
	}
	
	
	

}
