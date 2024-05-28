public abstract class CarroDeCorrida {
    protected int velocidade;
    protected int velocidadeMaxima;
    protected String nome;

    public CarroDeCorrida(String nome, int velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidade = 0;
    }

    public abstract void acelerar() ;

    public void frear() {
        velocidade /= 2;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int novaVelocidade) {
        this.velocidade = novaVelocidade;
    }

    // public int getPotencia() {
    //     return potencia;
    // }

    // public void setPotencia(int novaPotencia) {
    //     this.potencia = novaPotencia;
    // }

    public void imprimir() {
        System.out.println("O carro " + nome + " está a velocidade de " + velocidade + "km/h.");
    }
}
