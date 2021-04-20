package ejercicio1;

import java.util.Iterator;
import java.util.TreeSet;



public class MainEjericio1_b {
	public static void main(String[] args) {
		
		
		//declaracion del TreeSet
		TreeSet<Profesor> listaProfesores = new TreeSet<Profesor>();
		//creacion de los objetos
		Profesor prof1 = new Profesor("Jor",35,"Matematicas",5);
		Profesor prof2 = new Profesor("Jor",35,"Matematicas",5);
		Profesor prof3 = new Profesor("Fernando",40,"Historia",10);
		Profesor prof4 = new Profesor("Maria",32,"Programacion",7);
		Profesor prof5 = new Profesor("Carolina",36,"Estadistica",2);
		//se agregan los objetos al TreeSet
		listaProfesores.add(prof1);
		listaProfesores.add(prof2);
		listaProfesores.add(prof3);
		listaProfesores.add(prof4);
		listaProfesores.add(prof5);
		
		//mostrado de los elementos del TreeSet ya ordenados
		Iterator<Profesor> it = listaProfesores.iterator();
		while(it.hasNext())
		{
			Profesor p = (Profesor) it.next();
			System.out.println(p.toString());
		}
		

		}
		
		



		
	


}

//Ezequiel Rickert
//Joel Traverso
//Ramiro Deocares
//Matias Ledesma
//Laino Federico