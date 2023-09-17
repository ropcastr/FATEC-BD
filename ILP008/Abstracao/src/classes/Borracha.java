package classes;

public class Borracha {
	// Atributos
	private String cor;
	private String formato;
	private double comprimento;
	private double altura;
	private double largura;
	private String dureza;
	
	// Cause
	public Borracha(String cor, String formato, double comprimento, double altura, double largura, String dureza) {
		super();
		this.cor = cor;
		this.formato = formato;
		this.comprimento = comprimento;
		this.altura = altura;
		this.largura = largura;
		this.dureza = dureza;
	}

	
	// Métodos
	public void apagar (double qtd) {
		if (comprimento<(comprimento-0.1)){
			comprimento -= comprimento;
			
		}else if (altura<(altura-0.1)){
			altura -= altura;
			
		}else if (largura<(largura-0.1)) {
			largura -= largura;
		}

	}

	// Getting and Settings
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public String getDureza() {
		return dureza;
	}

	public void setDureza(String dureza) {
		this.dureza = dureza;
	}
	
}


