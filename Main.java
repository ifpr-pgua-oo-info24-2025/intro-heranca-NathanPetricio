public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2020, 4);
        Moto moto = new Moto("Honda", "CB 500", 2022, "Esportivo");

        System.out.println("Informacoes do carro");
        carro.exibirDetalhes();

        System.out.println("Informacoe da moto");
        moto.exibirDetalhes();

    }
}
