/**
 * 
 */
package EJERCICIO2;

/**
 * @author Jose
 *
 */
public class examen {
	
	/**
	 * Funcion que muestra la matriz que le pasemos
	 * @param matriz
	 */
	public static void mostrar_imcs(double matriz[][]) {
		
		for (int i = 0; i <matriz.length; i++) {
			for(int j=0; j<matriz[0].length; j++) {
				System.out.printf("%5.2f ", matriz[i][j]);
			}
			System.out.println();
		}
		
	}
	
	/**
	 * Procedimiento que recibe una matriz y un numero de paciente y calcula la media de ese paciente
	 * @param matriz
	 * @param paciente
	 * @return media
	 */
	public static double media_paciente(double matriz[][], int paciente) {
		
		double suma=0, media=0;
		
		for (int i = paciente; i < matriz.length && i==paciente; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				suma= suma+matriz[i][j];
			}
		}
		
		media = suma/(matriz[0].length);
		return media;
		
	}

}
