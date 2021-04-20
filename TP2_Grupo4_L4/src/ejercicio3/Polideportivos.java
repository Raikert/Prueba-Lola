package ejercicio3;

public class Polideportivos implements IDeportiva, IEdificio {

	private int tipo;
	private double superficie;
	private String nombre;
	
	public Polideportivos(int tipo, double superficie, String nombre) {
		
		this.tipo = tipo;
		this.superficie = superficie;
		this.nombre = nombre;
	}
	
	public int getTipoDeInstalacion() {
		return tipo;
	}
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public double getSuperficieEdificio() {
		return superficie;
	}
	
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Polideportivo: Tipo=" + tipo + ", superficie=" + superficie + ", nombre=" + nombre;
	}
}
