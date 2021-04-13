package Modelo;

import java.util.ArrayList;

public class ModeloHorarioDisplayDTO {

	private String dia;
	private String horaInicio;
	private String horaFin;


	private int id_horario;
	private ArrayList<ModeloHorarioDisplayDTO> horario;
	
	
	public ModeloHorarioDisplayDTO(String dia, String horaInicio, String horaFin) {
		super();
		
		this.dia = dia;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
	}
	public ModeloHorarioDisplayDTO(int id_horario, ArrayList<ModeloHorarioDisplayDTO> horario) {
		super();
		this.id_horario = id_horario;
		this.horario = horario;
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

	
	

	public int getId_horario() {
		return id_horario;
	}
	public void setId_horario(int id_horario) {
		this.id_horario = id_horario;
	}
	public ArrayList<ModeloHorarioDisplayDTO> getHorario() {
		return horario;
	}
	public void setHorario(ArrayList<ModeloHorarioDisplayDTO> horario) {
		this.horario = horario;
	}
	@Override
	public String toString() {
		return "Horario [dia=" + dia + ", horaInicio=" + horaInicio
				+ ", horaFin=" + horaFin + "]";
	}

	
	
	
	
	
	
	
	
	
}
