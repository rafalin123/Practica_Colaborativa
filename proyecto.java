package ejercicio_colaborativo;
import java.util.Random;
import java.util.Scanner;
public class Proyecto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);// Esto crea una instancia del Scanner
			Random claseRandom = new Random(); // Esto crea una instancia de la Clase Random
		   
			//Creamos el vector que almacena las temperaturas
			int temp[] = new int[24];	//
			int mayor,menor;
			mayor = menor = temp[0];
// creamos un bucle que no cree las temperaturas de cada hora
		
		for (int i = 0; i < temp.length; i++) //Con este para recorremos todos los elementos del vector temp
		{
			temp[i]=claseRandom.nextInt(40); //Generamos un número aleatorio para cada uno de los elementos del vector
			
			if (temp[i] > mayor) {
				mayor = temp[i];			//En caso de que el elemento sea mayor que el numero mayor se guarda en la variable mayor
			}
			if (temp[i] < menor) {			//Si el valor del elemento es menor que el valor de la variable menor entonces el valor del elemento se guarda en la variable
				menor = temp[i];	
			}
		}
		
		System.out.println("La temperatura mayor es:");
		System.out.println(mayor);
		System.out.println("La temperatura menor es:");
		System.out.println(menor);
		

	}

}
