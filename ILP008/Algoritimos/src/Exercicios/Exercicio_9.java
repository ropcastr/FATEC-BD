package Exercicios;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio_9 {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner (System.in)) {
			DecimalFormat Decimal = new DecimalFormat("0.00");
			System.out.println("Insira o valor do salário mensal: ");
			float salario = ler.nextFloat();
			System.out.println("Insira o valor percentual de reajuste: ");
			float reajuste = ler.nextFloat();

			float novo = (float) ((salario * (reajuste/100))+salario);

			System.out.println("Seu salário mensal reajustado é de: R$" + (Decimal.format (novo)));

		}
			
		}

	}