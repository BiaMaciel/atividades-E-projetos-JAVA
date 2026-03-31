package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		//Ultimo a entrar, primeiro a sair
		
		livros.add("O Pequeno Príncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		for(String livro: livros) {
			System.out.println(livro);
		}
		
		System.out.println();
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println();
		
		//para remover
		System.out.println(livros.pop());//lança excecao
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		
		//livros.size();
		//livros.clear();
		//livros.contains();
		//livros.isEmpty();
		
		
		

	}

}
