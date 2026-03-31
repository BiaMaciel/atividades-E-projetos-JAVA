package fundamentos.operadores;

public class OperadoresUnarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++;//a = a + 1 incrementar
		a--;//a = a - 1 decrementar
		
		++b; // b = b + 1
		--b; // b = b - 1
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Qual será a resposta...");
		
		System.out.println(++a == b--);
		System.out.println(a == b);
			
		System.out.println(a);
		System.out.println(b);

	}

}
