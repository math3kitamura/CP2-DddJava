public class EntregadorBike extends Entregador{
    public EntregadorBike(String nome, String quantidadeProdutos){
        setNome(nome);
        setQuantidadeProdutos(quantidadeProdutos);
    }

    public void quantidadeDeProdutos() {
        System.out.println("A quantidade de produtos máxima que esse entregador pode carregar é: " + getQuantidadeProdutos());
    }

    @Override
    void descricao() {
        System.out.println("O pedido será entregue de moto por: " + getNome());
    }
}
