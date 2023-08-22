package Exercicios;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio_12 {

	public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            DecimalFormat decimalFormat = new DecimalFormat("0.00");
            System.out.println("Insira a temperatura em Fahrenheit: ");
            float tempf = ler.nextFloat();
            float tempc = (float) (((tempf - 32) * 5) / 9);

            System.out.println("A temperatura em graus Celsius é de: " + decimalFormat.format(tempc) + "°C");
		}
			
	}

}