public class Carro {
   private int potencia;
   private int velocidade;
   private String nome;

   public Carro(int potencia) {
    this.potencia = potencia;
   }

   public Carro(String nome) {
    this.nome = nome;
   }

   public Carro(int potencia, int velocidade, String nome) {
    this.potencia = potencia;
    this.velocidade = velocidade;
    this.nome = nome;
   }

   public void acelerar() {
    velocidade += potencia;
   }

   public void frear() {
    velocidade = velocidade/2;
   }

   int getVelocidade() {
    return velocidade;
   }
   int getPotencia() {
    return potencia;
   }
   void imprimir() {
    System.out.println("O carro " + nome + " está a velocidade de " + velocidade + "km/h.");
   }

}
