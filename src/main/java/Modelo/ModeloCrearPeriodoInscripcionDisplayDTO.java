package Modelo;

public class ModeloCrearPeriodoInscripcionDisplayDTO {

	private int id_periodoInscrip;
	private String iniSocios;
	private String finSocios;
	private String finNoSocios;
	public int getId_periodoInscrip() {
		return id_periodoInscrip;
	}
	public void setId_periodoInscrip(int id_periodoInscrip) {
		this.id_periodoInscrip = id_periodoInscrip;
	}
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
	public ModeloCrearPeriodoInscripcionDisplayDTO(int id_periodoInscrip, String iniSocios, String finSocios,
			String finNoSocios) {
		super();
		this.id_periodoInscrip = id_periodoInscrip;
		this.iniSocios = iniSocios;
		this.finSocios = finSocios;
		this.finNoSocios = finNoSocios;
	}
	@Override
	public String toString() {
		return "ModeloCrearPeriodoInscripcionDisplayDTO [id_periodoInscrip=" + id_periodoInscrip + ", iniSocios="
				+ iniSocios + ", finSocios=" + finSocios + ", finNoSocios=" + finNoSocios + "]";
	}
	
	
	
}
