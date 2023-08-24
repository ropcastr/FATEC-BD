package Exercicios;
import java.util.Scanner;


public class Exercicio_19 {

	public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("Insira um valor inteiro qualquer: ");
            int valor1 = ler.nextInt();
            System.out.println("Insira outro valor inteiro qualquer: ");
            int valor2 = ler.nextInt();
            if (valor1 > valor2) {
            	System.out.println("O maior número é: " + valor1);
            } else if (valor2 > valor1){
            	System.out.println("O maior número é: " + valor2);
            } else {
            	System.out.println("Os valores informados são iguais");
			}
		}
	}
}

