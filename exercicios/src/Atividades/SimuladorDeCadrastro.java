package Atividades;

import java.util.Scanner;

public class SimuladorDeCadrastro {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Nome completo: ");
		String nome = entrada.nextLine();
		
		System.out.println("Idade: ");
		int idade =  entrada.nextInt();
		
		System.out.println("Altura: ");
		double altura = entrada.nextDouble();
		
		System.out.println("Possui carteira de motorista?(S/N) ");
		String PossuiCarteira = entrada.next();
			
		boolean carteira = PossuiCarteira.equalsIgnoreCase("S");
		
		System.out.println("Olá " + nome + ", você tem "+ idade + " anos, mede " + 
		altura + "m. E o status da sua habilitação é: " + PossuiCarteira);
		
		if(carteira) {
			System.out.println("Você possui carteira de motorista");
		}else {
			System.out.println("Você NÃO possui carteira de motorista");
		}
		
		

		entrada.close();
		
		
		
	}

}
