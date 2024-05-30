public class App {
    public static void main(String[] args) throws Exception {
        Corrida corridaDaAmizade = new Corrida(2000);
        corridaDaAmizade.adicionaCarro(new CarroSoma("CarroA", 10, 110));
        corridaDaAmizade.adicionaCarro(new CarroSoma("CarroB", 8, 130));
        corridaDaAmizade.adicionaCarro(new CarroMult("CarroC", 1.7, 100));
        corridaDaAmizade.adicionaCarro(new CarroMult("CarroD", 1.4, 110));
        corridaDaAmizade.largada();
    }
}
