//9. Número Palíndromo - Dado un entero x, devuelve truesi x es un palíndromo, , y falsede otro modo .
package easy;

public class numeroPalindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 10;
		int resultadoFinal = numeroPalindromo(numero);
		if (numero == resultadoFinal) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	
	}
	
	
	public static int numeroPalindromo (int num) {		
		int numeroInvertido = 0;
		
		while (num!= 0) {
			int resto = num%10;
			numeroInvertido = numeroInvertido * 10 + resto;	
			num /= 10;
		}
		
		return numeroInvertido;
	}

}




