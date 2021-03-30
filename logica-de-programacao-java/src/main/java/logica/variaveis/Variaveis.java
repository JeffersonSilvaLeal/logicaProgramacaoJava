package logica.variaveis;

//Os tipos primitivos são tipos de dados pré-definidos e que ocupam um espaço específico em memória para armazenar o conteúdo
//Variáveis são áreas de memórias que se pode armazenar informações/dados
//Variáveis fortemente tipada são aquela em que os objetos/variáveis tem um tipo bem definido e que precisa ser informado no momento de sua declaração

public class Variaveis {

	public static void main(String[] args) {

		// Tipo       Nome      Atribuição  Valor
				byte      tipoByte      =        127;
				short     tipoShort     =        32767;
				char      tipoChar      =        'C';
				float     tipoFloat     =        2.6f;
				double    tipoDouble    =        3.59;
				int       tipoInt       =        2147483647;
				long      tipoLong      =        9223372036854775807L;
				boolean   tipoBooleano  =        true;	
				
				
		    // Apartir do java 10 o "VAR" foi incluido ele permite que voçê defina uma variável sem especificar o seu tipo, e ela se comportará de acordo com o receber	     

			// Tipo       Nome      Atribuição  Valor

				var       varByte       =        127;
				var       varShort      =        32765;
				var       varChar       =        'B';
				var       varFloat      =        5.6f;
				var       varDouble     =        4.00;
				var       varInt        =        111111;
				var       varLong       =        25252525;
				var       varBooleano   =        false;
				var       varTexto      =        "texto";
				
				
			// Impressão dos dados atribuido a cada variável
				  System.out.println("Valor do tipoByte = " + tipoByte);
			      System.out.println("Valor do tipoShort = " + tipoShort);
			      System.out.println("Valor do tipoChar = " + tipoChar);
			      System.out.println("Valor do tipoFloat = " + tipoFloat);
			      System.out.println("Valor do tipoDouble = " + tipoDouble);
			      System.out.println("Valor do tipoInt = " + tipoInt);
			      System.out.println("Valor do tipoLong = " + tipoLong);
			      System.out.println("Valor do tipoBooleano = " + tipoBooleano);
			      System.out.println("                 ");
			      
			 //   Impressão do tipo 'Var' 
			      System.out.println("Valor atribuido a variável Var"); 
			      System.out.println("                  ");
			      System.out.println("varByte: " + varByte);
			      System.out.println("varShort: " + varShort);
			      System.out.println("varChar: " + varChar);
			      System.out.println("varFloat: " + varFloat);
			      System.out.println("varDouble: " + varDouble);
			      System.out.println("varInt: " + varInt);
			      System.out.println("varLong: " + varLong);
			      System.out.println("varBooleano: " + varBooleano);
			      System.out.println("varTexto: " + varTexto);
			      
			 //   Esses são os valores possíveis para cada tipo de variável
			      
			      System.out.println("                        ");
			      System.out.println("Valores possíveis para cada tipo de dados primitivo ");
			      System.out.println("                        ");
				  System.out.println("Menor Byte: " + Byte.MIN_VALUE);
				  System.out.println("Maior Byte: " + Byte.MAX_VALUE);         
				  System.out.println("Menor Short: " + Short.MIN_VALUE);
				  System.out.println("Maior Short: " + Short.MAX_VALUE);
				  System.out.println("Menor int: " + Integer.MIN_VALUE);
				  System.out.println("Maior int: " + Integer.MAX_VALUE);
				  System.out.println("Menor Long: " + Long.MIN_VALUE);
				  System.out.println("Maior Long: " + Long.MAX_VALUE );
				  System.out.println("Menor Float: " + Float.MIN_VALUE);
				  System.out.println("Maior Float: " + Float.MAX_VALUE);
				  System.out.println("Menor Double: " + Double.MIN_VALUE);
				  System.out.println("Maior Double: " + Double.MAX_VALUE);
				     

	}

}
