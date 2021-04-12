package Modelo;

public class ModeloSocioVerReservasEntity {

	private int id_reserva;
	private String fechaIni;
	private String fechaFin;
	private int id_actividad;
	private int id_instalacion;
	private String hora_ini;
	private String hora_fin;
	private int id_socio;
	
	
	
	public ModeloSocioVerReservasEntity(int id_reserva, String fechaIni, String fechaFin, int id_actividad,
			int id_instalacion, String hora_ini, String hora_fin, int id_socio) {
		super();
		this.id_reserva = id_reserva;
		this.fechaIni = fechaIni;
		this.fechaFin = fechaFin;
		this.id_actividad = id_actividad;
		this.id_instalacion = id_instalacion;
		this.hora_ini = hora_ini;
		this.hora_fin = hora_fin;
		this.id_socio = id_socio;
	}
	public int getId_reserva() {
		return id_reserva;
	}
	public void setId_reserva(int id_reserva) {
		this.id_reserva = id_reserva;
	}
	public String getFechaIni() {
		return fechaIni;
	}
	public void setFechaIni(String fechaIni) {
		this.fechaIni = fechaIni;
	}
	public String getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}
	public int getId_actividad() {
		return id_actividad;
	}
	public void setId_actividad(int id_actividad) {
		this.id_actividad = id_actividad;
	}
	public int getId_instalacion() {
		return id_instalacion;
	}
	public void setId_instalacion(int id_instalacion) {
		this.id_instalacion = id_instalacion;
	}
	public String getHora_ini() {
		return hora_ini;
	}
	public void setHora_ini(String hora_ini) {
		this.hora_ini = hora_ini;
	}
	public String getHora_fin() {
		return hora_fin;
	}
	public void setHora_fin(String hora_fin) {
		this.hora_fin = hora_fin;
	}
	public int getId_socio() {
		return id_socio;
	}
	public void setId_socio(int id_socio) {
		this.id_socio = id_socio;
	}
	
	
	
}
