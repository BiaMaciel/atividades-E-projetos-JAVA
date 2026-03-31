package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
	//calcular media das notas de uma turma	
	//nota valida de 0 á 10
	//armazenar nota valida em uma nova variavel Total
	//sempre acrescentar uma nota toda vez que o valor for digitado
	//o total terá todas as notas
	//criar outra variavel para saber quantas vezes foi digitado uma nota
	//no final terá a media
	//quando digitar -1 significa que encerrou o programa
		
		Scanner entrada = new Scanner(System.in);
		
		int quantidadeDeNotas = 0;

		double nota = 0;
		double total = 0;
		
		while(nota !=  -1) {
			
			System.out.println("Informe a nota (ou -1  para sair):");
			nota = entrada.nextDouble();
			
			if(nota <= 10 && nota >= 0) {
				
				total += nota;
				quantidadeDeNotas++;
			}else if(nota != -1){
				System.out.println("Nota inválida!");
			}
			
			
			
		}
		
		//calcular a media
		
		double media  = total / quantidadeDeNotas;
		
		System.out.print("Média = " + media);

		entrada.close();

	}

}
