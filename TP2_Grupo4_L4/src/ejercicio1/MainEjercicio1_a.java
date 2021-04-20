package ejercicio1;

import java.util.ArrayList;
import java.util.ListIterator;



public class MainEjercicio1_a {
	
	public static void main(String[] args) {
		//declaracion de los objetos
		Profesor prof1 = new Profesor("Jor",35,"Matematicas",5);
		Profesor prof2 = new Profesor("Jor",35,"Matematicas",5);
		Profesor prof3 = new Profesor("Fernando",40,"Historia",10);
		Profesor prof4 = new Profesor("Maria",32,"Programacion",7);
		Profesor prof5 = new Profesor("Carolina",36,"Estadistica",2);
		//declaracion del arraylist
		ArrayList<Profesor>listaprofesores= new ArrayList<Profesor>();
		//se agregan los objetos al arraylist
		listaprofesores.add(prof1);
		listaprofesores.add(prof2);
		listaprofesores.add(prof3);
		listaprofesores.add(prof4);
		listaprofesores.add(prof5);
		//mostrado de los elementos del Arraylist atraves de un iterator 
		ListIterator<Profesor> it = listaprofesores.listIterator();
		while (it.hasNext()) {
			Profesor profesor = it.next();
			System.out.println(profesor.toString());
		}
		
		



		
	}


}

//Ezequiel Rickert
//Joel Traverso
//Ramiro Deocares
//Matias Ledesma
//Laino Federico
