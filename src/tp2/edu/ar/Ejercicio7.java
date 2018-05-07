package tp2.edu.ar;

import java.util.Scanner;

public class Ejercicio7 {

	private static Scanner input;
	
	public static void main(String[] args) 
	{
		String NombreMejorProm = "";
		double MejorProm = -10;
		input = new Scanner(System.in);

		System.out.println("Ingrese el nombre y los promedios de 10 alumnos\n");

		for (int i=1; i <= 10; i++)
		{
			System.out.println("Ingrese el nombre del alumno " + i);
			String Nombre = input.nextLine();
			System.out.println("Ingrese el la nota del alumno " + i);
			double Promedio = input.nextDouble();
			
			while(Promedio < 0 || Promedio > 10)
			{
				System.out.println("Error, ingrese un promedio válido");
				Promedio = input.nextDouble();
			}
			
			input.nextLine();
			if (Promedio>MejorProm)
			{
				MejorProm = Promedio;
				NombreMejorProm = Nombre;
			}
		}
		System.out.println("El mejor promedio fue del alumno " + NombreMejorProm + ", con un promedio de " + MejorProm);


	
	}
}
