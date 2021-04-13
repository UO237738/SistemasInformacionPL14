package Modelo;

public class ModeloCrearPeriodoInscripcionDisplayDTO {

	private int id;
	private String nombre;
	private String iniSocios;
	private String finSocios;
	private String finNoSocios;
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ModeloCrearPeriodoInscripcionDisplayDTO(String nombre, String iniSocios, String finSocios,
			String finNoSocios) {
		super();
		this.nombre = nombre;
		this.iniSocios = iniSocios;
		this.finSocios = finSocios;
		this.finNoSocios = finNoSocios;
	}
	public ModeloCrearPeriodoInscripcionDisplayDTO(int id, String nombre, String iniSocios, String finSocios,
			String finNoSocios) {
		super();
		this.id=id;
		this.nombre = nombre;
		this.iniSocios = iniSocios;
		this.finSocios = finSocios;
		this.finNoSocios = finNoSocios;
	}
	@Override
	public String toString() {
		return "ModeloCrearPeriodoInscripcionDisplayDTO [nombre=" + nombre + ", iniSocios=" + iniSocios + ", finSocios="
				+ finSocios + ", finNoSocios=" + finNoSocios + "]";
	}

	
	
	
	
}
