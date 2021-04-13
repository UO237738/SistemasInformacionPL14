package Modelo;

public class ModeloVerPendientesEntity {
	private int id_contabilidad;
	private int pendiente;
	
	public ModeloVerPendientesEntity(int id_contabilidad, int pendiente) {
		this.id_contabilidad = id_contabilidad;
		this.pendiente = pendiente;
	}

	public int getId_contabilidad() {
		return id_contabilidad;
	}

	public void setId_contabilidad(int id_contabilidad) {
		this.id_contabilidad = id_contabilidad;
	}

	public int getPendiente() {
		return pendiente;
	}

	public void setPendiente(int pendiente) {
		this.pendiente = pendiente;
	}
}
