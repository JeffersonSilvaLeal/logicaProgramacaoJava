package logica.operadores.aritmeticos;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {

	Scanner ler = new Scanner(System.in);	
	
	String nome, sobrenome;
	
	System.out.println("----------------NOME COMPLETO---------------------");
	System.out.println("Digite o primeiro nome: ");
	nome = ler.nextLine();
	
	System.out.println("Digite seu sobrenome: ");
	sobrenome = ler.nextLine();
	
	
	// Ultilizamos o Operador "+" para Juntar nome + sobrenome 
	String nomeCompleto = nome + " " + sobrenome;
	System.out.println("Ol�: " + nomeCompleto.toUpperCase());
	System.out.println("---------------------------------------------------");
	System.out.println("");
	
	System.out.println("-----------------F�RMULA DE BHASKARA---------------");
	Scanner leitor = new Scanner(System.in);
	
	System.out.println("Entre com o valor de A: ");
	double a = leitor.nextDouble();
	
	System.out.println("Entre com o valor de B: ");
	double b = leitor.nextDouble();
	
	System.out.println("Entre com o valor de C: ");
	double c = leitor.nextDouble();
	
	// Ultilizamos o pow 'Potencia��o'
	double delta = Math.pow(b, 2) - 4 * a * c;
	
	// Ultilizamos o Sqrt 'Raiz quadrada'
	double x1 = (-b + Math.sqrt(delta)) / (2 * a);
	double x2 = (-b - Math.sqrt(delta)) / (2 * a);

	System.out.println("valor x1: " + x1);
	System.out.println("valor x2: " + x2);
	System.out.println("---------------------------------------------------");
	System.out.println("");
	
	System.out.println("----------F�rmula de c�lculo de um hex�gono--------");
	Scanner calculo = new Scanner(System.in);
	
	System.out.println("Digite o lado: ");
	
	int lado = calculo.nextInt(); 
	int perimetro = 6 * lado;
	double area = (3 * lado * Math.sqrt(3)) / 2;
	
	System.out.println("Perimetro: " + perimetro);
	System.out.println("�rea: " + area);
	System.out.println("--------------------------------");
	System.out.println("");
	
	System.out.println("------------------M�dulo 'RESTO %'--------------------");
	Scanner mod = new Scanner(System.in);
	System.out.println("Digite um n�mero impar: ");
	int resto = mod.nextInt() % 2;
	
	//Lembrando que ao digitar um n�mero para o resultadi sempre ser� '0'
	System.out.println("Resto do n�mero �: " + resto);
	System.out.println("--------------------------------");
	
	// Fecha os Scanners
	ler.close();
	leitor.close();
	calculo.close();
	mod.close();
	}

}
