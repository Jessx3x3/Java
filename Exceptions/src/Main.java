import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Object> myList = new ArrayList<Object>();
		Exception_Class exceptionClass = new Exception_Class();
		
		myList.add("13");
		myList.add("Hola Mundo");
		myList.add(48);
		myList.add("Adios Mundo");
		
		exceptionClass.arrayCast(myList);
		

	}

}
