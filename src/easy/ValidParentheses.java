package easy;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena = "([])";
		
		
		if (cantidadParentesisAbiertos(cadena) == cantidadParentesisCerrados(cadena) && cantidadCorchetesAbiertos(cadena) == cantidadCorchetesCerrados(cadena) && cantidadLlavesAbiertas(cadena)== cantidadLlavesCerradas(cadena) ) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		

	}
	
	
	public static int cantidadParentesisAbiertos(String cad) {
		int cantParentesisAbiertos = 0;
		for (int i = 0; i < cad.length(); i++) {
			if (cad.charAt(i) == '(') {
				cantParentesisAbiertos++;
				}
		}
		return cantParentesisAbiertos;
	}
	
	public static int cantidadParentesisCerrados(String cad) {
		int cantParentesisCerrados = 0;
		for (int i = 0; i < cad.length(); i++) {
			if (cad.charAt(i) == ')') {
				cantParentesisCerrados++;
				}
		}
		return cantParentesisCerrados;
	}
	
	public static int cantidadCorchetesAbiertos(String cad) {
		int cantCorchetesAbiertos = 0;
		for (int i = 0; i < cad.length(); i++) {
			if (cad.charAt(i) == '[') {
				cantCorchetesAbiertos++;
				}
		}
		return cantCorchetesAbiertos;
	}
	
	public static int cantidadCorchetesCerrados(String cad) {
		int cantCorchetesCerrados = 0;
		for (int i = 0; i < cad.length(); i++) {
			if (cad.charAt(i) == ']') {
				cantCorchetesCerrados++;
				}
		}
		return cantCorchetesCerrados;
	}
	
	public static int cantidadLlavesAbiertas(String cad) {
		int cantLlavesAbiertas = 0;
		for (int i = 0; i < cad.length(); i++) {
			if (cad.charAt(i) == '{') {
				cantLlavesAbiertas++;
				}
		}
		return cantLlavesAbiertas;
	}
	
	public static int cantidadLlavesCerradas(String cad) {
		int cantLlavesCerradas = 0;
		for (int i = 0; i < cad.length(); i++) {
			if (cad.charAt(i) == '}') {
				cantLlavesCerradas++;
				}
		}
		return cantLlavesCerradas;
	}
	
}




