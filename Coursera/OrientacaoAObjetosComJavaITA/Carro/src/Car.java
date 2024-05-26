public class Car {
   private int potencia;
   private int velocidade;
   private String nome;

   public void acelerar() {
       velocidade += potencia;
   }

   public void frear() {
       velocidade = velocidade/2;
   }

   public int getVelocidade() {
       return velocidade;
   }

   public void setVelocidade(int novaVelocidade) {
       this.velocidade = novaVelocidade;
   }

   public int getPotencia() {
       return potencia;
   }

   public void setPotencia(int novaPotencia) {
       this.potencia = novaPotencia;
   }

   public void imprimir() {
       System.out.println("O carro " + nome + " está a velocidade de " + velocidade + "km/h.");
   }
}
