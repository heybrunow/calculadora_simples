import java.util.Scanner;

public class Util {
	
	static Scanner input = new Scanner(System.in);
	
	public static boolean repeteProcesso() {
		int resposta;
		do {
			System.out.println("Deseja executar novamente algum calculo? \n[1] - SIM\n[2] - NÃO");
			resposta = input.nextInt();
			
		}while(resposta!= 1 && resposta != 2);
		return resposta ==1 ? true: false;

			
	}
}
