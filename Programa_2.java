import java.util.Scanner;
public class Programa_2 {

	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente
		Scanner in= new Scanner(System.in);
		int vueltas=0;
		long tiempo = System.currentTimeMillis();
		float porcentaje, plutonio=1;
		
		System.out.println("Introduzca el porcentaje que desea que quede del is�topo de plutonio");
		porcentaje = in.nextFloat();
		do {
			while ((System.currentTimeMillis()-tiempo)<(26*60*1000));
			plutonio /= 2f;
			vueltas++;
		}
		while((plutonio*100)>porcentaje);
		System.out.printf("El tiempo de vida m�s cercano es %d minutos",(26*vueltas));
		
	}

}
