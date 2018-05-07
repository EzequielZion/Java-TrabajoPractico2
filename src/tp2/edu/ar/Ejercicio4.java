package tp2.edu.ar;

import java.util.Scanner;

public class Ejercicio4 {
	
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("Ingrese 2 números donde el primero sea menor o igual al segundo");
		int num1 = input.nextInt();
		System.out.println("Ingrese el segundo número");
		int num2 = input.nextInt();
		if(num1 <= num2){
			for(int sec = num1 ; sec <= num2; sec++){
				System.out.print(sec);
				
			}
			for(int secb = num2-1 ; secb > num1 ; secb--){
				System.out.println(secb);
			}
		}
		else{
			System.out.println("La relación entre los 2 números es incorrecta");
		}
	}

}
