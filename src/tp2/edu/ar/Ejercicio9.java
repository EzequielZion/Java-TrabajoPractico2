package tp2.edu.ar;
import java.util.Scanner;

public class Ejercicio9 {
	
	private static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	input = new Scanner(System.in);
	
	System.out.println("Ingrese '+' para sumar, '-' para restar, '*' para multiplicar,"
			+ "'/' para dividir, y '%' para obtener el resto");
	System.out.println("Para finalizar, ingrese 'f'. Tenga en cuenta que no se puede dividir por 0.\n");
	
	String Operacion = input.nextLine();
	while (!Operacion.equals("f"))
	{
		if (Operacion.equals("+") || Operacion.equals("-") || Operacion.equals("*") || Operacion.equals("/") || Operacion.equals("%"))
		{
			System.out.println("Ingrese dos número enteros");
			
			int Num1 = input.nextInt();
			int Num2 = input.nextInt();
		
			if (Operacion.equals("+"))
			{
				int Suma = Num1 + Num2;
				System.out.println("El resultado de la suma es " + Suma);
			}
			else if (Operacion.equals("-"))
			{						
				int Resta;
				Resta = Num1 - Num2;			
				System.out.println("El resultado de la resta es " + Resta);
			}
			else if (Operacion.equals("*"))
			{
				int Multiplicacion = Num1 * Num2;
				System.out.println("El resultado de la multiplicación es " + Multiplicacion);
			}		
			else if (Operacion.equals("/"))
			{
				Double Cociente;
				if (Num2 > 0)
				{
					Cociente = (double)Num1 / Num2;
					System.out.println("El resultado de la división es " + Cociente);
				}
				else 
				{
					System.out.println("No se puede dividir por 0");
				}
			}
			else if (Operacion.equals("%"))
			{
				int Resto;
				Resto = Num1 % Num2;			
				System.out.println("El resultado de la resta es " + Resto);
			}
		}
		else
		{	
			System.out.println("No ingresó una operación válida");
		}
		input.nextLine();
		System.out.println("Ingrese la siguiente operación");
		Operacion = input.nextLine();
	}
	input.close();	
	}
}
