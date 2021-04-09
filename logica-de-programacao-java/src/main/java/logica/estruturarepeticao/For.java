package logica.estruturarepeticao;

import java.util.Scanner;

// Ultiliza-se o FOR quando já souber a quantidade de vezes que a variável vai repetir
public class For {

	public static void main(String[] args) {
		
		// Entrada de dados
		Scanner ler = new Scanner(System.in);
		
		// Pergunta ao usuário
		System.out.println("Escolha o número a ser multiplicado!!");
		
		// Variável a ser multiplicada
		int n = ler.nextInt();
		
		// itera i até menor ou igual a 10
		for (int i = 0; i <= 10; i++) {
			System.out.println(n + " X " + i + " = " + (n * i));
			// Multiplica a variável N = 'Usuário' por i ' Iteração '
		}
		
		// Fecha o Scanner
		ler.close();
	}

}
