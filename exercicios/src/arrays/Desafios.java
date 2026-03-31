package arrays;

import java.util.Arrays;

public class Desafios {
	public static void main(String[] args) {
		
		//array de forma fixa
		double[] notasAlunoA = new double[4];
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		//Arrays.toString(notasAlunoA);
		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[0]);
		System.out.println(notasAlunoA[notasAlunoA.length - 1]);//ultima nota
		
		double totalAlunoA = 0;
		
		for(int i =  0; i < notasAlunoA.length; i++) {
			
			totalAlunoA += notasAlunoA[i];
		}
		
		System.out.println(totalAlunoA / notasAlunoA.length);
		
		final double notaArmazenada = 5.9;
		double [] notasAlunoB = {6.9, 8.9, notaArmazenada, 10};//array com dados literais
		
		System.out.println(Arrays.toString(notasAlunoB));
		
		double totalAlunoB = 0;
		
		for (int i = 0; i < notasAlunoB.length; i++) {
			
			totalAlunoB  += notasAlunoB[i];
		}
		
		System.out.println(totalAlunoB / notasAlunoB.length);
	}
}
