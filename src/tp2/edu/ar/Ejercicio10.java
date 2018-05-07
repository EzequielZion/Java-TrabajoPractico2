package tp2.edu.ar;
import java.util.Scanner;

public class Ejercicio10 {
	
	private static Scanner input;
	private static int CUOTA_INICIAL = 8500;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	input = new Scanner(System.in);
	int CantEmpresas = 0;
	int MayorFactura = 0;
	int AcumFacturas = 0;
	
	System.out.println("Ingrese el nombre de la empresa (para finalizar, ingrese 'f').");
	
	String Empresa = input.nextLine();
	while (!Empresa.equals("f") && !Empresa.trim().equals(""))
	{
		CantEmpresas++;
		
		System.out.println("Ingrese la cantidad de viajes adicionales que " + Empresa + " realizó en el mes");
		int CantViajes;
		do
		{
			CantViajes = input.nextInt();
			if(CantViajes < 0 || CantViajes > 1000)
			{
				System.out.println("Ingrese una cantidad mayor a 0 y menor a 1000");
			}
		}while(CantViajes < 0 || CantViajes > 1000);
		
		int Factura = CUOTA_INICIAL + CantViajes * 100;
		
		if(CantViajes > 30)
		{
			double Descuento = Factura*0.1;
			Factura = Factura - (int)Descuento;
		}
		
		if(Factura > MayorFactura)
		{
			MayorFactura = Factura;
		}
		
		AcumFacturas += Factura;
		
		System.out.println("La empresa " + Empresa + " debe pagar " + Factura + "\n");

		
		System.out.println("Ingrese la siguiente empresa");
		input.nextLine();
		Empresa = input.nextLine();
	}
	
	if(CantEmpresas > 0)
	{
		int PromedioFacturas = AcumFacturas / CantEmpresas;
		System.out.println("El promedio de facturas del pasado mes fue " + PromedioFacturas);
		System.out.println("La factura más grande fue de " + MayorFactura);
	}
	input.close();	
	}
}
