import java.util.Scanner;

public class CalculadoraIMC {

	static Scanner input = new Scanner(System.in);

	public static void calculaIMC() {

		double peso, altura;

		System.out.println("O calculo do IMC é feito com base na sua altura e em seu peso,"
				+ " por favor insira os valores para execurtamos o calculo para você (peso em kg,grama e altura em metro,cm)");

		System.out.println("Qual seu peso?");
		peso = input.nextDouble();
		System.out.println("Qual sua altura?");
		altura = input.nextDouble();

		double imc = peso / (altura * altura);

		System.out.printf("O seu IMC é: %.2f e sua classificação é: %s%n", imc, consultaClassificacao(imc));

		exibeTabelaIMC();

	}

	public static String consultaClassificacao(double imc) {

		if (imc < 18.5) {
			return "Abaixo do peso normal";
		} else if (imc >= 18.5 && imc <= 24.9) {
			return "Peso normal";
		} else if (imc >= 25.0 && imc <= 29.9) {
			return "Excesso de peso";
		} else if (imc >= 30.0 && imc <= 34.9) {
			return "Obesidade de classe I";
		} else if (imc >= 35.0 && imc <= 39.9) {
			return "Obesidade de classe II";
		} else {
			return "Obesidade de classe III";
		}

	}

	public static void exibeTabelaIMC() {
		System.out.println("Você gostaria de ver a tabela IMC completa? \n[1] - SIM \n[2] - NÃO");
		int resposta = input.nextInt();

		if (resposta == 1) {
			System.out.println("==========================================");
			System.out.println("Abaixo de 18,5 - Abaixo do peso normal");
			System.out.println("18,5 a 24,9    - Peso normal");
			System.out.println("25,0 a 29,9    - Excesso de peso");
			System.out.println("30,0 a 34,9    - Obesidade de classe I");
			System.out.println("35,0 a 39,9    - Obesidade de classe II");
			System.out.println("Acima de 40,0  - Obesidade de classe III");
			System.out.println("==========================================");
		}

	}
}
