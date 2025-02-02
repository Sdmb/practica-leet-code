/*1. Two Sum : Dada una matriz de números enteros nums y un número entero target,
devuelve los índices de los dos números tales que sument .*/

package easy;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int objetivo = 6;
		int [] lista = {3,3};
		int [] listaDevuelve = new int[2];
		
		for (int i = 0; i < (lista.length) - 1; i++) {
			for (int j = i+1; j < lista.length; j++) {
				if ((lista[i] + lista[j]) == objetivo) {
					listaDevuelve[0] = lista[0];
					listaDevuelve[1] = lista[1];		
						break;
					}
				} 
			}
		
		if (listaDevuelve[0] > 0 && listaDevuelve[1] > 0 ) {
			for (int i = 0; i < listaDevuelve.length; i++) {
				System.out.print(listaDevuelve[i]);				
			}
		} else {
			System.out.println(false);
		}
		
		}
	}









