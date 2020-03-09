package cadenas;

public class Main {

	public static void main(String[] args) {
		
		//1
		StringManipulator manipulator = new StringManipulator();
		String str = manipulator.trimAndConcat("    Hola     ","     Mundo    ");
		System.out.println(str);
		
		
		//2
		char letter = 'n';
		Integer a = manipulator.getIndexOrNull("Coding", letter);
		Integer b = manipulator.getIndexOrNull("Hola Mundo", letter);
		Integer c = manipulator.getIndexOrNull("Saludar", letter);
		
		if(c < 0) {
			c = null;
		}
		
		System.out.println(a); // 4
		System.out.println(b); // 7
		System.out.println(c); // null
	
		
		//3
		String word = "Hola";
		String subString = "la";
		String notSubString = "mundo";
		Integer cad_1 = manipulator.getIndexOrNullStringtoString(word, subString);
		Integer cad_2 = manipulator.getIndexOrNullStringtoString(word, notSubString);
		
		if(cad_2 < 0) {
			cad_2 = null;
		}
		
		System.out.println(cad_1); // 2
		System.out.println(cad_2); // null
		
		
	    //4
		String palabra = manipulator.concatSubstring("Hola", 1, 2, "mundo");
		System.out.println(palabra);
		
	}


}
