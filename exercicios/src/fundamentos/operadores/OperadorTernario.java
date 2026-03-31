package fundamentos.operadores;

public class OperadorTernario {

	public static void main(String[] args) {
		
		double media = 7.6;
		
		String resultadoFinal = media >= 7.0 ? 
				"Aprovado." : "Recuperação";
		
		System.out.println("O aluno está " + resultadoFinal);
		System.out.println();
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		String resultado = temDesconto ? "Sim" : "Não";
		
		System.out.println("Tem desconto? " + resultado);
		

	}

}
