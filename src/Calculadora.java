import java.util.Scanner;

public class Calculadora {
	
	public static void decideOperacao () {
		Scanner input = new Scanner(System.in);
		int operacao;
		
		System.out.println("Escolha qual tipo de operação deseja executar:");
		System.out.println("[1] - ADIÇÃO");
		System.out.println("[2] - SUBTRAÇÃO");
		System.out.println("[3] - MULTIPLICAÇÃO");
		System.out.println("[4] - DIVISÃO");
		
		operacao = input.nextInt();
		
		
		switch(operacao) {
		  case 1:
			 System.out.println(Calculadora.soma()); 
		    
		    break;
		  case 2:
			  System.out.println(Calculadora.subtrai());
		    break;
		  case 3:
			  System.out.println(Calculadora.multplica());
			  break;
		  case 4:
			  System.out.println(Calculadora.divide());
			  break;
		  default:
		    System.out.println("Não conseguimos processar sua solicitação, por favor tente novamente");
		}
		 
	}
	
	public static String soma() {
		Scanner input = new Scanner(System.in);
	    System.out.println("Digite 2 valores para serem somados:");
	    System.out.println("valor 1:");
	    int val1 = input.nextInt();
	    System.out.println("valor 2:");
	    int val2 = input.nextInt();
	    int soma = val1 + val2;
	   return "O valor de sua soma é de: "+ soma+"\n============================================";
	   

	}
	
	public static String subtrai() {
		Scanner input = new Scanner(System.in);
	    System.out.println("Digite 2 valores para serem subtraidos:");
	    System.out.println("valor 1:");
	    int val1 = input.nextInt();
	    System.out.println("valor 2:");
	    int val2 = input.nextInt();
	    int subtracao = val1 - val2;
	   return "O valor de sua subtracao é de: "+ subtracao+"\n============================================";

	}
	
	public static String multplica() {
		Scanner input = new Scanner(System.in);
	    System.out.println("Digite 2 valores para serem multiplicados:");
	    System.out.println("valor 1:");
	    int val1 = input.nextInt();
	    System.out.println("valor 2:");
	    int val2 = input.nextInt();
	    int multiplicacao = val1 * val2;
	   return "O valor de sua subtracao é de: "+ multiplicacao+"\n============================================";

	}
	
	public static String divide() {
		Scanner input = new Scanner(System.in);
	    System.out.println("Digite 2 valores para serem divididos:");
	    System.out.println("valor 1:");
	    int val1 = input.nextInt();
	    System.out.println("valor 2:");
	    int val2 = input.nextInt();
	    int divisao = val1 / val2;
	   return "O valor de sua subtracao é de: "+ divisao+"\n============================================";

	}

}
