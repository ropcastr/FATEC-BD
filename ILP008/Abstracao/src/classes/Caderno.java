package classes;

public class Caderno {
	// Atributos
	private int folhas;
	private int qtdMaterias;
	private String[] materias;
	

    // Construtor para inicialização
    public Caderno(int folhas, int qtdMaxMaterias, String[] materias) {
        this.folhas = folhas;
        this.qtdMaterias = 0; // Inicialmente não há matérias no caderno
        this.materias = new String[qtdMaxMaterias];
    }

	// Método para Adicionar Matéria
    public void adicionarMateria(String materia) {
        if (qtdMaterias < materias.length) { // Verifica se há espaço disponível
            materias[qtdMaterias] = materia;
            qtdMaterias++;
        } else {
            System.out.println("O caderno está cheio. Não é possível adicionar mais matérias.");
        }
    }

    // Método para Listar Matérias
    public void listarMaterias() {
        System.out.println("Matérias no caderno:");
        for (int i = 0; i < qtdMaterias; i++) {
            System.out.println(materias[i]);
        }
    }

    // Método para Verificar o Número de Folhas Restantes
    public int getFolhasRestantes() {
        return folhas;
    }

    // Método para Escrever em uma Folha com base na quantidade de linhas
    public void escrever(int linhasEscritas) {
        int linhasPorFolha = 20; // Cada folha tem 20 linhas

        if (folhas >= (linhasEscritas / linhasPorFolha) + 1) {
            int folhasUtilizadas = (linhasEscritas / linhasPorFolha) + 1;
            folhas -= folhasUtilizadas;

            System.out.println("Escrevendo em " + folhasUtilizadas + " folha(s) (" + linhasEscritas + " linhas no total).");
        } else {
            System.out.println("Não há folhas suficientes para escrever " + linhasEscritas + " linhas.");
        }
    }
	
	//Método para adicionar folha
	public void adicionarFolhas(int quantidade) {
	    folhas += quantidade;
	}
	//Método para remover folha
	public void removerFolhas(int quantidade) {
	    if (folhas >= quantidade) {
	        folhas -= quantidade;
	    } else {
	        System.out.println("Não há folhas suficientes para remover.");
	    }
	}

	//Getters and Setters
	public int getFolhas() {
		return folhas;
	}

	public void setFolhas(int folhas) {
		this.folhas = folhas;
	}

	public int getQtdMaterias() {
		return qtdMaterias;
	}

	public void setQtdMaterias(int qtdMaterias) {
		this.qtdMaterias = qtdMaterias;
	}

	public String[] getMaterias() {
		return materias;
	}

	public void setMaterias(String[] materias) {
		this.materias = materias;
	}	

	
}