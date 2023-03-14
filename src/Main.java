import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		boolean repetir = true;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Seja bem vindo a calculadora simples!\n"
				+ "Oferecemos as opções para se executar calculos de:");
		
		while(repetir) {
			System.out.println("================================================================================");
			System.out.println("[1] - Operação simples relacionadas a adição, subtração, multiplicação e divisão");
			System.out.println("[2] - Formulas geometricas de área e perimetro de quadros circulos e triangulos");
			System.out.println("[3] - IMC(Indice de massa corporal) te dizendo qual seu peso ideal!");
			System.out.println("================================================================================");
			System.out.println("Escolha a operação desejada!");
			
			int operacao = input.nextInt();
			
			switch(operacao) {
			  case 1:
				  Calculadora.decideOperacao();
				  repetir = Util.repeteProcesso();
			    break;
			  case 2:
			    //TODO: em desenvolvimento
				  System.out.println("EM DESENVOLVIMENTO");
			    break;
			  case 3:
				//TODO: em desenvolvimento
				  System.out.println("EM DESENVOLVIMENTO");
				  break;
			  default:
			    System.out.println("Não conseguimos processar sua solicitação, por favor tente novamente");
			}
			
			
			
		}
		
		
		
		
		
		

		
		
	}
	
	

	
	


}
