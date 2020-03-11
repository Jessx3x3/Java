import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {

	public void mayoresValores(ArrayList<Integer> array, int num) {
		
		int suma = 0;	
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		
		for (int i = 0; i < array.size(); i++) {
			suma+=array.get(i);
			if(array.get(i)>num) {
				myNumbers.add(array.get(i));
			}
		}
		System.out.println("Array mayor a:"+num+" ["+myNumbers);
		System.out.println("Suma de valores: "+suma);
	}
	
	public void arregloNombres(ArrayList<String> array) {
		
		System.out.println(array);
		
		ArrayList<String> names = new ArrayList<String>();
		
		for (int i = 0; i < array.size(); i++) {
			if(array.get(i).length()>5){
				names.add(array.get(i));
			}
		}
		System.out.println("Nombre más de: "+5+" caracteres: ["+names+"]");
	}
	
	public void alfabeto() {
		
		ArrayList<Character> abc = new ArrayList<Character>();
		
		for ( int i=0; i<26; i++) {
			abc.add((char) ('A' + i ));
		}
		
		Collections.shuffle(abc);
		
		System.out.println(abc);
		
		System.out.println("La primera letra: "+abc.get(0));
		
		if(abc.get(0)=='A' || abc.get(0)=='E' || abc.get(0)=='I'|| abc.get(0)=='O'|| abc.get(0)=='U') {
			System.out.println("Obtuvíste una vocal: "+abc.get(0));
		}
		
		System.out.println("La última letra: "+abc.get(25));
		
	}
	
	public void arregloRandom(int desde, int hasta) {
		
		Random numAleatorio = new Random();
		
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			myNumbers.add(numAleatorio.nextInt(desde)+hasta);
		}
		System.out.println(myNumbers);
		
	}
	
	public void randomOrder(int desde, int hasta) {
		
		Random numAleatorio = new Random();
		
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		
		int min = 0;
		int max = 0;
		
		for (int i = 0; i < 10; i++) {
			myNumbers.add(numAleatorio.nextInt(desde)+hasta);
		}
		Collections.sort(myNumbers);
		System.out.println(myNumbers);
		System.out.println("Valor mínimo: "+myNumbers.get(0));
	}
	
	public void cadenaCaracteres() {
		
		ArrayList<Character> abc = new ArrayList<Character>();
		
		Random r = new Random();
		
		String alphabet = "abcdefghijklmnopqrstuwxyz";
		
		 for (int i = 0; i < 5; i++) {
			
			abc.add(alphabet.charAt(r.nextInt(alphabet.length())));
		     
		 }
		 
		System.out.println(abc);
		
	}
	
	public void crearCadenasCaracteres() {
		
		ArrayList<Character> abc = new ArrayList<Character>();
		
		Random r = new Random();
		
		String alphabet = "abcdefghijklmnopqrstuwxyz";
		
		char cadena = 0;

		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < 10; j++) {
				abc.add(alphabet.charAt(r.nextInt(alphabet.length())));
			}
		     
		 }
			System.out.println(abc);
			
			System.out.println("Tamaño: "+abc.size());
	}
	
	
	
	
}
