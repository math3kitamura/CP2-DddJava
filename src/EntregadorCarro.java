public class EntregadorCarro extends Entregador{
    public EntregadorCarro(String nome){
        getNome();
    }

    @Override
    void descricao() {
        System.out.println("O pedido será entregue de carro por: " + getNome());
    }
}
