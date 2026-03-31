package Atividades;

import java.util.Scanner;

public class VerificadorMaioridade {

	public static void main(String[] args) {
		
		System.out.println("Digite sua idade: ");
		
		Scanner entrada = new Scanner(System.in);
		
		int idade = entrada.nextInt();
		
		if(idade <= 0 || idade >= 120) {
			System.out.println("Idade inválida. Digite novamente");
		}else if(idade >= 18) {
			System.out.println("Maior de idade. Acesso permitido!");
		}else {
			System.out.println("Menor de idade. Acesso inválido");
		}
		

		entrada.close();
		

	}

}
