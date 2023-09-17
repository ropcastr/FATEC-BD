package Exercicios;
import java.util.Scanner;


public class Exercicio_16 {

	public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("Digite a quantidade de maças que deseja comprar: ");
            int qtd = ler.nextInt();

            if (qtd >= 12) {
            	float valor1 = (float) (qtd * 1);
                System.out.println("O VALOR A SER PAGO É DE: R$" + valor1);
            } else {
            	float valor2 = (float) (qtd * 1.30);
                System.out.println("O VALOR A SER PAGO É DE: R$" + valor2);
			}
		}
	}
}

