import java.util.Random;
 
public final class AleatorioUniforme {

	public static void main(String... aArgs){
		AleatorioUniforme uniforme = new AleatorioUniforme();
		int n; // cantidad de datos
		n=10;
		double MEAN = 100.0f; // esto es el promedio 
		double VARIANSA = 5.0f; // que tan lejos esta del promedio
		log("Distribución Normal");
		log(n);

		for (int i = 1; i <= n; i++){

			uniforme.compararHoras("normal");
			log("Nombre" + i + " dia " + uniforme.getNormal(1, 7) + " HoraInicio " + uniforme.horaF + "h HoraF " + uniforme.horaI + "h");
			//log("Nombre" + i + " dia " + uniforme.getNormal(1, 7) + " HoraInicio " + uniforme.getNormal(1, 23) + "h HoraF " + uniforme.getNormal(1, 23) + "h");
		}

		log("Distribución Uniforme");
		log(n);

		for (int i = 1; i <= n; i++){
			uniforme.compararHoras("uniforme");
			log("Nombre" + i + " dia " + uniforme.getDisUniforme(1, 7, 5, 1) + " HoraInicio " + uniforme.getDisUniforme(1, 23, 14, 3) + "h HoraF " + uniforme.getDisUniforme(1, 23, 16.0f, 3.0f) + "h");
		}
	}

	private int horaF, horaI;

	private Random fRandom = new Random();

	private double getUniforme(double aMean, double aVariansa){
		return aMean + fRandom.nextGaussian() * aVariansa;
	}

	private static void log(Object aMsg){
		System.out.println(String.valueOf(aMsg));
	}

	private int getDia(){
		Random dia = new Random();
		return (dia.nextInt(7)+1);

	}

	private int getNormal(int rInicio, int rFinal){
		//recordar que solo puede ser hasta las 24h
		// esto se prodria usar para normal 
		Random hora = new Random();
		//otra alternativa
		//return (int)(((((long)rFinal) - (long)rInicio + 1) * hora.nextDouble()) + rInicio);
		//return (hora.nextInt(24)+1);

		//un metodo mas general podria ser
		return (int)(((((long)rFinal) - (long)rInicio + 1) * hora.nextDouble()) + rInicio);

	}

	private int getDisUniforme(int uInicio, int uFinal, double promedio, double variado){
		//Metodo que me calcula todo para que se haga con uniforme con todos los parametros
		Random dUniforme = new Random();

		//return (int)(((((long)uFinal) - (long)uInicio + 1) * (promedio + dUniforme.nextGaussian() * variado ) ) + uInicio);
		return (int)(promedio + dUniforme.nextGaussian() * variado);

	}

	private void compararHoras(String entr){

		int h1, h2;
		if(entr == "normal"){
			h1 = this.getNormal(1, 23);
			h2 = this.getNormal(1, 23);

			if (h1 == h2) {
				this.horaI = h1;
				this.horaF = h1+1;
				
			}

			if(h1 > h2){

				this.horaI = h1;
				this.horaF = h2;
			}

			else{
				this.horaI = h2;
				this.horaF = h1;
			}

		}

		if (entr == "uniforme") {
			h1 = this.getDisUniforme(1, 23, 14, 2);
			h2 = this.getDisUniforme(1, 23, 14, 2);

			if (h1 == h2) {
				this.horaI = h1;
				this.horaF = h1+1;
				
			}

			if(h1 > h2){

				this.horaI = h1;
				this.horaF = h2;
			}

			else{
				this.horaI = h2;
				this.horaF = h1;
			}
			
		}


	}
}