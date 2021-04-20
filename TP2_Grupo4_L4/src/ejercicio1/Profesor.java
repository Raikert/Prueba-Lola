package ejercicio1;

public class Profesor extends Empleado implements Comparable<Profesor> {

	private String Cargo;
	private int antiguedadDocente;
	
	//CONTRUCTORES con super para las propiedades de la clase padre
	public Profesor () {
		super ();
		Cargo= "ninguno";
		antiguedadDocente= 0;
				
	}
	public Profesor(String nombre, int edad,String Cargo,int antiguedadDocente)
	{
		super(nombre,edad);
		this.Cargo = Cargo;
		this.antiguedadDocente = antiguedadDocente;
	
	
	}
	
	//toString usando un super para llamar el toString de la clase padre
	@Override
	public String toString() {
		return super.toString()+ " Profesor Cargo=" + Cargo + ", antiguedad Docente=" + antiguedadDocente + "]";
	}
	
	
	//hashcode para la comparacion de igualdad entre dos objetos llamando tambien al
	//hashcode de su clase padre
	@Override
	public int hashCode() {
		int result=1;
		final int prime=31;
		result += prime*super.hashCode();
		result += prime*((Cargo == null) ? 0 : Cargo.hashCode());
		result += antiguedadDocente;
		return result;
	}
	
	//ordenamiento de mayor a menor basado en la antiguedad del docente
	@Override
	public int compareTo(Profesor o) {
		
		if(o.antiguedadDocente==this.antiguedadDocente)
			return 0;
		if(o.antiguedadDocente<this.antiguedadDocente) {
			return-1;
		}
		return 1;
	}
	
	
	
}

//Ezequiel Rickert
//Joel Traverso
//Ramiro Deocares
//Matias Ledesma
//Laino Federico
