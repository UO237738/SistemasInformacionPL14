package Modelo;

public class ModeloHorarioDisplayDTO {

	private int id_horario;
	private String dia;
	private String horaInicio;
	private String horaFin;
	
	public ModeloHorarioDisplayDTO(int id_Horario, String dia, String horaInicio, String horaFin) {
		super();
		this.id_horario=id_Horario;
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
		return "Horario [id_horario=" + id_horario + ", dia=" + dia + ", horaInicio=" + horaInicio
				+ ", horaFin=" + horaFin + "]";
	}

	public int getId_horario() {
		return id_horario;
	}

	public void setId_horario(int id_horario) {
		this.id_horario = id_horario;
	}
	
	
	
	
	
	
	
	
}
