package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		//Ler num1
		//Ler num2
		//escolherOperacao
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		double num1 = entrada.nextDouble();
		
		
		System.out.println("Digite o segundo valor: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Digite a operaçãp: ");
		String operacao = entrada.next();
		
		
		//Logica
		
		double resultado = "+".equals(operacao)  ? num1 + num2 :  0;
		resultado = "-".equals(operacao)  ? num1 - num2 :  resultado;
		resultado = "*".equals(operacao)  ? num1 * num2 :  resultado;
		resultado = "/".equals(operacao)  ? num1 / num2 :  resultado;
		resultado = "%".equals(operacao)  ? num1 % num2 :  resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", 
							num1, operacao, num2, resultado);
		
				
		
		
		entrada.close();
		
	}

}
