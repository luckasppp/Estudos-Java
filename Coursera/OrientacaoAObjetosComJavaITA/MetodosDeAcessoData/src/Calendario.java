import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Calendario {
    private LocalDate data = LocalDate.of(1900, 01, 01);

    public String getData() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return this.data.format(formatter);
    }

    public LocalDate agora() {
        if (!data.equals(LocalDate.of(1900, 01, 01))) {
            return data;
        }
        return LocalDate.now();
    }

    public void setData(String data) {
        data = data.replace("-", "/");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            this.data = LocalDate.parse(data, formatter);
        } catch (DateTimeParseException error) {
            System.err.println("Formato de data inválido. Use dd/MM/yyyy ou dd-MM-yyyy.");
            throw error;
        }   
    }

    public void resetData() {
        this.data = LocalDate.of(1900, 01, 01);
    }
}
