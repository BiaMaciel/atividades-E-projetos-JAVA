package Atividades;

import java.util.Scanner;

public class CalculadoraDeidadeEmDias {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		
		int idade =  Integer.parseInt(entrada.nextLine());
		
		int idadeEmDias =  idade * 365 + (idade / 4);
		
		System.out.println("Sua idade em dias é: " + idadeEmDias);

		entrada.close();
		
		
	}

}
