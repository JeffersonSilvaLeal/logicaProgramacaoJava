package logica.variaveis;

//Os tipos primitivos s�o tipos de dados pr�-definidos e que ocupam um espa�o espec�fico em mem�ria para armazenar o conte�do
//Vari�veis s�o �reas de mem�rias que se pode armazenar informa��es/dados
//Vari�veis fortemente tipada s�o aquela em que os objetos/vari�veis tem um tipo bem definido e que precisa ser informado no momento de sua declara��o

public class Variaveis {

	public static void main(String[] args) {

		// Tipo       Nome      Atribui��o  Valor
				byte      tipoByte      =        127;
				short     tipoShort     =        32767;
				char      tipoChar      =        'C';
				float     tipoFloat     =        2.6f;
				double    tipoDouble    =        3.59;
				int       tipoInt       =        2147483647;
				long      tipoLong      =        9223372036854775807L;
				boolean   tipoBooleano  =        true;	
				
				
		    // Apartir do java 10 o "VAR" foi incluido ele permite que vo�� defina uma vari�vel sem especificar o seu tipo, e ela se comportar� de acordo com o receber	     

			// Tipo       Nome      Atribui��o  Valor

				var       varByte       =        127;
				var       varShort      =        32765;
				var       varChar       =        'B';
				var       varFloat      =        5.6f;
				var       varDouble     =        4.00;
				var       varInt        =        111111;
				var       varLong       =        25252525;
				var       varBooleano   =        false;
				var       varTexto      =        "texto";
				
				
			// Impress�o dos dados atribuido a cada vari�vel
				  System.out.println("Valor do tipoByte = " + tipoByte);
			      System.out.println("Valor do tipoShort = " + tipoShort);
			      System.out.println("Valor do tipoChar = " + tipoChar);
			      System.out.println("Valor do tipoFloat = " + tipoFloat);
			      System.out.println("Valor do tipoDouble = " + tipoDouble);
			      System.out.println("Valor do tipoInt = " + tipoInt);
			      System.out.println("Valor do tipoLong = " + tipoLong);
			      System.out.println("Valor do tipoBooleano = " + tipoBooleano);
			      System.out.println("                 ");
			      
			 //   Impress�o do tipo 'Var' 
			      System.out.println("Valor atribuido a vari�vel Var"); 
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
			      
			 //   Esses s�o os valores poss�veis para cada tipo de vari�vel
			      
			      System.out.println("                        ");
			      System.out.println("Valores poss�veis para cada tipo de dados primitivo ");
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
