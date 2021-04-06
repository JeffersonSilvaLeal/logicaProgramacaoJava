package logica.decisaoifelse;

import java.util.Scanner;

public class MainIfElse {

	public static void main(String[] args) {
		
		System.out.println("Digite sua idade: ");
		
		// Entrada de dados!!
		Scanner ler = new Scanner(System.in);
		
		int idade = ler.nextInt();
		
		// IF executa sempre que for verdadeiro
		if (idade >= 0 && idade <= 12) {
			System.out.println("Voçê é CRIANÇA");
		
		// Else executa sempre que for falso
		} else if (idade >= 12 && idade <= 17) {
			System.out.println("Voçê é ADOLESCENTE");
		
		} else if (idade >= 18 && idade <= 59) {
			System.out.println("Voçê é ADULTO");
		
		} else if (idade > 59) {
			System.out.println("Voçê é IDOSO");
	
		}
		
		System.out.println("FIM!!");
		
		ler.close();
	}

}
