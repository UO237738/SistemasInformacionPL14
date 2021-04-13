package Modelo;

public class ModeloIncripcionesDisplayDTO {
	private int numero_plazas_disp;
	private String fechaInicioSocios;
	private String fechaFinSocios;
	
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
	
	public ModeloIncripcionesDisplayDTO(int numero_plazas_disp, String fechaInicioSocios,String fechaFinSocios) {
		this.numero_plazas_disp = numero_plazas_disp;
		this.fechaInicioSocios = fechaInicioSocios;
		this.fechaFinSocios = fechaFinSocios;
	}
}
