package logica.array;

import java.util.Scanner;

// array ou vetor são um agrupador de dados
public class MainArray {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
	//  Array de notas	       Tamanho do array [0, 1, 2], 3 Elementos
		double[] notas = new double[4];
	
	// Armazena dentro do array as notas	
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota " + (i + 1) + " : "); // Incrementa a nota requisitada ao usuário
			notas[i] = ler.nextDouble(); // adiciona a nota dentro do array
		}
	
	//   Imprime as notas do array
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
	// Fecha o scanner	
		ler.close();
	}
	
}
