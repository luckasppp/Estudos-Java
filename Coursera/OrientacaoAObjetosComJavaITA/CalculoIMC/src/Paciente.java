public class Paciente {
    public double peso = 0;
    public double altura = 0;

    public Paciente() {

    }

    public Paciente(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC() {
        return this.peso/(this.altura*this.altura);
    }

    public String diagnostico(){
        if(calcularIMC() < 16) {
            return "Baixo peso muito grave";
        } else if(calcularIMC() >= 16 && calcularIMC() < 17) {
            return "Baixo peso grave";
        } else if(calcularIMC() >= 17 && calcularIMC() < 18.50) {
            return "Baixo peso";
        } else if(calcularIMC() >= 18.5 && calcularIMC() < 25) {
            return "Peso normal";
        } else if(calcularIMC() >= 25 && calcularIMC() < 30) {
            return "Sobrepeso";
        } else if(calcularIMC() >= 30 && calcularIMC() < 35) {
            return "Obesidade grau I";
        } else if(calcularIMC() >= 35 && calcularIMC() < 40) {
            return "Obesidade grau II";
        }
        return "Obesidade grau III (obesidade mórbida)";
    }
}
