package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
		// INFORMAÇÕES DO FUNCIONARIO
		
			//Tipos numericos inteiros
			//do menor para o maior
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
			// Tipos numericos reais
			//do menor para o maior
		float salario = 11_445.44F;//literal float
		double vendasAcumuladas = 2_991_787_103.01;
		
			//Tipo booleano
		boolean estaDeFerias = false; //True
		
			//Tipo caractere
			//só aceita uma unica letra
		char status = 'A'; //ativo
		
		
		//Dias de Empresa;
		System.out.println(anosDeEmpresa * 365);
		
		//Numero de viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha ->  "+ salario);
		System.out.println("Férias? "+ estaDeFerias);
		System.out.println("Status: " + status);
		
	}
}
