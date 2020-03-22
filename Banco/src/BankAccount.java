import java.util.Scanner;

public class BankAccount {
	
	String numCta;
	double saldoCta;
	double saldoCtaAhorro;
	static int numCtasCreadas;
	static double cantDineroCtas;
	
	Scanner scanner = new Scanner(System.in);
	
	public void printValues() {
		System.out.println("Número de cuenta: ["+crearCuentas()+"]\n");
	}
	public String getNumCta() {
		return numCta;
	}
	public void setNumCta(String numCta) {
		this.numCta = numCta;
	}
	public double getSaldoCta() {
		return saldoCta;
	}
	public void setSaldoCta(double saldoCta) {
		this.saldoCta = saldoCta;
	}
	public double getSaldoCtaAhorro() {
		return saldoCtaAhorro;
	}
	public void setSaldoCtaAhorro(double saldoCtaAhorro) {
		this.saldoCtaAhorro = saldoCtaAhorro;
	}
	public void menu() {
		
		System.out.println("[1].-Crear Cuentas\n[2].-Ingresar Monto de Dinero \n[3].-Retirar Mondo de Dinero\n");
		System.out.println("Ingrese opción del menú\n");
		int value = scanner.nextInt();
		
		switch (value) {
		case 1:
			printValues();
			menu();
		case 2:
			ingresarDinero();	
			menu();
		case 3:
			retirarDinero();
			menu();
		default:
			System.err.println("\nNúmero errado, intentar otra vez\n");
			menu();
		}
	}
	private String crearCuentas() {	
		
		long limit_left =  1111111111L;
		long limit_right = 9999999999L;
		
		long value = limit_left + (long) (Math.random() * (limit_right - limit_left));
		
		setNumCta(String.valueOf(value));
		return numCta;
	}
	public void ingresarDinero() {
		
		if(getNumCta()==null) {
			System.err.println("Por favor, créate una cuenta\n");
		}else{
			
			System.out.println(">Para n° de cuenta: "+getNumCta()+" Ingrese monto a depositar:\n");
			
			double monto = scanner.nextDouble();
			
			System.out.println("Púlse 1 para depositar en cuenta corriente\nPúlse 2 para depositar en cuenta de ahorro:\n");
			
			int valor = scanner.nextInt();
			
			switch (valor) {
			case 1:
				saldoCta = saldoCta + monto;
				System.out.println("Saldo final: ["+saldoCta+"]");
				break;
			case 2:
				saldoCtaAhorro = saldoCtaAhorro + monto;
				System.out.println("Saldo final cuenta de ahorro: ["+saldoCtaAhorro+"]");
				break;
			default:
				System.err.println("\nNúmero errado, intentar otra vez\n");
				menu();
			}
		}	
	}
	public void retirarDinero() {
		
		if(getNumCta() == null) {
			System.out.println("Por favor, créate una cuenta\n");
		}else {
			System.out.println(">Para n° de cuenta: "+getNumCta()+" Ingrese monto a retirar: \n");
			
			double monto = scanner.nextDouble();
			
			System.out.println("Púlse 1 para retirar de su cuenta corriente\nPúlse 2 para retirar de su cuenta de ahorro:\n");
			
			int valor = scanner.nextInt();
			
			switch (valor) {
			case 1:
				if(monto<saldoCta) {
					saldoCta = saldoCta - monto;
					System.out.println("Saldo final: ["+saldoCta+"]");
				}else {
					System.out.println("Fondos insuficientes, usted posee: "+saldoCta);
				}
				break;
			case 2:
				if(monto<saldoCtaAhorro) {
					saldoCtaAhorro = saldoCtaAhorro - monto;
					System.out.println("Saldo final: ["+saldoCtaAhorro+"]");
				}else {
					System.out.println("Fondos insuficientes, usted posee: "+saldoCtaAhorro);
				}
				break;
			default:
				System.err.println("\nNúmero errado, intentar otra vez\n");
				menu();
			}
		}
		
	}
}
