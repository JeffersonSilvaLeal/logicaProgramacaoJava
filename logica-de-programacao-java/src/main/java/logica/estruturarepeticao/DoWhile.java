package logica.estruturarepeticao;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double nota;
		int contador = 1;
		double soma = 0;
		
		do {
			System.out.println("Digite a Nota: " + contador++ + ":");
			nota = ler.nextDouble();
			
			// Ao digitar -1 Sai do loop e aculmula nota na variável soma
			if (nota != -1) {
				soma += nota;
				System.out.println("soma = " + soma + ")");
				
			}
			
		} while (nota != -1);
		
		// Teste de mesa!!
		System.out.println("Soma = " +  soma);
		System.out.println("Contador = " + (contador - 2));
		
		// Soma divide por a quantidade de vzs de notas!!
		double media = soma / (contador - 2);
		System.out.println("Média Final é: " + media);
		
		
		ler.close();
		
	}

}
