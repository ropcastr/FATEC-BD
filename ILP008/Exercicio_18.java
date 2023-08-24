package Exercicios;
import java.util.Scanner;


public class Exercicio_18 {

	public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("Informe o ano atual: ");
            int ano = ler.nextInt();
            System.out.println("Informe o ano em que nasceu: ");
            int nas = ler.nextInt();
            int idade = ano - nas;
            if (idade >= 16) {
            	System.out.println("Você pode votar este ano");
            } else {
            	System.out.println("Você não pode votar este ano");
			}
		}
	}
}

