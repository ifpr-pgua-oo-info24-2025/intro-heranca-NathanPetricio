public class Carro extends Veiculo{
    protected int num_Portas;

    public int getNum_Portas() {
        return num_Portas;
    }

    public void setNum_Portas(int num_Portas) {
        this.num_Portas = num_Portas;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Numero de Portas:" + num_Portas);
    }

    public Carro(String marca, String modelo, int ano, int numeroDePortas) {
        super(marca, modelo, ano);
        this.num_Portas = numeroDePortas;
    }
}
