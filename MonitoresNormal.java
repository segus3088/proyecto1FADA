import java.util.Random;

public final class MonitoresNormal.java {

	public static void main(String[] args) {
		
		MonitoresNormal normalR = new MonitoresNormal();
		int n; //Cantidad de Datos a generar

		n = Int.parseInt(args[0]); // con esto tomo por consola la cantidade Datos a generar

		log(n);

	}

	private int horaI, horaF;

	private Random fRandom = new Random(); // Creo el objeto para hacer el random

	private static void log(Object aMensajito){
		System.out.println(String.valueOf(aMensajito));
	}
}