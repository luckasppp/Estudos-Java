package main.java.producao;
import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {
    private Map<Produto, Integer> itens;

    public CarrinhoDeCompras() {
        this.itens = new HashMap<>();
    }

    public void adicionaProduto(Produto produto, int quantidade) {
        if (itens.containsKey(produto)) {
            int novaQuantidade = itens.get(produto) + quantidade;
            itens.put(produto, novaQuantidade);
        } else {
            itens.put(produto, quantidade);
        }
    }

    public void removeProduto(Produto produto, int quantidade) {
        if (itens.containsKey(produto)) {
            int novaQuantidade = itens.get(produto) - quantidade;
            if (novaQuantidade > 0) {
                itens.put(produto, novaQuantidade);
            } else {
                itens.remove(produto);
            }
        }
    }

    public double calcularValorTotal() {
        double total = 0.0;
        for (Map.Entry<Produto, Integer> entry : itens.entrySet()) {
            Produto produto = entry.getKey();
            int quantidade = entry.getValue();
            total += produto.getPreco() * quantidade;
        }
        return total;
    }

    public Map<Produto, Integer> getItens() {
        return itens;
    }
}
