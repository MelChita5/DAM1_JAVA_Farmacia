package actividadUND3_1;


import java.util.ArrayList;

public class Farmacia {

	private String nombre;
	private Direccion direccion; 
	private ArrayList<ProductoOral> productosOrales = new ArrayList<>(); 
	private ArrayList<ProductoTopico> productosTopicos = new ArrayList<>(); 
	
	public Farmacia(String nombre, Direccion direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	
		
	public ArrayList<ProductoOral> getProductosOrales() {
		return productosOrales;
	}

	public void setProductosOrales(ArrayList<ProductoOral> productosOrales) {
		this.productosOrales = productosOrales;
	}

	public ArrayList<ProductoTopico> getProductosTopicos() {
		return productosTopicos;
	}

	public void setProductosTopicos(ArrayList<ProductoTopico> productosTopicos) {
		this.productosTopicos = productosTopicos;
	}
	
	
	
}
