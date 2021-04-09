package logica.estruturarepeticao;

import java.util.Scanner;

// Ultiliza-se o FOR quando j� souber a quantidade de vezes que a vari�vel vai repetir
public class For {

	public static void main(String[] args) {
		
		// Entrada de dados
		Scanner ler = new Scanner(System.in);
		
		// Pergunta ao usu�rio
		System.out.println("Escolha o n�mero a ser multiplicado!!");
		
		// Vari�vel a ser multiplicada
		int n = ler.nextInt();
		
		// itera i at� menor ou igual a 10
		for (int i = 0; i <= 10; i++) {
			System.out.println(n + " X " + i + " = " + (n * i));
			// Multiplica a vari�vel N = 'Usu�rio' por i ' Itera��o '
		}
		
		// Fecha o Scanner
		ler.close();
	}

}
