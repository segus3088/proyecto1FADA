import java.util.Random;

public final class MonitoresUniforme {

	public static void main(String[] args) {
		
		MonitoresUniforme normalR = new MonitoresUniforme();
		int n; //Cantidad de Datos a generar

		n = Integer.parseInt(args[0]); // con esto tomo por consola la cantidade Datos a generar

		log(n);
		//Se generan los datos
		for (int i=1; i<=n; i++) {
			//Para optener las horas de forma random
			normalR.getHoras();
			// Ejemplo NombreN dia hI hF
			//log("Nombre" + i + " " + normalR.getUniforme(1, 7) + " " + normalR.horaI + " " + normalR.horaF);
			log("Nombre" + i + " " + normalR.getDia() + " " + normalR.horaI + " " + normalR.horaF);				
		}

	}

	private int horaI, horaF;

	private Random fRandom = new Random(); // Creo el objeto para hacer el random

	private static void log(Object aMensajito){
		System.out.println(String.valueOf(aMensajito));
	}

	private int getUniforme(int inicioRango, int finRango, double promedio, double variado){
		Random dUniforme = new Random();

		return (int)(((((long)finRango) - (long)inicioRango + 1) * dUniforme.nextDouble()) + inicioRango);
	}

	private void getHoras(){
		int h1, h2;
		h1 = this.getUniforme(0,23, 12, 2);
		this.horaI = h1;

		h2 = h1 + this.getNormal(1,8);
		if (h2 < 24) {
			this.horaF = h2;			
		}
		else
			this.horaF = h2 - 24;
		
	}

	private String getDia(){
		int d = getUniforme(1,7, 4, 1);
		

		if (d == 1) {
			return "Lunes";			
		}

		if (d == 2) {
			return "Martes";			
		}

		if (d == 3) {
			return "Miercoles";			
		}

		if (d == 4) {
			return "Jueves";			
		}

		if (d == 5) {
			return "Viernes";			
		}

		if (d == 6) {
			return "Sabado";			
		}

		if (d == 7) {
			return "Domingo";			
		}

		else{
			return "Hola";
		}
		
	}

	private int getNormal(int inicioRango, int finRango){
		Random dNormal = new Random();

		return (int)(((((long)finRango) - (long)inicioRango + 1) * dNormal.nextDouble()) + inicioRango);
	}

}