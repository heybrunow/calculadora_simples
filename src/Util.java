import java.util.Scanner;

public class Util {
	
	static Scanner input = new Scanner(System.in);
	
	public static boolean repeteProcesso() {
		int resposta;
		do {
			System.out.print("\nDeseja executar novamente algum calculo? \n[1] - SIM\n[2] - NÃO");
			resposta = input.nextInt();
			if(resposta == 2) System.out.println("Programa encerrado!");
		}while(resposta!= 1 && resposta != 2);
		return resposta ==1 ? true: false;

			
	}
}
