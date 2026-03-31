package controle;

import java.util.Scanner;


public class IfElseIf {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma nota: ");
		double nota = entrada.nextDouble();
		
		if(nota > 10 || nota < 0) {
			System.out.println("Nota INVÁLIDA!");
			
		} else if(nota >= 8.1) {
			System.out.println("Conceiro A");
			
		} else if(nota >= 6.1) {
			System.out.println("Conceiro B");
			
		} else if(nota >= 4.1) {
		    System.out.println("Conceiro C");
		    
	    } else {
	    	System.out.println("Conceito D");
	    	
	    }
		
		
		System.out.println("FIM!");
		entrada.close();
		

	}

}
