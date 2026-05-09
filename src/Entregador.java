abstract class Entregador {

    private String nome;
    private double quantidadeMaxProdutos;
    private double taxa;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQuantidadeMaxProdutos() {
        return quantidadeMaxProdutos;
    }

    public void setQuantidadeMaxProdutos(double quantidadeMaxProdutos) {
        this.quantidadeMaxProdutos = quantidadeMaxProdutos;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public void quantidadeDeProdutos() {
        System.out.println("A quantidade de produtos máxima que esse entregador pode carregar é: " + quantidadeMaxProdutos);
    }

    abstract void descricao();
}
