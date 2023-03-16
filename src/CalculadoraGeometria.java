import java.util.Scanner;

public class CalculadoraGeometria {

	public void DecideForma() {
		Scanner input = new Scanner(System.in);

		System.out.println("Escolha a forma geometrica na qual deseja calcular area e perimetro/circunferencia");
		System.out.println("[1]Quadrado \n[2]Triangulo \n[3]Circulo");
		int forma = input.nextInt();

		switch (forma) {
		case 1:
			System.out.println("Digite quanto mede um dos lados de seu quadrado:");
			double lado = input.nextDouble();

			Quadrado quadrado = new Quadrado(lado);
			System.out.printf("O seu quadrado tem um perimetro de %.2f e uma area de  %.2f",
					quadrado.calculaPerimetro(), quadrado.calculaArea());

			break;
		case 2:
			System.out.println(
					"Para calcular as informações de seu triangulo peço que você considere nele sua base, um lado A, um lado B e sua altura");
			System.out.println("Digite o lado A:");
			double ladoA = input.nextDouble();
			System.out.println("Digite o lado B:");
			double ladoB = input.nextDouble();
			System.out.println("Digite a base:");
			double base = input.nextDouble();
			System.out.println("Digite a altura:");
			double altura = input.nextDouble();

			Triangulo triangulo = new Triangulo(ladoA, ladoB, base, altura);

			System.out.printf("O seu triangulo tem um perimetro de %.2f e uma area de  %.2f",
					triangulo.calculaPerimetro(), triangulo.calculaArea());
			break;
		case 3:
			System.out.println(
					"Para calcular as informações de seu circulo vou utlizar o valor de PI arredondado a 3,14");
			System.out.println("Digite o raio do circulo :");
			double raio = input.nextDouble();

			Circulo circulo = new Circulo(raio);

			System.out.printf("O seu circulo tem uma circunferencia de %.2f e uma area de  %.2f",
					circulo.calculaPerimetro(), circulo.calculaArea());

			break;

		default:
			System.out.println("Não conseguimos processar sua solicitação, por favor tente novamente");
		}

	}

	private class Quadrado implements Formas {

		private double lado;

		public Quadrado(double lado) {
			this.lado = lado;
		}

		@Override
		public double calculaArea() {
			return this.lado * this.lado;

		}

		@Override
		public double calculaPerimetro() {
			return this.lado * 4;

		}
	}

	private class Triangulo implements Formas {

		private double ladoA;

		private double ladoB;

		private double base;

		private double altura;

		public Triangulo(double ladoA, double ladoB, double base, double altura) {
			this.ladoA = ladoA;
			this.ladoB = ladoB;
			this.base = base;
			this.altura = altura;
		}

		@Override
		public double calculaArea() {
			return (this.base * this.altura) / 2;

		}

		@Override
		public double calculaPerimetro() {
			return this.ladoA + this.ladoB + this.base;

		}

	}

	private class Circulo implements Formas {

		private static double PI = 3.14;
		private double raio;

		public Circulo(double raio) {
			super();
			this.raio = raio;
		}

		@Override
		public double calculaArea() {
			return PI * (this.raio * this.raio);
		}

		@Override
		public double calculaPerimetro() {
			return 2 * PI * this.raio;
		}

	}
}
