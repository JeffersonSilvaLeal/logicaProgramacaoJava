package logica.operadores.relacionaiselogicos;

public class MainLogicos {

	public static void main(String[] args) {
		
		/* Negação (NÂO) nega o valor.
		
		   A         não A
		   V           F
		   F           V
	    */
		System.out.println("---------Negação-Não--------------");
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
		System.out.println("-----------Conjução-E-------------");
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
		System.out.println("----------Disjunção-OU------------");
		boolean e = true;
		boolean f = false;
		System.out.println(e || f);
		System.out.println("----------------------------------");

	}

}
