package fundamentos.operadores;

public class DesafioLogico {

	public static void main(String[] args) {
		
		//trabalhoTerca  (V ou F)
		//trabalhoQuinta (V ou F)
		//tvCinquenta
		//tvTrintaEduas
		//sorvete
		
		boolean trabalho1 =  true;
		boolean trabalho2 =  true;
		
		
		boolean tvCinquenta = trabalho1 && trabalho2;
		System.out.println("Comprou TV 50\"? " + tvCinquenta);
		
		boolean tvTrintaEduas = trabalho1 ^ trabalho2;
		System.out.println("Comprou TV 32\"? " + tvTrintaEduas);		
		
		boolean sorvete = trabalho1 || trabalho2;
		System.out.println("Comprou sorvete? " + sorvete);
		
		//Operador unaário
		System.out.println("Mais saudável? " + !sorvete);
		
		
		
	 
		
		
	}

}
