package Exercicios;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio_13 {

	public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            DecimalFormat decimalFormat = new DecimalFormat("0.00");
            System.out.println("Insira o valor da primeira nota: ");
            float n1 = ler.nextFloat();
            System.out.println("Insira o valor da segunda nota: ");
            float n2 = ler.nextFloat();
            System.out.println("Insira o valor da terceira nota: ");
            float n3 = ler.nextFloat();
            float mediaf = (float) (((n1 * 2) + (n2 * 3) + (n3 * 5))/ 10);

            System.out.println("A sua média final é de: " + decimalFormat.format(mediaf));
		}
			
	}

}