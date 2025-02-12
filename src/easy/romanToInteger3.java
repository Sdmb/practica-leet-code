package easy;

import java.util.Scanner;

public class romanToInteger3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el numero romano");
		String numeroRomano = entrada.nextLine();
		int resultado = romanToInteger3(numeroRomano);
		System.out.println("Numero entero : " + resultado);
		/*String numeroRomano = "III";
		int resultado = romanToInteger3(numeroRomano);
		System.out.println(resultado);*/
		
	}
	
	public static int romanToInteger3(String numeroRomano) {
		
		int resultado =0;		
		int valorAnterior =0;
		
		for (int i = numeroRomano.length()-1; i >=0  ; i--) {
			int valorActual = romanoANatural(numeroRomano.charAt(i));
			
			if (valorActual < valorAnterior) {
				resultado -= valorActual;
				valorAnterior = valorActual;
			} else {
				resultado += valorActual;
				valorAnterior = valorActual;
			}		
		}		
		
		return resultado; 
	}
	
	
	public static int romanoANatural(char romano) {
		int natural = 0;
		switch (romano) {			
			case 'I':natural = 1;			
				break;
			case 'V':natural = 5;			
				break;
			case 'X':natural = 10;			
				break;
			case 'L':natural = 50;			
				break;		
			case 'C':natural = 100;			
				break;
			case 'D':natural = 500;			
				break;
			case 'M':natural = 1000;			
				break;
	
			default:
				break;
		}
		return natural;
	}
	
	
	
	
}
