public class Veiculo{
    protected String marca;
    protected String modelo;
    protected int ano;

    public int getAno() {
        return ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void exibirDetalhes(){
        System.out.println("Modelo:" + modelo);
        System.out.println("\nMarca:" + marca);
        System.out.println("\nAno" + ano);
    }

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
}