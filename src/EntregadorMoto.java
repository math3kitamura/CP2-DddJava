public class EntregadorMoto extends Entregador implements TaxaDeEntrega{

    public EntregadorMoto(String nome, double quantidadeMaxProdutos, double taxa){
        setNome(nome);
        setQuantidadeMaxProdutos(quantidadeMaxProdutos);
        setTaxa(taxa);
    }

    @Override
    void descricao() {
        System.out.println("O pedido será entregue de moto por: " + getNome());
    }

    @Override
    public void taxaDeEntrega() {
        setTaxa(getTaxa() * 1.15);
        System.out.println("O valor da taxa de entrega é: " + getTaxa());
    }
}
