public class App {
    public static void main(String[] args) throws Exception {
        Paciente p1 = new Paciente(86, 1.75);
        p1.diagnostico();

        Paciente p2 = new Paciente(95, 1.75);
        p2.diagnostico();

        Paciente p3 = new Paciente(50, 1.75);
        p3.diagnostico();
    }
}
