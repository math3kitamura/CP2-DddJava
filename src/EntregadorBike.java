public class EntregadorBike extends Entregador implements TaxaDeEntrega{

    public EntregadorBike(String nome, double quantidadeMaxProdutos, double taxa){
        setNome(nome);
        setQuantidadeMaxProdutos(quantidadeMaxProdutos);
        setTaxa(taxa);
    }

    @Override
    void descricao() {
        System.out.println("O pedido será entregue de bike por: " + getNome());
    }

    @Override
    public void taxaDeEntrega() {
        setTaxa(getTaxa() * 1.10);
        System.out.println("O valor da taxa de entrega é: " + getTaxa());
    }
}
