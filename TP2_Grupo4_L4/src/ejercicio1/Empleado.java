package ejercicio1;

public class Empleado {
	
	static int cont=999;
	private final int id;
	private String nombre;
	private int edad;

	public Empleado()
	{
		cont++;
		nombre="Sin Nombre";
		edad=99;
		id=cont;
	}
	
	public Empleado(String nombre, int edad)
	{
		cont++;
		this.nombre=nombre;
		this.edad=edad;
		id=cont;
	}
	
	public static int DevuelveProximoID()
	{
		return cont+1;
	}

	public String toString() {
		return "El ID del empleado es: " + id + ", su nombre es: " + nombre + ", y su edad es: " + edad;
	}
	

	@Override
	public int hashCode() {
		int result = 1;
		final int prime = 31;
		result += edad * prime;
		result += prime *((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	
	
}

//Ezequiel Rickert
//Joel Traverso
//Ramiro Deocares
//Matias Ledesma
//Laino Federico