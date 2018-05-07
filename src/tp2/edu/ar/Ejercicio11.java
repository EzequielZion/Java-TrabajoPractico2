package tp2.edu.ar;
import java.util.Scanner;

public class Ejercicio11 {
	
	private static Scanner input;
	static String A = "a";
	static String B = "b";
	static String C = "c";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	input = new Scanner(System.in);
	int AcumA = 0;
	int AcumB = 0;
	int AcumC = 0;
	int LlamadaMasLarga = 0;
	int CantMenosSeisMinutos = 0;
	int CantLlamadas = 0;
	double AcumCostoLlamada = 0;
	
	System.out.println("Ingrese el código de cliente, uno mayor a 10.000 y menor a 100.000 (para finalizar, ingrese '0').");
	
	int Codigo = input.nextInt();
	while (Codigo != 0)
	{
		if(Codigo > 10000 && Codigo < 100000)
		{
			CantLlamadas++;
			input.nextLine();
			System.out.println("Ingrese el tipo de abono ('a', 'b', 'c').");
			String Abono = input.nextLine();
			while(!Abono.equals("a") && !Abono.equals("b") && !Abono.equals("c"))
			{
				System.out.println("Ingrese una tipo de abono válido");
				Abono = input.nextLine();
			}
			
			System.out.println("Ingrese la duración de la llamada.");
			int DuracionLlamada;
			do
			{
				DuracionLlamada = input.nextInt();
				if(DuracionLlamada < 1)
				{
					System.out.println("Ingrese una cantidad mayor a 0");
				}
			}while(DuracionLlamada < 1);
			
			double Importe = 0;
			
			if(Abono.equals("a"))
			{
				Importe = DuracionLlamada * 2;
				AcumA += Importe;
			}
			else if (Abono.equals("b"))
			{
				if(DuracionLlamada > 5)
				{
					Importe = DuracionLlamada * 1.5;
				}
				else
				{
					Importe = DuracionLlamada * 2;
				}
				AcumB += Importe;
			}
			else if (Abono.equals("c"))
			{
				if(DuracionLlamada > 10)
				{
					Importe = 10;
				}
				else
				{
					Importe = DuracionLlamada * 1;
				}
				AcumC += Importe;
			}
			AcumCostoLlamada += Importe;
			if(DuracionLlamada > LlamadaMasLarga)
			{
				LlamadaMasLarga = DuracionLlamada;
			}
			
			if(DuracionLlamada < 6)
			{
				CantMenosSeisMinutos++;
			}
		}
		else
		{
			System.out.println("Error, ingrese un código válido.");
			input.nextLine();
		}

		System.out.println("Ingrese el siguiente código de llamada.");
		Codigo = input.nextInt();
	}
	if(CantLlamadas > 0)
	{
		int PromedioLlamadas = (int)AcumCostoLlamada / CantLlamadas;
		
		System.out.println("El importe acumulado del abono A fue $" + AcumA + ".");
		System.out.println("El importe acumulado del abono B fue $" + AcumB + ".");
		System.out.println("El importe acumulado del abono C fue $" + AcumC + ".");
		
		System.out.println("La llamada más larga fue de  " + LlamadaMasLarga + " minutos.");

		System.out.println("La cantidad de llamadas de menos de seis minutos fueron " + CantMenosSeisMinutos + ".");

		System.out.println("El precio promedio de las llamadas fue de $" + PromedioLlamadas + ".");
	}
	input.close();	
  }
}

