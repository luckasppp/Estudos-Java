import java.util.Scanner;

public class PasswordGenerator {
    private static final String CONSONANTS = "bcdfghjklmnpqrstvwxyz";
    private static final String VOWELS = "aeiou";
    private static final String NUMBERS = "0123456789";
    private static final String SYMBOLS = "!@#$%&*()-+/=[]{}ºª?<>_,;:|";

    private static final int NUM_PAIRS = 3;
    private static final int NUM_NUMBERS = 2;
    private static final int NUM_SYMBOLS = 1;

    private static final String OTHER = "N";
    
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        String answer;

        do {
            String password = "";
            for (int i = 0; i < NUM_PAIRS; i++) {
                password += generatorPair();
            }
    
            for (int i = 0; i < NUM_NUMBERS; i++) {
                password += getRandom(NUMBERS);
            }
    
            for (int i = 0; i < NUM_SYMBOLS; i++) {
                password += getRandom(SYMBOLS);
            }
    
            System.out.println("Your password: " + password + "\nType 'y' to confirm or 'n' to generate a new password.");

            // O método do scanner serve a princípio para pegar inputs no terminal.
            answer = value.next();
        } while (answer.equalsIgnoreCase(OTHER));

        System.out.println("Finish the program.");
    }

    public static char getRandom(String options) {
        int pos = (int) (Math.random() * options.length());
        return options.charAt(pos);
    }

    private static String generatorPair() {
        String pair = "";

        if (Math.random() < 0.25) {
            pair += getRandom(VOWELS);
            pair += getRandom(CONSONANTS);
        } else {
            pair += getRandom(CONSONANTS);
            pair += getRandom(VOWELS);
        }
        
        return pair;
    }
}
