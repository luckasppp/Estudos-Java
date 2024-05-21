public class App {
    public static void main(String[] args) throws Exception {
        Aluno lucas = new Aluno();
        lucas.bim1 = 70;
        lucas.bim2 = 60;
        lucas.bim3 = 80;
        lucas.bim4 = 70;

        System.out.println(lucas.media());
    }
}
