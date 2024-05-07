package Util;

import java.util.Arrays;

public abstract class Arrayss {

	/**
	 * Devuelve la media de un array con numeros de 0 a 10
	 * 
	 * @param numeros array de numeros entre 0 y 10
	 * @return media de los numero (suma todos los numeros dividido entre numeros totales), -1 si salta error
	 */
	
	public static float mediaNotas(int[] numeros) {
		
		int suma = 0;
		
		float media = -1;
		
		try {
			for (int i : numeros) {
				if (i<0||i>10) {
					throw new IllegalArgumentException();
				}
				suma += i;
			}
			media = suma/numeros.length;
		} catch (IllegalArgumentException e) {
			System.out.println("Hay numeros que no estan entre 0 y 10");
			media = -1;
		}
		
		return media;
		
	}
	
	/**
	 * devuelve la mediana de un array con numeros entre 0 y 10
	 * 
	 * @param numeros array de numeros entre 0 y 10
	 * @return mediana, dependiendo si el array es par o impar, igual si algun numero no es valido, devuelve -1
	 */
	
	public static float medianaNotas(int[] numeros) {
		
		float mediana = 0;
		
		try {
			for (int i : numeros) {
				if (i<0||i>10) {
					throw new IllegalArgumentException();
				}
			}
			
			Arrays.sort(numeros);
			
			if (numeros.length%2==0) {
				//aqui es pares
				int numero1 = numeros[numeros.length/2];
				int numero2 = numeros[(numeros.length/2)-1];
				
				mediana = (float) (numero1+numero2)/2;
			} else {
				//aqui impares
				mediana = numeros[(numeros.length-1)/2];
			}
			
		} catch (IllegalArgumentException e) {
			System.out.println("Hay numeros que no estan entre 0 y 10");
			mediana = -1;
		}
		return mediana;
	}
	
	/**
	 * devuelve el numero mayor del array
	 * 
	 * @param numeros array de numeros entre 0 y 10
	 * @return max, el numero mayor del array, si hay algun numero fuera de rango, devuelve -1
	 */
	
	public static int maximaNota(int[] numeros) {
		
		int max=0;
		
		try {
			for (int i : numeros) {
				if (i<0||i>10) {
					throw new IllegalArgumentException();
				}
				
				if(i>max) {
					max = i;
				}
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Hay numeros que no estan entre 0 y 10");
			max = -1;
		}
		return max;
	}
	
	/**
	 * devuelve el numero menot del array
	 * 
	 * @param numeros array de numeros entre 0 y 10
	 * @return min, el numero menor del array, si hay algun numero fuera de rango devuelve -1
	 */
	
	public static int minimaNota(int[] numeros) {
		
		int min = 10;
		
		try {
			for (int i : numeros) {
				if (i<0||i>10) {
					throw new IllegalArgumentException();
				}
				
				if(i<min) {
					min = i;
				}
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Hay numeros que no estan entre 0 y 10");
			min = -1;
		}
		return min;
	}
	
}
