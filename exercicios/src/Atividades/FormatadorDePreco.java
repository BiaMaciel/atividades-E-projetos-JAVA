package Atividades;

public class FormatadorDePreco {

	public static void main(String[] args) {
		
		double preco =  19.99;
		
		String formatador = Double.toString(preco);
		
		System.out.println("Seu preço é de R$" + formatador);

	}

}
