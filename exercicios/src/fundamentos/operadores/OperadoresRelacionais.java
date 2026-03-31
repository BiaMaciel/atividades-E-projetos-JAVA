package fundamentos.operadores;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		
		System.out.println(3 == 2);
		System.out.println(3 >= 4);
		System.out.println(3 < 7);
		System.out.println( 30 <= 7);
		System.out.println( 30 != 7);
		
		
		
		double nota = 7.3;
		
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
		
		

	}

}
