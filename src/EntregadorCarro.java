public class EntregadorCarro extends Entregador implements TaxaDeEntrega{

    public EntregadorCarro(String nome, double quantidadeMaxProdutos, double taxa){
        setNome(nome);
        setQuantidadeMaxProdutos(quantidadeMaxProdutos);
        setTaxa(taxa);
    }

    @Override
    void descricao() {
        System.out.println("O pedido será entregue de carro por: " + getNome());
    }

    @Override
    public void taxaDeEntrega() {
        setTaxa(getTaxa() * 1.25);
        System.out.println("O valor da taxa de entrega é: " + getTaxa());
    }
}
