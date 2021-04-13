package Modelo;

public class ModeloContabilidadDisplayDTO {
	private int id_contabilidad;
	private int id_socio;
	private int importe;
	private String descripcion;
	private String pendiente;
	private String fecha;
	
	
	public ModeloContabilidadDisplayDTO(int rowIdC,int rowid_Socio, String rowFecha,
			String rowDescripcion,int rowImporte,String rowPendiente) {
		this.id_contabilidad=rowIdC;
		this.setId_socio(rowid_Socio);
		this.setImporte(rowImporte);
		this.descripcion=rowDescripcion;
		this.pendiente=rowPendiente;
		this.fecha=rowFecha;
	}
	
	public int getId_contabilidad() {
		return id_contabilidad;
	}
	
	public void setId_contabilidad(int id_contabilidad) {
		this.id_contabilidad=id_contabilidad;
	}
	
	public int getId_socio() {
		return id_socio;
	}

	public void setId_socio(int id_socio) {
		this.id_socio = id_socio;
	}
	
	public int getImporte() {
		return importe;
	}

	public void setImporte(int importe) {
		this.importe = importe;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion=descripcion;
	}
	
	public String getPendiente() {
		return pendiente;
	}
	
	public void setPendiente(String pendiente) {
		this.pendiente=pendiente;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public void setFecha(String fecha) {
		this.fecha=fecha;
	}

	
}
