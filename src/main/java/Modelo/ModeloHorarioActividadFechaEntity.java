package Modelo;

public class ModeloHorarioActividadFechaEntity {
	String fecha;
	String horaIni;
	String horaFin;
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHoraIni() {
		return horaIni;
	}
	public void setHoraIni(String horaIni) {
		this.horaIni = horaIni;
	}
	public String getHoraFin() {
		return horaFin;
	}
	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}
	public ModeloHorarioActividadFechaEntity(String fecha, String horaIni, String horaFin) {
		super();
		this.fecha = fecha;
		this.horaIni = horaIni;
		this.horaFin = horaFin;
	}
	
	
}
