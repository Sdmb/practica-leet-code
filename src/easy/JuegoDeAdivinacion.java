package easy;

import java.util.Random;
import java.util.Scanner;

public class JuegoDeAdivinacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeroSecreto = new Random().nextInt(101);
	    int cantidadIntentosMaxima = 5;
	    Scanner teclado = new Scanner(System.in);
	    int numeroUsuario;
	    int intentos = 1;

	        for (int i = 0; i < cantidadIntentosMaxima ; i++) {
	            System.out.println("INGRESE EL NUMERO SECRETO : ");
	            numeroUsuario = teclado.nextInt();
	            
	            if (numeroUsuario > numeroSecreto) {
	                System.out.println("NRO. ERRONEO - NRO. SECRETO MENOR - INTENTO " + intentos);
	                intentos++;
	                i++;
	            }else if (numeroUsuario < numeroSecreto) {
	                System.out.println("NRO. ERRONEO - NRO. SECRETO MAYOR - INTENTO " + intentos);
	                intentos++;
	                i++;
	            }else{
	                System.out.println("FELICTACIONES - EL NRO. SECRETO ES : " + numeroSecreto);
	                break;
	                }

	            }
	        }


	    }
