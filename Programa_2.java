import java.util.Scanner;
public class Programa_2 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner in= new Scanner(System.in);
		int vueltas=0;
		long tiempo = System.currentTimeMillis();
		float porcentaje, plutonio=1;
		
		System.out.println("Introduzca el porcentaje que desea que quede del isótopo de plutonio");
		porcentaje = in.nextFloat();
		do {
			while ((System.currentTimeMillis()-tiempo)<(26*60*1000)); //Se espera 26 minutos en caso de que de una vuelta entera y en caso contrario se espera los segundos necesarios hasta que quede el porcentaje deseado
			plutonio /= 2f;  										  //Una vez que pasan los 26 minutos el isotopo de plutonio se divide en la mitad
			vueltas++;
		}
		while((plutonio*100)>porcentaje);							  //el bucle continua hasta que el porcentaje que queda del isotopo sea menor que el introducido por el usuario
		System.out.printf("El tiempo de vida más cercano es %d minutos",(26*vueltas));
		
	}

}
