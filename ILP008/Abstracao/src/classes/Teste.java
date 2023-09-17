package classes;

public class Teste {

    public static void main(String[] args) {
        // Criando uma instância da classe Agenda
        Agenda a1 = new Agenda(8, 8, 2022, "Sim", "Ver a crush");

        // Usando os métodos getters e setters da classe Agenda
        a1.setDia(12);
        System.out.println("O dia é: " + a1.getDia());

        int mes = a1.getMes();
        System.out.println("O mês é: " + mes);

        a1.setAno(2023);
        System.out.println("O ano é: " + a1.getAno());

        String anotacao = a1.getAnotar(); 
        System.out.println(anotacao + "! Você vai agendar um evento.");

        a1.eventos("Sim"); 

        String evento = a1.getEvento();
        System.out.println("O evento será: " + evento);

        // Criando uma instância da classe Borracha
        Borracha b1 = new Borracha("azul", "retangular", 10, 5, 5, "macia");

        // Usando os métodos getters e setters da classe Borracha
        b1.setComprimento(9);
        System.out.println("O tamanho da borracha é: " + b1.getComprimento());

        b1.setCor("branca");
        System.out.println("A cor da borracha é: " + b1.getCor());
        
        // Criando uma instância da classe Caderno
        Caderno c1 = new Caderno(200, 4, new String[]{"Matematica"});

        // Usando os métodos getters e setters da classe Caderno
        int folhas = c1.getFolhas();
        System.out.println("Quantidade de folhas é: " + folhas);

        int qtdMaterias = c1.getQtdMaterias();
        System.out.println("A quantidade de matérias do caderno é: " + qtdMaterias);

        // Obtendo e imprimindo as matérias no caderno
        System.out.println("Matérias atuais no caderno: " + c1.getMaterias());
        
        String[] materias = new String[]{"Matematica", "Fisica", "Programação", "Banco de dados"};
        System.out.println("Adicionando matérias no caderno:");
        c1.setMaterias(materias);
        System.out.println("Matérias no caderno:");
        for (String materia : c1.getMaterias()) {
            System.out.println(materia);
        }
    }
}
