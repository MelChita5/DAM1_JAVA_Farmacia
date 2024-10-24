package actividadUND3_1;

import java.time.LocalDate;
import java.util.ArrayList;

public class ProductoTopico extends ProductoGeneral{
	
	private String pao; //?M = 6M = 6 meses | Period After Opening
	private String consistencia; // (solución, loción, crema, bálsamo o pomada) | cantidad limitada
	private String aplicacion;// (cuero cabelludo, cara, cuerpo, manos, etc ....) | longitud variable poreso es arraylist
	
	public ProductoTopico(int id, String nombre, double precio, int cantidad, String unidades, LocalDate fechaCaducidad,
			String pao, String consistencia, String aplicacion) {
		super(id, nombre, precio, cantidad, unidades, fechaCaducidad);
		this.pao = pao;
		this.consistencia = consistencia;
		this.aplicacion = aplicacion;
	}

	public String getPao() {
		return pao;
	}

	public void setPao(String pao) {
		this.pao = pao;
	}

	public String getConsistencia() {
		return consistencia;
	}

	public void setConsistencia(String consistencia) {
		this.consistencia = consistencia;
	}

	public String getAplicacion() {
		return aplicacion;
	}

	public void setAplicacion(String aplicacion) {
		this.aplicacion = aplicacion;
	}
	
	
	
	
	
	
}
