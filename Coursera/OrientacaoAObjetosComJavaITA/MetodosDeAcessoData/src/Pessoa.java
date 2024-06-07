import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Pessoa {
    private LocalDate nascimento = LocalDate.of(1900, 01, 01);
    private Calendario data;

    public Pessoa (String dataNascimento, Calendario data) {
        this.data = data;
        dataNascimento = dataNascimento.replace("-", "/");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            this.setNascimento(LocalDate.parse(dataNascimento, formatter));
        } catch (DateTimeParseException error) {
            System.err.println("Formato de data inválido. Use dd/MM/yyyy ou dd-MM-yyyy.");
            throw error;
        }
    }

    public Pessoa (String dataNascimento) {
        this.data = new Calendario();
        dataNascimento = dataNascimento.replace("-", "/");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            this.setNascimento(LocalDate.parse(dataNascimento, formatter));
        } catch (DateTimeParseException error) {
            System.err.println("Formato de data inválido. Use dd/MM/yyyy ou dd-MM-yyyy.");
            throw error;
        }
    }

    private void setNascimento(LocalDate dataNascimento) {
        this.nascimento = dataNascimento;
    }

    public String getNascimento() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return this.nascimento.format(formatter);
    }

    public int getIdade(){
        Period idade = Period.between(this.nascimento, this.data.agora());
        return idade.getYears();
    }

    public String getSigno() {
        int dia = this.nascimento.getDayOfMonth();
        int mes = this.nascimento.getMonthValue();

        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 20)) {
            return "Áries";
        } else if ((mes == 4 && dia >= 21) || (mes == 5 && dia <= 20)) {
            return "Touro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            return "Gêmeos";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 21)) {
            return "Câncer";
        } else if ((mes == 7 && dia >= 22) || (mes == 8 && dia <= 22)) {
            return "Leão";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            return "Virgem";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            return "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            return "Escorpião";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            return "Sagitário";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 20)) {
            return "Capricórnio";
        } else if ((mes == 1 && dia >= 21) || (mes == 2 && dia <= 19)) {
            return "Aquário";
        } else if ((mes == 2 && dia >= 20) || (mes == 3 && dia <= 20)) {
            return "Peixes";
        }
        return "Desconhecido";
    }
}
