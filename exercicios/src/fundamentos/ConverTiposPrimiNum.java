package fundamentos;

public class ConverTiposPrimiNum {

	public static void main(String[] args) {
		double a = 1; //conversao implicita
		System.out.println(a);
		
		float b = (float)1.12345678888;//conversao explicita(CAST)
		System.out.println(b);
		
		int c = 130;
		byte d = (byte) c;// explicita(CAST)
		System.out.println(d);
		
		double e = 1.9999;
		int f = (int) e;
		System.out.println(f);

	}

}
