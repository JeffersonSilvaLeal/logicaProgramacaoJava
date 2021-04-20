package logica.array;

//esse algoritmo ordena nosso array do menor para o maior
public class MainBubbleSort {

	public static void main(String[] args) {

		int[] valores = { 3, 4, 6, 8, 9, 7, 5, 2, 1, 0 };

		for (int i = 0; i < valores.length - 1; i++) {
			for (int j = i + 1; j < valores.length; j++) {
				if (valores[i] > valores[j]) {
					int aux = valores[i];
					valores[i] = valores[j];
					valores[j] = aux;
				}
			}
		}

		for (int valor : valores) {
			System.out.print(valor + " ");
		}
		
		System.out.println();
		
		// Ordena do Maior para o menor

		int[] valores2 = { 3, 4, 6, 8, 9, 7, 5, 2, 1, 0 };

		for (int i = 0; i < valores2.length - 1; i++) {
			for (int j = 0; j < valores2.length; j++) {
				if (valores2[i] > valores2[j]) {
					int aux = valores2[i];
					valores2[i] = valores2[j];
					valores2[j] = aux;
				}
			}
		}

		for (int valor : valores2) {
			System.out.print(valor + " ");
		}
	}

}
