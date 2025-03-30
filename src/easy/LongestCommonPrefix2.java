package easy;

public class LongestCommonPrefix2 {
	
	public static String longestCommonPrefix(String[] cadena) {
		if(cadena == null || cadena.length==0) return "";
		
		//Tomo la primera cadena como referencia
		String prefijo = cadena[0];
		
		for (int i = 1; i < cadena.length; i++) {
			//Reduzco el prefijo mientras no coincida con el inicio de la cadena actual
			while (cadena[i].indexOf(prefijo) != 0) {
				prefijo = prefijo.substring(0, prefijo.length()-1);
				if (prefijo.isEmpty()) return "";
			}			
		}
		return prefijo;
	}


public static void main(String[]args) {
	String[] words = {"flower", "flow", "flight"};
    System.out.println("Longest Common Prefix: " + longestCommonPrefix(words));
	
	
}

}





