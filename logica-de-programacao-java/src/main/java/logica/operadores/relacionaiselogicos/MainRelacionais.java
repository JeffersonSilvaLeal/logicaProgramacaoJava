package logica.operadores.relacionaiselogicos;

import java.util.Scanner;

public class MainRelacionais {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número: ");
		int n1 = ler.nextInt();
		
		System.out.println("Entre com o primeiro segundo: ");
		int n2 = ler.nextInt();
		
		// operadores relacionais sempre retornão valores booleanos true ou false!!
		System.out.println("------------Operadores Relacionais-------------");
		boolean igual = n1 == n2;
		System.out.println("Iguais? " + igual);
		
		boolean diferente = n1 != n2;
		System.out.println("Diferentes? " + diferente);
		
		boolean primeiroMaiorQueSegundo = n1 > n2;
		System.out.println("Primeiro é maior que o segundo? " + primeiroMaiorQueSegundo);
		
		boolean primeiroMaiorIgualQueSegundo = n1 >= n2;
		System.out.println("Primeiro é maior ou igual que o segundo? " + primeiroMaiorIgualQueSegundo);
		
		System.out.println("---------------------------------------------------");
		System.out.println("");
		
		
	}

}
