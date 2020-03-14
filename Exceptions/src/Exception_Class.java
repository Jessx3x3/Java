import java.util.ArrayList;

public class Exception_Class {
	
	public void arrayCast(ArrayList<Object> myList) {

		String string = "";
		Integer integer = 0;
		
			for(int i = 0; i < myList.size(); i++) {		
				System.out.println("\nTipos de datos: ["+myList.get(i).getClass().getSimpleName()+"]"+" Valor: "+myList.get(i));
				
				if(myList.get(i).getClass().getName() == string.getClass().getName()) {
					try {
						Integer castedValue = (Integer) myList.get(i);
						System.out.println("Exitoso "+myList.get(i));
					} catch (Exception e) {
						System.out.println("Error: "+e);
					}
				}
				if(myList.get(i).getClass().getName() == integer.getClass().getName()) {
					try {
						Integer castedValue = (Integer) myList.get(i);
						System.out.println("Exitoso: "+castedValue);
					} catch (Exception e) {
						System.out.println("Error: "+e);
					}
				}
			}
	
	}
	
}
