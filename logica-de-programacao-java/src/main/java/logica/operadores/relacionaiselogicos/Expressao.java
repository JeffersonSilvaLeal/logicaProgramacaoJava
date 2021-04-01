package logica.operadores.relacionaiselogicos;

public class Expressao {

	public static void main(String[] args) {
		
		// x = 5 x 3 + raiz 7x7 <= 100 ou Não v E v 
		
		boolean v = true;
		
		boolean x = 5 * 3 + Math.sqrt(7 * 7) <= 100 || !v && v;
		System.out.println(x);
	}

}
