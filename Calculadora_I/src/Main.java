
public class Main {

	public static void main(String[] args) {
		
		Calculadora operacion = new Calculadora();
		
		operacion.setOperandOne(10.5);
		operacion.setOperandTwo(5.2);
		operacion.setOperation("+");
		
		operacion.performOperation();

	}

}
