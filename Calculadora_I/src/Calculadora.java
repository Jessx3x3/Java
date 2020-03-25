
public class Calculadora {
	
	private double operandOne;
	private double operandTwo;
	private double result;
	private String operation;
	
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public double getOperandOne() {
		return operandOne;
	}
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	public double getOperandTwo() {
		return operandTwo;
	}
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	
	void performOperation() {
		
		if(getOperation().equals("+")) {
			setResult(getOperandOne()+getOperandTwo());
		}
		if(getOperation().equals("-")) {
			setResult(getOperandOne()-getOperandTwo());
		}
		if(getOperation().equals("*")) {
			setResult(getOperandOne()*getOperandTwo());
		}
		if(getOperation().equals("/")) {
			setResult(getOperandOne()/getOperandTwo());
		}
		if(getOperation() != "+" && getOperation() != "-" && getOperation() != "*" && getOperation() != "/") {
			System.err.println("Ingrese una operación válida");
		}
		System.out.println(getResult());
		
	}
}
