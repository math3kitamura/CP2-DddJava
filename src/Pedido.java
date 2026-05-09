public class Pedido extends Entregador{
    String cliente;
    String produto;
    double quantidade;
    double valorProduto;
    String statusPedido;
    double valorTotal;

    public void quantidadeDeProdutos() {
        if (quantidade <= getQuantidadeMaxProdutos()) {
            super.quantidadeDeProdutos();
            System.out.println("A quantidade de " + produto + " que voce esta pedindo é " + quantidade);
        } else {
            throw new IllegalArgumentException("A quantidade de produtos não pode ultrapassar " + getQuantidadeMaxProdutos());
        }
    }

    public void atualizarStatus(String status){
        this.statusPedido = status;
        System.out.println("Status atualizado para: " + status);
    }

    public void atualizarStatus(String status, String observacao){
        this.statusPedido = status;
        System.out.println("Status atualizado para: " + status);
        System.out.println("Observacao: " + observacao);
    }

    @Override
    void descricao() {

        valorTotal = quantidade * valorProduto + getTaxa();
        System.out.println("Seu pedido " + cliente + " será realizado por " + getNome() + ", o seu produto está em fase de: " + statusPedido + "\nO valor total junto com a taxa de entrega ficou no valor de: " + valorTotal);
    }
}
