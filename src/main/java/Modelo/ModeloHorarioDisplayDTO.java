package Modelo;

public class ModeloHorarioDisplayDTO {

	private String dia;
	private String horaInicio;
	private String horaFin;
	
	public ModeloHorarioDisplayDTO(String dia, String horaInicio, String horaFin) {
		super();
		
		this.dia = dia;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}

	

	@Override
	public String toString() {
		return "Horario [dia=" + dia + ", horaInicio=" + horaInicio
				+ ", horaFin=" + horaFin + "]";
	}

	
	
	
	
	
	
	
	
	
}
