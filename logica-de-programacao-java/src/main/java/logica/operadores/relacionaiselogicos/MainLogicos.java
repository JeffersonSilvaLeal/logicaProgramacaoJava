package logica.operadores.relacionaiselogicos;

public class MainLogicos {

	public static void main(String[] args) {
		
		/* Nega��o (N�O) nega o valor.
		
		   A         n�o A
		   V           F
		   F           V
	    */
		System.out.println("---------Nega��o-N�o--------------");
		boolean a = true;
		boolean b = !a;
		
		System.out.println(b);
		System.out.println("----------------------------------");
		System.out.println("");
		
		
		/*  A   B  AeB
		 *  V   V   V
		 *  V   F   F
		 *  F   V   F
		 *  F   F   F
		 */
		System.out.println("-----------Conju��o-E-------------");
		boolean c = true;
		boolean d = false;
		System.out.println(c && d);
		System.out.println("----------------------------------");
		System.out.println("");
		
		
		/*
		 *  A   B   A ou B
		 *  V   V     V 
		 *  V   F     V
		 *  F   V     V
		 *  F   F     F
		 */
		System.out.println("----------Disjun��o-OU------------");
		boolean e = true;
		boolean f = false;
		System.out.println(e || f);
		System.out.println("----------------------------------");

	}

}
