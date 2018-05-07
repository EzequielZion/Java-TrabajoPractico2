package tp2.edu.ar;

import java.util.Scanner;

public class Ejercicio8 {
	
	private static Scanner input;
	static String USUARIO;
	static String CONTRASENA;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input=new Scanner(System.in);
		USUARIO = "user";
		CONTRASENA = "pass";
		
		int Contador = 3;
		System.out.println("Ingrese su usuario y luego su contraseña");
		
		String UsuarioIngresado = input.nextLine();
		String ContrasenaIngresada = input.nextLine();
		
		while (Contador > 1 && (!UsuarioIngresado.equals(USUARIO) || !ContrasenaIngresada.equals(CONTRASENA)))
			{
				Contador--;
				System.out.println("Error, el usuario o contraseña es incorrecto, intente nuevamente");
				System.out.println("Intentos restantes: " + Contador);
				UsuarioIngresado = input.nextLine();
				ContrasenaIngresada = input.nextLine();
			}
		
		if(Contador > 0 && UsuarioIngresado.equals(USUARIO) && ContrasenaIngresada.equals(CONTRASENA))
		{
			System.out.println("Ha ingresado con éxito.");
		}
		else 
		{
			System.out.println("Su cuenta ha sido bloqueada.");	
		}
	input.close();
	}
}
