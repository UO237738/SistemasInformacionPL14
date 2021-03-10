package Modelo;

public class ModeloCrearPeriodoInscripcionDisplayDTO {

	
	private String iniSocios;
	private String finSocios;
	private String finNoSocios;
	
	
	public String getIniSocios() {
		return iniSocios;
	}
	public void setIniSocios(String iniSocios) {
		this.iniSocios = iniSocios;
	}
	public String getFinSocios() {
		return finSocios;
	}
	public void setFinSocios(String finSocios) {
		this.finSocios = finSocios;
	}
	public String getFinNoSocios() {
		return finNoSocios;
	}
	public void setFinNoSocios(String finNoSocios) {
		this.finNoSocios = finNoSocios;
	}
	public ModeloCrearPeriodoInscripcionDisplayDTO(String iniSocios, String finSocios,
			String finNoSocios) {
		super();
		
		this.iniSocios = iniSocios;
		this.finSocios = finSocios;
		this.finNoSocios = finNoSocios;
	}
	@Override
	public String toString() {
		return "ModeloCrearPeriodoInscripcionDisplayDTO [iniSocios="
				+ iniSocios + ", finSocios=" + finSocios + ", finNoSocios=" + finNoSocios + "]";
	}
	
	
	
}
