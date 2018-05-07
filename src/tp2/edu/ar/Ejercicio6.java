package tp2.edu.ar;

import java.util.Scanner;

public class Ejercicio6 {
	
	private static Scanner input;
	
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		int Serie = 1;
		int Acum = 0;
		int Prom = 0; 
		
		System.out.println("Ingrese una serie de números. Se leerán hasta que el promedio entre ellos sea menor a 20");
		int Num = input.nextInt();
		Acum += Num;
	    Prom = Acum / Serie;
	    
		while (Prom < 20)
		{
			Serie++;
			Acum += Num;
		    Prom = Acum / Serie;
			System.out.println("Ingrese otro número");
			Num = input.nextInt();

		}

		
		System.out.println("La cantidad de valores ingresados fue de " + Serie);
	
	}
}
