package Exercicios;
import java.util.Scanner;


public class Exercicio_7 {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner (System.in)) {
			System.out.println("Digite a sua idade em anos (exatos): ");
			int ano = ler.nextInt();
			System.out.println("Digite o restante da sua idade em meses (do último ano até o mês atual) ");
			int mes = ler.nextInt();
			System.out.println("Digite o restante da sua idade em dias (do fim do último mês até o dia de hoje) ");
			int dias = ler.nextInt();
			int idade = (ano * 365) + (mes * 30) + dias;
			System.out.println("Sua idade em dias é " + idade);
		}
			
		}

	}