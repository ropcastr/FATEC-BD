package Exercicios;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio_10 {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner (System.in)) {
			DecimalFormat Decimal = new DecimalFormat("0.00");
			System.out.println("Insira o valor de fábrica do veículo: ");
			float fabrica = ler.nextFloat();
			System.out.println("Insira o percentual do distribuidor: ");
			float dist = ler.nextFloat();
			System.out.println("Insira o percentual de imposto: ");
			float tax = ler.nextFloat();
			float custo = (float) ((fabrica * (dist/100)) + (fabrica * (tax/100)) + fabrica);

			System.out.println("O cussto total do veículo é de: R$" + (Decimal.format (custo)));
		}
			
		}

	}