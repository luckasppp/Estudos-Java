package com.lucasdamasceno;

public class Compra {
    private int valorTotal;
    private int numeroParcelas;

    // à vista
    public Compra(int valor) {
        this.valorTotal = valor;
        this.numeroParcelas = 1;
    }

    // parcelado
    public Compra(int qtdParcelas, int valorParcela) {
        this.numeroParcelas = qtdParcelas;
        this.valorTotal = valorParcela * qtdParcelas;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public int getValorParcelas() {
        return valorTotal / numeroParcelas;
    }
}
