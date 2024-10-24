package actividadUND3_1;

import java.time.LocalDate;
import java.util.ArrayList;

public class ProductoOral extends ProductoGeneral {
	
	private boolean conComida; // o en ayunas
	private double dosisMaximaDiaria; // (en las unidades de medida del producto) esto va junto a las unidades del producto. jalar la unidad producto y agregar dosis ???
	
	public ProductoOral(int id, String nombre, double precio, int cantidad, String unidades, LocalDate fechaCaducidad,
			boolean conComida, double dosisMaximaDiaria) {
		super(id, nombre, precio, cantidad, unidades, fechaCaducidad);
		this.conComida = conComida;
		this.dosisMaximaDiaria = dosisMaximaDiaria;
	}

	public boolean isConComida() {
		return conComida;
	}

	public void setConComida(boolean conComida) {
		this.conComida = conComida;
	}

	public double getDosisMaximaDiaria() {
		return dosisMaximaDiaria;
	}

	public void setDosisMaximaDiaria(double dosisMaximaDiaria) {
		this.dosisMaximaDiaria = dosisMaximaDiaria;
	}

	

	
	
	
	
	
	
}
