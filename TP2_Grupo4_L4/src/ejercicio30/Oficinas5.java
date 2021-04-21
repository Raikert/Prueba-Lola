package ejercicio30;

public class Oficinas5 implements IEdificio {

	private int n_oficinas;
	private double superficie;
	
	public Oficinas5(int n_oficinas, double superficie) {
		
		this.n_oficinas = n_oficinas;
		this.superficie = superficie;
	}
	
	public int getN_oficinas() {
		return n_oficinas;
	}

	public void setN_oficinas(int n_oficinas) {
		this.n_oficinas = n_oficinas;
	}

	public double getSuperficieEdificio() {
		return superficie;
	}
	
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	@Override
	public String toString() {
		return "Oficina: superficie=" + superficie + ", cantidad=" + n_oficinas;
	}
}
