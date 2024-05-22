import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Pizza> pizzas = new ArrayList<>();

    public void adicionaPizza(Pizza pizza) {
        if (pizza.temIngredientes()) {
            pizzas.add(pizza);
        }
    }

    public double getPrecoTotal() {
        double total = 0;
        for (Pizza pizza : pizzas) {
            total += pizza.getPreco();
        }
        return total;
    }
}
