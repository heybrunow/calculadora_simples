import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		boolean repetir = true;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Seja bem vindo a calculadora simples!\n"
				+ "Oferecemos as opções para se executar calculos de:");
		
		while(repetir) {
			System.out.print("================================================================================\n");
			System.out.print("[1] - Operação simples relacionadas a adição, subtração, multiplicação e divisão\n");
			System.out.print("[2] - Formulas geometricas de área e perimetro de quadros circulos e triangulos\n");
			System.out.print("[3] - IMC(Indice de massa corporal) te dizendo qual seu peso ideal!\n");
			System.out.print("================================================================================\n");
			System.out.println("Escolha a operação desejada!");
			
			int operacao = input.nextInt();
			
			switch(operacao) {
			  case 1:
				  Calculadora.decideOperacao();
				  repetir = Util.repeteProcesso();
			    break;
			  case 2:
				  System.out.println("EM DESENVOLVIMENTO");
			    break;
			  case 3:
				    CalculadoraIMC.calculaIMC();
				    repetir = Util.repeteProcesso();
				  break;
			  default:
				System.out.println("================================================================================");
			    System.out.println("[ERRO] - Não conseguimos processar sua solicitação, por favor tente novamente");
			}
			
			
			
		}
		
		
		
		
		
		

		
		
	}
	
	

	
	


}
