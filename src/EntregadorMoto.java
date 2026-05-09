public class EntregadorMoto extends Entregador implements TaxaDeEntrega{

    public EntregadorMoto(String nome, double quantidadeProdutos, double taxa){
        setNome(nome);
        setQuantidadeProdutos(quantidadeProdutos);
        setTaxa(taxa);
    }

    public void quantidadeDeProdutos() {
        super.quantidadeDeProdutos();
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
