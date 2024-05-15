public class Circulo {
    private double raio;
    private String color;
    private double area;
    private double diametro;
    private double circunferencia;

    // Método Construtor
    public Circulo(double raio, String color) {
        this.raio = raio;
        this.color = color;
    }

    // Getters
    public double getRaio() {
        return raio;
    }

    public String getColor() {
        return color;
    }

    // Setters
    public void changeRaio(double raio) {
        this.raio = raio;
    }

    public void changeColor(String color) {
        this.color = color;
    }

    // Método para calcular a área
    public void area() {
        this.area = 3.14159 * Math.pow(this.raio, 2);
    }

    // Método para calcular o diâmetro
    public void diametro() {
        this.diametro = 2 * this.raio;
    }

    // Método para calcular circunferência
    public void circunferencia() {
        this.circunferencia = 2 * 3.14159 * this.raio;
    }

    // Método para mostrar informações do círculo
    public void information() {
        System.out.println("Cor: " + color);
        System.out.println("Raio: " + raio);
        System.out.println("Área: " + area);
        System.out.println("Diâmetro: " + diametro);
        System.out.println("Circunferência: " + circunferencia);
    }


    public static void main(String[] args) {        
        System.setProperty("file.encoding", "UTF-8");
        Circulo redondo = new Circulo(17, "Azul");
        
        redondo.area();
        redondo.circunferencia();
        redondo.diametro();
        redondo.information();
    }

}
