package ejercicio2;

public class mainEjercicio2 {

	public static void main(String[] args) {
		ProductoFresco pf = new ProductoFresco("05/05/2021", 1, "15/01/2021", "Alemania");
		ProductoRefrigerado pr = new ProductoRefrigerado("16/06/2021", 2, "B#6745");
		ProductoCongelado pc = new ProductoCongelado("20/07/2021", 3, -6.2);
		
		Producto[] productos = new Producto[3];
		productos[0] = pf;
		productos[1] = pr;
		productos[2] = pc;
		
		for (Producto p : productos) {
			System.out.println(p.toString());
		}
	}

}
