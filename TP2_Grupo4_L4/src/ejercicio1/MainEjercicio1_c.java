package ejercicio1;

public class MainEjercicio1_c {
	public static void main(String[] args) {
		//se declaran los objetos
		Profesor prof1 = new Profesor("Jor",35,"Matematicas",5);
		Profesor prof2 = new Profesor("Jor",35,"Matematicas",5);
		
		//se compara si son iguales los hashcodes de ambos objetos
		if(prof1.hashCode()==prof2.hashCode())
			System.out.println("son iguales");
		else {
			System.out.println("no son iguales");
		}
			
				
	}

}


//Ezequiel Rickert
//Joel Traverso
//Ramiro Deocares
//Matias Ledesma
//Laino Federico

