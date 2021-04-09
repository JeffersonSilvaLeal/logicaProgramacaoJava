package logica.fibonacci;

public class Fibonacci {

	public static void main(String[] args) {
		
		
		int vezes = 10;
		
		for(int cont = 0, i = 0, j = 1; cont < vezes; cont++) {
			System.out.print(i + " ");
		
			i = i + j; // Próximo
			j = i - j; // Anterior
			
			// Teste de Mesa
			
			//	i = 0 1 1 2 3 5 8
			//  j = 1 0 1 1 2 3 5 		
		}
	}

}
