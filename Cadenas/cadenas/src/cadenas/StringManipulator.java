package cadenas;

public class StringManipulator {
	
	public String trimAndConcat(String a, String b) {
		
		String cadena = "";
		cadena = a.trim()+b.trim();
		
		return cadena;
	}
	
	public Integer getIndexOrNull(String cadena, char n) {
		
		int value = cadena.indexOf(n);
		
		return value;
		
	}
	
	public Integer getIndexOrNullStringtoString(String cadena, String cadena_2) {
		
		int value = cadena.indexOf(cadena_2);

		return value;
		
	}

	public String concatSubstring(String value, int a, int b, String value_2) {
		
		String cadena = "";
		
		cadena = value.substring(a)+value_2.substring(b);
		
		return cadena;
	}

}
