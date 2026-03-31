package classe.desafio;

public class Pessoa {
	
	String nomePessoa;
	double pesoPessoa;
	
	
	Pessoa(String nomePessoa, double pesoPessoa){
		this.nomePessoa = nomePessoa;
		this.pesoPessoa = pesoPessoa;	
	}
	
	void Comer(Comida comida) {
		if(comida != null) {
			this.pesoPessoa += comida.pesoComida;
		}
	}
	
	String apresentar() {
		return "Olá meu nome é " + nomePessoa + " e peso " + pesoPessoa + " Kgs.";
	}

}
