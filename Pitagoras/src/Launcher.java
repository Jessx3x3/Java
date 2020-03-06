import java.util.Scanner;

public class Launcher {


	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa el número double de a: ");
		double a = scanner.nextDouble();
		System.out.println("Ingresa el número double de b: ");
		double b = scanner.nextDouble();
		
		System.out.println("\nHipotenusa para valores:\n \nA:"+a+"\nB:"+b+"\n");
		
		functionPitagoras(a , b);
		
	}
	
	public static double functionPitagoras(double a, double b) {
		double result = 0;
		
		result = (double)Math.sqrt(a*a+b*b); 
		System.out.println("Hipotenusa: "+result);
		
		return result;

	}

}
