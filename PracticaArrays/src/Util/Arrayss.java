package Util;

public abstract class Arrayss {

	/**
	 * Devuelve la media de un array con numeros de 0 a 10
	 * 
	 * @param numeros array de numeros entre 0 y 10
	 * @return media de los numero (suma todos los numeros dividido entre numeros totales)
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
		}
		
		return media;
		
	}
	
}
