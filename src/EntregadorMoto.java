public class EntregadorMoto extends Entregador implements TaxaDeEntrega{
    private double taxa;

    public EntregadorMoto(String nome, String quantidadeProdutos, double taxa){
        setNome(nome);
        setQuantidadeProdutos(quantidadeProdutos);
        this.taxa = taxa;
    }

    public void quantidadeDeProdutos() {
        System.out.println("A quantidade de produtos máxima que esse entregador pode carregar é: " + getQuantidadeProdutos());
    }

    @Override
    void descricao() {
        System.out.println("O pedido será entregue de moto por: " + getNome());
    }

    @Override
    public void taxaDeEntrega() {
        taxa += taxa * 0.15;
        System.out.println("O valor da taxa de entrega é: " + taxa);
    }
}
