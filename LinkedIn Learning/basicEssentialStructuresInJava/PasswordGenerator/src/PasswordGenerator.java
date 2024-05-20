public class PasswordGenerator {
    private static final String CONSONANTS = "bcdfghjklmnpqrstvwxyz";
    private static final String VOWELS = "aeiou";
    private static final String NUMBERS = "0123456789";
    private static final String SYMBOLS = "!@#$%&*()-+/=[]{}ºª?<>_,;:|";

    private static final int NUM_PAIRS = 3;
    private static final int NUM_NUMBERS = 2;
    private static final int NUM_SYMBOLS = 1;
    public static void main(String[] args) {
    }

    public static char getRandom(String options) {
        int pos = (int) (Math.random() * options.length());
        return options.charAt(pos);
    }

    private static String generatorPair() {
        String pair = "";
        pair += getRandom(CONSONANTS);
        pair += getRandom(VOWELS);
        
        return pair;
    }
}
