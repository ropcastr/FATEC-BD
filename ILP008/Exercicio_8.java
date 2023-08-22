package Exercicios;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio_8 {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner (System.in)) {
			DecimalFormat Decimal = new DecimalFormat("0.0");
			System.out.println("Insira o número de eleitores que votaram em um candidato: ");
			int valido = ler.nextInt();
			System.out.println("Insira o número de eleitores que votaram em branco: ");
			int branco = ler.nextInt();
			System.out.println("Insira o número de eleitores que anularam o voto: ");
			int nulo = ler.nextInt();
			float total = (float) (valido + branco + nulo);
			float p_valido = (float) ((valido * 100) / total);
			float p_branco = (float) ((branco * 100) / total);
			float p_nulo = (float) ((nulo * 100) / total);
			System.out.println("Do total de " + total + " eleitores," + (Decimal.format (p_valido)) + "% são votos válidos.");
			System.out.println("Do total de " + total + " eleitores," + (Decimal.format (p_branco)) + "% são votos brancos.");
			System.out.println("Do total de " + total + " eleitores," + (Decimal.format (p_nulo)) + "% são votos nulos.");
		}
			
		}

	}