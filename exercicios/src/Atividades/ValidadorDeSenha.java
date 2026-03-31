package Atividades;

import java.util.Scanner;

public class ValidadorDeSenha {

	public static void main(String[] args) {
		
		String senhaMestra = "Java123";
				
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a senha correta: ");
		
		String senha = entrada.next();
		
		boolean resposta = senha.equals(senhaMestra);
		
		if (resposta) {
			System.out.println("Senha correta");
		}else {
			System.out.println("Senha incorreta");
		}
		

		entrada.close();
		
		
		

	}

}
