public class Pessoa {
    private String name;
    private String lastName;
    private int age;
    private double height;

    // Construtor com validação de nulidade
    public Pessoa(String name, String lastName, int age, double height) {
        validateNotNull(name, "Nome");
        validateNotNull(lastName, "Sobrenome");
        validateNonNegative(age, "A idade não pode ser negativa.");
        validateNonNegative(height, "A altura não pode ser negativa.");

        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
    }

    // Getters

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    // Setters

    public void changeName(String name) {
        validateNotNull(name, "Nome");
        this.name = name;
    }

    public void changeLastName(String lastName) {
        validateNotNull(lastName, "Sobrenome");
        this.lastName = lastName;
    }

    public void changeAge(int age) {
        validateNonNegative(age, "A idade não pode ser negativa.");
        this.age = age;
    }

    public void changeHeight(double height) {
        validateNonNegative(height, "A altura não pode ser negativa.");
        this.height = height;
    }

    // Método para mostrar informações da pessoa
    public void information() {
        System.out.println("Nome: " + name + " " + lastName);
        System.out.println("Idade: " + age);
        System.out.println("Altura: " + height + "m");
    }

    // Método utilitário para validar nulidade
    private void validateNotNull(Object value, String fieldName) {
        if (value == null) {
            throw new IllegalArgumentException(fieldName + " não pode ser nulo.");
        }
    }

    // Método utilitário para validar não negatividade
    private void validateNonNegative(double value, String errorMessage) {
        if (value < 0) {
            throw new IllegalArgumentException(errorMessage);
        }
    }

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Ana Raquel", "Damasceno", 23, 1.69);
        pessoa1.changeAge(24);
        pessoa1.changeHeight(1.75);
        pessoa1.information();
    }
}