package Modelo;

public class ModeloIncripcionesDisplayDTO {
	private int id_inscripcion;
	private String nombre;
	private int numero_plazas_disp;
	private String fechaInicioSocios;
	private String fechaFinSocios;
	private String fechaFinNoSocios;
	
	public int getId_inscripcion() {
		return id_inscripcion;
	}
	public void setId_inscripcion(int id_inscripcion) {
		this.id_inscripcion = id_inscripcion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumero_plazas_disp() {
		return numero_plazas_disp;
	}
	public void setNumero_plazas_disp(int numero_plazas_disp) {
		this.numero_plazas_disp = numero_plazas_disp;
	}
	public String getFechaInicioSocios() {
		return fechaInicioSocios;
	}
	public void setFechaInicioSocios(String fechaInicioSocios) {
		this.fechaInicioSocios = fechaInicioSocios;
	}
	public String getFechaFinSocios() {
		return fechaFinSocios;
	}
	public void setFechaFinSocios(String fechaFinSocios) {
		this.fechaFinSocios = fechaFinSocios;
	}
	public String getFechaFinNoSocios() {
		return fechaFinNoSocios;
	}
	public void setFechaFinNoSocios(String fechaFinNoSocios) {
		this.fechaFinNoSocios = fechaFinNoSocios;
	}
	
	public ModeloIncripcionesDisplayDTO(int numero_plazas_disp, String fechaInicioSocios, String fechaFinSocios) {
		this.numero_plazas_disp = numero_plazas_disp;
		this.fechaInicioSocios = fechaInicioSocios;
		this.fechaFinSocios = fechaFinSocios;
	}
	
}
