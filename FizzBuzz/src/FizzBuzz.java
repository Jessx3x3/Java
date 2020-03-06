import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa el número 2, 3, 5 o 15: \n");
		int num = scanner.nextInt();
		
		FizzBuzzTest test = new FizzBuzzTest(); 
		
		test.functionFizzBuzz(num);
		
	}

}

