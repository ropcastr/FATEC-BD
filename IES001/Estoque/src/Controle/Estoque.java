package Controle;

import java.util.LinkedList;
import java.util.List;

public class Estoque {
    private List<Produto> itens = new LinkedList<Produto>();

    // Método para cadastrar um produto no estoque
    public void cadastroProduto(Produto item) {
        itens.add(item);
    }

    // Método para buscar produtos pelo nome e retornar uma lista de produtos encontrados
    public List<Produto> buscarProdutoNome(String nome) {
        List<Produto> produtosEncontrados = new LinkedList<Produto>();
        for (Produto item : itens) {
            if (item.getNome().equals(nome)) {
                produtosEncontrados.add(item);
            }
        }
        return produtosEncontrados;
    }

    // Método para obter a lista completa de itens em estoque
    public List<Produto> getItens() {
        return itens;
    }
}
