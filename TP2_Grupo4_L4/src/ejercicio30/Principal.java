package ejercicio30;

import java.util.ArrayList;
import java.util.ListIterator;

public class Principal {

	public static void main(String[] args) {

		ArrayList <IEdificio> Edificios = new ArrayList <IEdificio>(5);
		
		Edificios.add(new Polideportivos(1,1000,"UTN-Polideportivo"));
		Edificios.add(new Polideportivos(2,1500,"UBA-Polideportivo"));
		Edificios.add(new Polideportivos(3,2000,"UCES-Polideportivo"));
		Edificios.add(new Oficinas5(50,250));
		Edificios.add(new Oficinas5(150,350));
		
		ListIterator<IEdificio> it = Edificios.listIterator();
		while(it.hasNext())
		{
			IEdificio edificio = it.next();
			it.remove();
			System.out.println(edificio.toString());
		}
	}

}
