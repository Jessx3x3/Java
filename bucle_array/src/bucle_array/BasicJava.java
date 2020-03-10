package bucle_array;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BasicJava {

	//Imprimir n�meros 
	public void printNumeros(Integer max) {
		for (int i = 1; i <= max; i++) {
			System.out.println(i+"\n");
		}
	}
	//Imprimir impares
	public void printImpares(Integer max) {
		for (int i = 1; i <= max; i++) {
			if((i%2)!=0) {
				System.out.println(i+"\n");
			}
		}
	}
	//Imprimir n�mero y sumar
	public void printNumSum(Integer max) {
		
		int sum = 0;
		
		for (int i = 1; i <= max; i++) {
			System.out.print("N�mero: ["+i+"]");
			sum+=i;
			System.out.println(" Suma: ["+sum+"]");
		}
	}
	//Imprimir Array
	public void printArray(int[] value) {
		
		for (int i = 0; i < value.length; i++) {
			System.out.print("["+value[i]+"]");
		}
	}
	//Encontrar el mayor valor
	public Integer maxValue(int[] value) {
		
		int maxValue = 0;
		
		for (int i = 0; i < value.length; i++) {
			if(value[i]>maxValue) {
				maxValue = value[i];
			}
		}
		System.out.println(maxValue);
		return maxValue;
	}
	//Obtener Promedio
	public double getPromedio(int[] value) {
		
		int suma = 0;
		double promedio = 0;
		
		for (int i = 0; i < value.length; i++) {
			suma = value[i]+suma;
		}
		promedio = suma/value.length;
		System.out.println("Promedio: "+promedio);
		return promedio;
	}
	//Valores al Cuadrado
	public void valoresAlCuadrado(int[] value) {
		for (int i = 0; i < value.length; i++) {
			System.out.println(value[i]*value[i]);
		}
	}
	//M�nimo, M�ximo y Promedio
	public void minMaxProm(int[] value) {
		
		int suma = 0;
		int min = 0;
		int max = 0;
		
		for (int i = 0; i < value.length; i++) {
			
			suma = suma+value[i];
			
			if(value[i]>max) {
				max = value[i];
			}else{
				if(value[i]<min) {
					min = value[i];
				}
			}
		}
		
		System.out.println("M�ximo: "+max);
		System.out.println("M�nimo: "+min);
		System.out.println("Promedio : "+suma/value.length);
		
	}
	//Cambiando los Valores del Arreglo
	public void cambiarValores(int [] array) {
		
	}
	//Arreglo con N�meros Impares
	public void crearArray(ArrayList<Integer> num) {
		
		ArrayList<Integer> newArray = new ArrayList<Integer>();
		
		for (int i = 0; i < num.size(); i++) {
			
			if((num.get(i)%2)!=0) {
				newArray.add(num.get(i));
			}
		}
		
		System.out.println(newArray);
	}
	//Elegir n�mero y mostrar mayores al n�mero
	public void mayorValue(ArrayList<Integer> num, int n) {
		for (int i = 0; i < num.size(); i++) {
			if(num.get(i)<=n) {
				num.remove(i);
			}
		}
		System.out.println(num);
	}
	//Eliminar N�meros Negativos
	public void eliminarValoresNegativos(ArrayList<Integer> num) {
		for (int i = 0; i < num.size(); i++) {
			if(num.get(i)<0) {
				num.remove(i);
			}
		}
		System.out.println(num);
	}
}
