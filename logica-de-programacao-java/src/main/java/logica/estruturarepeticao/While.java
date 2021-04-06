package logica.estruturarepeticao;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		// Entrada de dados
		Scanner ler = new Scanner(System.in);
		
		double nota = 0;
		int cont = 1;
		double soma = 0;
		
		//Enquanto for != de -1 continua  o loop
		while(true) {
			System.out.println("Digita sua nota: " + cont + ":");
			nota = ler.nextDouble();
			
			// Ao digitar -1 sai do loop decrementando o contador
			if (nota == -1) {			
				cont--;
				break;
			}
			
			cont++;
			soma += nota;
			System.out.println("soma = " + soma + ")");
		}
		
		System.out.println("soma = " + soma);
		System.out.println("cont = " + cont);
		
		double media = soma / cont;
		System.out.println("Média Final: " + media);
		
		ler.close();
	}

}
