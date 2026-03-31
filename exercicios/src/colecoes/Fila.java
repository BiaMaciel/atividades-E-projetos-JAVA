package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		//primeiro a entrar, primeiro a sair
		Queue<String> fila = new LinkedList<>();
		
		//Offer e Add -> Adicionam elementos na fila
		//Diferença -> Comportamento quando a fila está cheia!
		fila.add("Ana");//retorna falso
		fila.offer("Bia");//lança uma excecao
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		//Peek e Element -> Obter o proximo elemento da fila(sem remover)
		//Diferença  -> Comportamento quando a fila está vazia!
		System.out.println(fila.peek());//retorna null
		System.out.println(fila.element());//retora execao
		
		
		System.out.println();
		
		//Poll e Remove ->  Obter o proximo elemento (e remove!)
		//Diferença  -> Comportamento quando a fila está vazia!
		System.out.println(fila.poll());//retorna null
		System.out.println(fila.remove());//lanca excecao
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		//fila.contains(...);
	
		

	}

}
