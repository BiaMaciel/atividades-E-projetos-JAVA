package colecoes;

import java.util.HashSet;
import java.util.Set;



public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		//CONJUNTO COM DADOS HETEROGENIOS
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);//double -> Double
		conjunto.add(true);//boolean -> Boolean
		conjunto.add("Teste");//String
		conjunto.add(1);//int -> Interger
		conjunto.add('x');
		
		//tamanho -> .size
		System.out.println("Tamanho é  " + conjunto.size());
		
		conjunto.add("Teste");
		conjunto.add('x');
		
		System.out.println("Tamanho é  " + conjunto.size());
		
		//remover elementos -> .remove
		
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		
		System.out.println("Tamanho é  " + conjunto.size());
		
		//verificar elemento no conjunto -> .contains
		
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//fazer uniao entre os conjuntos -> .addAll (não mantem ordem)
		//conjunto.addAll(nums);
		
		//intercecao (reter apenas oq esta no outro conjunto/valores em comum -> .retainAll
		conjunto.retainAll(nums);
		
		System.out.println(conjunto);
		
		//para limpar -> .clear
		conjunto.clear();
		System.out.println(conjunto);
		
		
	}
	
}
