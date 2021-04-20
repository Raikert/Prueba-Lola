package ejercicio2;

public class ProductoRefrigerado extends Producto {

	private String codigo;
	
	public ProductoRefrigerado() {
		super();
		codigo = "Desconocido";
	}
	
	public ProductoRefrigerado(String fechaCaducidad, int numeroLote, String codigo) {
		super(fechaCaducidad, numeroLote);
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "ProductoRefrigerado [codigo=" + codigo + "]" + " " + super.toString();
	}
	
	
}
