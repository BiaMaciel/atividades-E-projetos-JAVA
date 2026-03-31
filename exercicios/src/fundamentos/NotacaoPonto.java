package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.replace("X", "Senhora");
		s = s.concat("!!!");
		s = s.toUpperCase();
		
		System.out.println(s);
		
		System.out.println("Leo".toUpperCase());
		
		String y = "Bom dia X"
				.replace("X", "Gui")//pode quebrar as linhas
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		//tipos primitivos não tem o operador "."
	}
}
