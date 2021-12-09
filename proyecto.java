package ejercicio_colaborativo;
import java.util.Random;
import java.util.Scanner;
public class Proyecto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);// Esto crea una instancia del Scanner
			Random claseRandom = new Random(); // Esto crea una instancia de la Clase Random
		   
			//Creamos el vector que almacena las temperaturas
			int temp[] = new int[24];
			int mayor,menor;
			mayor = menor = temp[0];
// creamos un bucle que no cree las temperaturas de cada hora
		
		for (int i = 0; i < temp.length; i++)
		{
			temp[i]=claseRandom.nextInt(40);
			
			if (temp[i] > mayor) {
				mayor = temp[i];
			}
			if (temp[i] < menor) {
				menor = temp[i];	
			}
		}
		
		System.out.println("La temperatura mayor es:");
		System.out.println(mayor);
		System.out.println("La temperatura menor es:");
		System.out.println(menor);
		

	}

}
