package ejercicio2;

public class ProductoCongelado extends Producto{

		private double temperatura;
		
		public ProductoCongelado() {
			super();
			temperatura = 0;
		}
		
		public ProductoCongelado(String fechaCaducidad, int numeroLote, double temperatura) {
			super(fechaCaducidad, numeroLote);
			this.temperatura = temperatura;
		}

		public double getTemperatura() {
			return temperatura;
		}

		public void setTemperatura(double temperatura) {
			this.temperatura = temperatura;
		}

		@Override
		public String toString() {
			return "ProductoCongelado [temperatura=" + temperatura + "°C]" + " " + super.toString();
		}
		
		
}
