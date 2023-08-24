package Exercicios;
import java.util.Scanner;


public class Exercicio_17 {

	public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("Insira a nota da 1ª avaliação: ");
            float av1 = ler.nextFloat();
            System.out.println("Insira a nota da 2ª avaliação: ");
            float av2 = ler.nextFloat();
            float nota = (av1 + av2) / 2;
            if (nota >= 6) {
            	System.out.println("Você foi APROVADO com média final de: " + nota);
            } else {
            	System.out.println("Você foi REPROVADO com média final de: " + nota);
			}
		}
	}
}

