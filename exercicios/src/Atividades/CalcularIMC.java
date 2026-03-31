package Atividades;

import java.util.Scanner;

public class CalcularIMC {

	public static void main(String[] args) {
		
		System.out.println("Escreva o seu nome: ");
		
		Scanner entrada = new Scanner(System.in);
		String nome = entrada.nextLine();
		
		System.out.println("Seu peso: ");
		double peso = entrada.nextDouble();
		
		System.out.println("Sua altura: ");
		double altura = entrada.nextDouble();
		
		double imc = peso /Math.pow(altura, 2);
		
		System.out.printf("Nome: %s, Peso: %.2f, Altura: %.2f\n", nome, peso, altura);
		System.out.printf("Seu IMC: %.2f ", imc);
		
		entrada.close();

	}

}
