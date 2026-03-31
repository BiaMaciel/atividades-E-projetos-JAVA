package Atividades;

import java.util.Scanner;

public class TabuadaDinaminca {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero inteiro para gerar a tabuada: ");
		
		int numero = entrada.nextInt();
		
		
		for(int i = 1; i < 11; i++) {
			System.out.println(numero + " x " + i + " = " + (numero * i));
		}
		

		entrada.close();
		
		
		
		

	}

}
