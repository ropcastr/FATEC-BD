package Exercicios;
import java.util.Scanner;


public class Exercicio_15 {

	public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("Insira um valor inteiro qualquer: ");
            int valor = ler.nextInt();

            if (valor >= 0) {
                System.out.println("O VALOR INSERIDO É POSITIVO!");
            } else {
                System.out.println("O VALOR INSERIDO É NEGATIVO!");
			}
		}
	}
}