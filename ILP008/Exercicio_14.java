package Exercicios;
import java.util.Scanner;


public class Exercicio_14 {

	public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("Insira um valor inteiro qualquer: ");
            int valor = ler.nextInt();

            if (valor > 10) {
                System.out.println("O VALOR INSERIDO É MAIOR QUE 10!");
            } else {
                System.out.println("O VALOR INSERIDO NÃO É MAIOR QUE 10!");
			}
		}
	}
}