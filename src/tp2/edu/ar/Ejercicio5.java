package tp2.edu.ar;

import java.util.Scanner;

public class Ejercicio5 {
	
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("Ingrese 2 número positivos");
		int num1 = input.nextInt();
		System.out.println("Ingrese el segundo número");
		int num2 = input.nextInt();
		if(num1 > 0 & num2 > 0){
			int multi = num1 * num2;
			for(int secu = num1 ; secu <= multi ; secu += num1){
				System.out.println(secu);
				
			}
		}
		else{
			System.out.println("Ingrese un número válido");
		}
	}

}
