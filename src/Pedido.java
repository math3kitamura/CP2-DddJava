public class Pedido extends Entregador{
    String cliente;
    String produto;
    double quantidade;
    double valorProduto;
    String statusPedido;
    double valorTotal;

    public void quantidadeDeProdutos() {
        if (quantidade <= getQuantidadeProdutos()) {
            super.quantidadeDeProdutos();
            System.out.println("A quantidade de " + produto + "que voce esta pedindo é " + quantidade);
        } else {
            throw new IllegalArgumentException("A quantidade de produtos não pode ultrapassar " + getQuantidadeProdutos());
        }
    }

    @Override
    void descricao() {
        valorTotal = valorProduto + getTaxa();
        System.out.println("Seu pedido " + cliente + "será realizado por" + getNome() + ", o seu produto está em fase de " + statusPedido + "\n o valor total junto com a taxa de entrega ficou no valor de: " + valorTotal);
    }
}
