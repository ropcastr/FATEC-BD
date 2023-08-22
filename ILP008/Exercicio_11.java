package Exercicios;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio_11 {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner (System.in)) {
			DecimalFormat Decimal = new DecimalFormat("0.00");
			System.out.println("Insira o valor do salário fixo: ");
			float salario = ler.nextFloat();
			System.out.println("Insira o valor da comissão por veículo: ");
			float tip = ler.nextFloat();
			System.out.println("Insira a quantidade de veículos vendidos: ");
			int qtd = ler.nextInt();
			System.out.println("Insira o valor total das vendas efetuadas: ");
			float vendas = ler.nextFloat();			
			float total = (float) (salario + (tip * qtd) + (vendas * 0.05));

			System.out.println("O valor do salário a receber é de: R$" + (Decimal.format (total)));
		}
			
		}

	}