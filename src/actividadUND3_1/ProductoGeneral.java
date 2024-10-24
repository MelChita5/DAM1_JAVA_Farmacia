package actividadUND3_1;

import java.time.LocalDate;

public class ProductoGeneral {
	
	private int id;
	private String nombre;
	private double precio;
	private int cantidad;
	private String unidades;
	private LocalDate fechaCaducidad;
	
	public ProductoGeneral(int id, String nombre, double precio, int cantidad, String unidades,
			LocalDate fechaCaducidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
		this.unidades = unidades;
		this.fechaCaducidad = fechaCaducidad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getUnidades() {
		return unidades;
	}

	public void setUnidades(String unidades) {
		this.unidades = unidades;
	}

	public LocalDate getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(LocalDate fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	
	
	
	
	
	
	
}
