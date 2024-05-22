import java.util.ArrayList;
import java.util.HashMap;

public class Pizza {
    private ArrayList<String> ingredientes = new ArrayList<>();
    private static HashMap<String, Integer> countIngredientes = new HashMap<String, Integer>();

    public void adicionaIngrediente(String ingrediente) {
        ingredientes.add(ingrediente);
        contabilizaIngrediente(ingrediente);
    }

    public Double getPreco() {
        if (ingredientes.size() <= 2)
            return 15.0;
        else if (ingredientes.size() <= 5)
            return 20.0;
        else
            return 23.0;
    }

    public static void contabilizaIngrediente(String ingrediente) {
        Integer count = countIngredientes.get(ingrediente);
        if (count == null) {
            countIngredientes.put(ingrediente, 1);
        } else {
            countIngredientes.put(ingrediente, count + 1);
        }
    }

    public static void imprimeQuantidadeDeCadaIngrediente() {
        for (String ingrediente : countIngredientes.keySet()) {
            System.out.println(ingrediente + ": " + countIngredientes.get(ingrediente));
        }
    }

    public boolean temIngredientes() {
        return !ingredientes.isEmpty();
    }
}
