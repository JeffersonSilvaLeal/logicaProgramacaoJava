package logica.metodo;

public class MainMetodo {

	public static void main(String[] args) {
		
		// método retornando a passagem de parâmetro
		calcularFibonacci(10, " - ");

		System.out.println("");

		// Método retornando um array como resposta
		int[] valor = calcularFibonacci(5);
		
		for (int i : valor) {
			System.out.print(i + " = ");
		}
	}

	// Método
	static void calcularFibonacci(int vezes, String separador) {

		for (int cont = 0, i = 0, j = 1; cont < vezes; cont++) {
			System.out.print(i + separador);

			i = i + j; // Próximo
			j = i - j; // Anterior

			// Teste de Mesa

			// i = 0 1 1 2 3 5 8
			// j = 1 0 1 1 2 3 5
		}
	}
	
	static int[] calcularFibonacci(int vezes) {
		int[] resposta = new int[vezes];
		
		for (int cont = 0, i = 0, j = 1; cont < vezes; cont++) {
			i = i + j; // Próximo
			j = i - j; // Anterior
			
			resposta[cont] = i;
		}
		
		return resposta;
	}
}