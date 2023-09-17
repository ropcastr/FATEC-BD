package classes;
import java.util.Scanner;

public class Agenda {
	// Métodos
	private int dia;
	private int mes;
	private int ano;
	private String anotar;
	private String evento;
	
	
	//Causas
	public Agenda(int dia, int mes, int ano, String anotar, String evento) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.anotar = anotar;
		this.evento = evento;
	}


	// Métodos
	public void eventos(String escolha) {
	    if (escolha.equalsIgnoreCase("Sim")) {
	        try (Scanner ler = new Scanner(System.in)) {
				System.out.println("Informe o evento que gostaria de anotar para: " + dia + "/" + mes + "/" + ano);
				evento = ler.nextLine();
			}
	    } else if (escolha.equalsIgnoreCase("Não")) {
	        System.out.println("Você decidiu não inserir um evento.");
	    } else {
	        System.out.println("Digite 'Sim' para inserir um evento ou 'Não' para cancelar.");
	    }
	}




	// Getting and Settings
	public int getDia() {
		return dia;
	}



	public void setDia(int dia) {
		this.dia = dia;
	}



	public int getMes() {
		return mes;
	}



	public void setMes(int mes) {
		this.mes = mes;
	}



	public int getAno() {
		return ano;
	}



	public void setAno(int ano) {
		this.ano = ano;
	}



	public String getAnotar() {
		return anotar;
	}



	public void setAnotar(String anotar) {
		this.anotar = anotar;
	}



	public String getEvento() {
		return evento;
	}



	public void setEvento(String evento) {
		this.evento = evento;
	}
	
	
	
}
