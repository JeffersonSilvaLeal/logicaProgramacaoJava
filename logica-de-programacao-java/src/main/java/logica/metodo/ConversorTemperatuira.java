package logica.metodo;

import java.util.Scanner;

public class ConversorTemperatuira {

	public static void main(String[] args) {

		// Dados de entrada
		Scanner ler = new Scanner(System.in);
		Scanner op = new Scanner(System.in);

		System.out.println("Digite a temperatura: ");
		
		// Váriavel que recebe o dado do usuário
		double temp = ler.nextDouble();

		System.out.println("1 = Fahrenheit");
		System.out.println("2 = Celsius");
		
		// váriavel para escolher opção
		int opcao = op.nextInt();
		// Váriavale para resposta
		double r;
		
		if (opcao == 1) {
			 r = converterFahrenheitCelsius(temp);

		} else if (opcao == 2) {
			 r = converterCelsiusFahrenheit(temp);
		
		} else {
			System.out.println("Opção inválida");
			return;
		}
		
		System.out.println("A temperatura convertida é: " + r);
	}

	// Conversor de fahrenheit para celsius
	static double converterFahrenheitCelsius(double fahrenheit) {
		double celsius = (fahrenheit - 32) / 1.8;
		return celsius;
	}

	// conversor de celsius para fahrenheit
	static double converterCelsiusFahrenheit(double celsius) {
		double fahrenheit = celsius * 1.8 + 32;
		return fahrenheit;
	}
	
}

