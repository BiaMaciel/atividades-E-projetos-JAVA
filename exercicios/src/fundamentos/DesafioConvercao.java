package fundamentos;

import java.util.Scanner;

public class DesafioConvercao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Digite o PRIMEIRO salario: ");
		String valor1 = entrada.nextLine().replace(",", ".");
		
		
		System.out.print("Digite o SEGUNDO salario: ");
		String valor2 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite o TERCEIRO salario: ");
		String valor3 = entrada.nextLine().replace(",", ".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		
		double calcularMedia = (salario1 + salario2 +  salario3)/3;
		
		System.out.print("A media do seu salario é de: " + calcularMedia);
		
		entrada.close();
		
		
	}
}
