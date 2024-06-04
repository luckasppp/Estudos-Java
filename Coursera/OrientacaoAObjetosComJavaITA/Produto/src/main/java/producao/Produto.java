package main.java.producao;
import java.util.Objects;

public class Produto {
    private String nome;
    private int codigo;
    private double preco;

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || this.getClass() != obj.getClass())
            return false;
        Produto produto = (Produto) obj;
        return this.codigo == produto.codigo;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}