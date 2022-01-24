/**
 * 
 */
package EJERCICIO1;

import java.util.Scanner;

/**
 * @author Jose
 *
 */
public class Ej1_Jimenez_Ariza_Jose {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double peso, altura, imc=0;
		String diagnostico;
		
		System.out.println("Introduzca su altura(Metros): ");
		altura = entrada.nextDouble();
		System.out.println("Introduzca su peso(Kg): ");
		peso = entrada.nextDouble();
		
		imc = peso/(altura*altura);
		
		if(imc<18.5) {
			diagnostico="Bajo peso";
		} else if(imc>=18.5 && imc<24.9) {
			diagnostico="Peso normal(saludable)";
		} else if(imc>25 && imc<29.9) {
			diagnostico="Sobrepeso";
		} else if(imc>30 && imc<40) {
			diagnostico="Obesidad premórbida";
		} else {
			diagnostico="Obesidad mórbida";
		}
		
		System.out.printf("El paciente de %.2f kg y %.2f m de altura tiene un IMC de %.2f y tiene un diagnóstico de %s",peso, altura, imc, diagnostico);
		
		entrada.close();

	}

}
