package pruebas;

import java.util.*;

public class Pruebas {
	public static void main(String[] args) {

		// creo las variables y pido los datos al usuario
		String introd;
		int casillas, posicion, tirada;
		Scanner entrada = new Scanner(System.in);
		int madremia;
		do {
			introd = entrada.nextLine();
		} while (!introd.equals("0 0 0"));
		entrada.close();

		// Creo un array tipo string donde separo los números
		// Luego los introduzco en un array int para convertirlos de String a int
		String[] array = introd.split(" ");
		int[] arrayint = new int[3];
		for (int i = 0; i < 3; i++) {
			arrayint[i] = Integer.parseInt(array[i]);
		} // Cierre bucle for arrayint

		// Paso los datos del array a variables por comodidad
		casillas = arrayint[0];
		posicion = arrayint[1];
		tirada = arrayint[2];

		// Compruebo que el jugador está dentro del tablero
		if (posicion > casillas) {
			System.err.println("Estás fuera del tablero.");
		} // Cierre bucle if fuera del tablero

		if (posicion + tirada > casillas) {
			posicion = casillas - posicion; // la posicion vale la resta
			tirada = tirada - posicion; // Mira lo que tiene que retroceder
			posicion = casillas; // igual la posicion al maximo
			posicion = posicion - tirada;
			System.out.print(posicion);
		} else
			posicion = posicion + tirada; // Si la tirada + posicion no se pasa de las casillas, actualiza la posicion
		System.out.println(posicion);
	} // Cierre main
} // Cierre clase
