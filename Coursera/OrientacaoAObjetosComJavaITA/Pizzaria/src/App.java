public class App {
    public static void main(String[] args) throws Exception {
        Pizza pizza1 = new Pizza();
        pizza1.adicionaIngrediente("Tomate");
        pizza1.adicionaIngrediente("Queijo");

        Pizza pizza2 = new Pizza();
        pizza2.adicionaIngrediente("Presunto");
        pizza2.adicionaIngrediente("Mussarela");
        pizza2.adicionaIngrediente("Calabresa");

        Pizza pizza3 = new Pizza();
        pizza3.adicionaIngrediente("Frango");
        pizza3.adicionaIngrediente("Catupiry");
        pizza3.adicionaIngrediente("Milho");  
        pizza3.adicionaIngrediente("Bacon");
        pizza3.adicionaIngrediente("Mussarela");
        pizza3.adicionaIngrediente("Pimenta Biquinho");


        Carrinho carrinho1 = new Carrinho();
        carrinho1.adicionaPizza(pizza1);
        carrinho1.adicionaPizza(pizza2);
        carrinho1.adicionaPizza(pizza3);
        System.out.println("Seu carrinho está em: " + carrinho1.getPrecoTotal());
        Pizza.imprimeQuantidadeDeCadaIngrediente();
    }
}
