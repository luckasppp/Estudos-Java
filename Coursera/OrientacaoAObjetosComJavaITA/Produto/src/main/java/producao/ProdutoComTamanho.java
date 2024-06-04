package main.java.producao;

import java.util.Objects;

public class ProdutoComTamanho extends Produto {
    private double tamanho;
    
    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null || this.getClass() != obj.getClass())
            return false;
        ProdutoComTamanho produtoComTamanho = (ProdutoComTamanho) obj;
        return this.getCodigo() == produtoComTamanho.getCodigo() && this.getTamanho() == produtoComTamanho.getTamanho();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tamanho);
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
}
