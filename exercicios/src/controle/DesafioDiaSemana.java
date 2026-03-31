package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		//Domingo 6
		//Sabado 5
		//Sexta 4
		//Quinta 3
		//Quarta 2
		//terça 1
		//segunda 0
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escolha um dia da semana: ");
		String diaDaSemana = entrada.next();
		
		
		if(diaDaSemana.equalsIgnoreCase("domingo")) {
			System.out.println("O valor de domingo é 6");
			
		} else if (diaDaSemana.equalsIgnoreCase("sábado") || diaDaSemana.equalsIgnoreCase("sabado")) {
			System.out.println("O valor de sábado é 5");
			
		} else if (diaDaSemana.equalsIgnoreCase("sexta")) {
			System.out.println("O valor de sexta é 4");
		
		} else if (diaDaSemana.equalsIgnoreCase("quinta")) {
			System.out.println("O valor de quinta é 3");
			
		} else if (diaDaSemana.equalsIgnoreCase("quarta")) {
			System.out.println("O valor de quarta é 2");
			
		} else if (diaDaSemana.equalsIgnoreCase("terça") || diaDaSemana.equalsIgnoreCase("terca")) {
			System.out.println("O valor de terça é 1");
			
		}	else if (diaDaSemana.equalsIgnoreCase("segunda")) {
			System.out.println("O valor de segunda é 0");
			
		} else {
			System.out.println("Valor inválido");
		}
		
		
		entrada.close();
				
		
	}	

 }		

