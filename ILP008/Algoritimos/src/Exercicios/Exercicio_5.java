package Exercicios;
import java.util.Scanner;


public class Exercicio_5 {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner (System.in)) {
			System.out.println("Digite um número: ");
			int num1 = ler.nextInt();
			int num2 = num1 - 1;
			System.out.println("O antecessor de " + num1 + " é " + num2);
		}
			
		}
		

	}