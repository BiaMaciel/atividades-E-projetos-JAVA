package fundamentos;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		double numero = entrada.nextDouble();
		
		if(numero > 0) {
			System.out.println("positivo");
		}else if(numero < 0) {
			System.out.println("negativo");
		}else {
			System.out.println("Zero");
		}
		
		
		

		entrada.close();
		

	}

}
