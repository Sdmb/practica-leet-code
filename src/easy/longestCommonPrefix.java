package easy;

public class longestCommonPrefix {
	
	public static String buscaPrefijoMasLargo(String [] array) {
		
		if (array == null || array.length == 0) {
			return "";
		}
		
		String prefijo = array[0];
		
		
		for (int i = 1; i < array.length; i++) {
			while (array[i].indexOf(prefijo) != 0) {
				prefijo = prefijo.substring(0, prefijo.length()-1);
				if (prefijo.isEmpty()) return "";
			}
			
		}
		
		return prefijo;
		
	}

}
