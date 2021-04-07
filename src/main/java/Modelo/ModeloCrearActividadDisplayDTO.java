package Modelo;

public class ModeloCrearActividadDisplayDTO {
	
	
	private int id_instalacion;
	private String nombre;
	private int aforo;
	private int cuota_socio;
	private int cuota_no_socio;
	private String fechaInicioActividad;
	private String fechaFinActividad;
	private int id_inscripcion;

	
	public int getId_instalacion() {
		return id_instalacion;
	}
	public void setId_instalacion(int id_instalacion) {
		this.id_instalacion = id_instalacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAforo() {
		return aforo;
	}
	public void setAforo(int aforo) {
		this.aforo = aforo;
	}
	public int getCuota_socio() {
		return cuota_socio;
	}
	public void setCuota_socio(int cuota_socio) {
		this.cuota_socio = cuota_socio;
	}
	public int getCuota_no_socio() {
		return cuota_no_socio;
	}
	public void setCuota_no_socio(int cuota_no_socio) {
		this.cuota_no_socio = cuota_no_socio;
	}
	public String getFechaInicioActividad() {
		return fechaInicioActividad;
	}
	public void setFechaInicioActividad(String fechaInicioActividad) {
		this.fechaInicioActividad = fechaInicioActividad;
	}
	public String getFechaFinActividad() {
		return fechaFinActividad;
	}
	public void setFechaFinActividad(String fechaFinActividad) {
		this.fechaFinActividad = fechaFinActividad;
	}
	public int getId_inscripcion() {
		return id_inscripcion;
	}
	public void setId_inscripcion(int id_inscripcion) {
		this.id_inscripcion = id_inscripcion;
	}

	
	public ModeloCrearActividadDisplayDTO() {}
	
	
	public ModeloCrearActividadDisplayDTO(int idInst, String nombre, int aforo,
			int cuotaS, int cuotaNS, String fechaInicioActividad, String fechaFinActividad,
			int idInsc) {
	
		this.id_instalacion = idInst;
		this.nombre = nombre;
		this.aforo = aforo;
		this.cuota_socio = cuotaS;
		this.cuota_no_socio = cuotaNS;
		this.fechaInicioActividad = fechaInicioActividad;
		this.fechaFinActividad = fechaFinActividad;
		this.id_inscripcion = idInsc;
	}
	
	public ModeloCrearActividadDisplayDTO(int idInst, String nombre, int aforo,
			int cuotaS, int cuotaNS, String fechaInicioActividad, String fechaFinActividad) {
	
		this.id_instalacion = idInst;
		this.nombre = nombre;
		this.aforo = aforo;
		this.cuota_socio = cuotaS;
		this.cuota_no_socio = cuotaNS;
		this.fechaInicioActividad = fechaInicioActividad;
		this.fechaFinActividad = fechaFinActividad;
	}
}
