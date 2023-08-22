package Exercicios;
import java.util.Scanner;


public class Exercicio_6 {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner (System.in)) {
			System.out.println("Digite o valor da base do retângulo: ");
			int base = ler.nextInt();
			System.out.println("Digite o valor da altura do retângulo: ");
			int altura = ler.nextInt();
			int area = base * altura;
			System.out.println("A área do retângulo é " + area);
		}
			
		}

	}