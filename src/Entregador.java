abstract class Entregador {

    private String nome;
    private String quantidadeProdutos;
    private double taxa;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getQuantidadeProdutos() {
        return quantidadeProdutos;
    }

    public void setQuantidadeProdutos(String quantidadeProdutos) {
        this.quantidadeProdutos = quantidadeProdutos;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public void quantidadeDeProdutos() {
        System.out.println("A quantidade de produtos máxima que esse entregador pode carregar é: " + quantidadeProdutos);
    }

    abstract void descricao();
}
