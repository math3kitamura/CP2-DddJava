public class EntregadorMoto extends Entregador{
    public EntregadorMoto(String nome){
        getNome();
    }

    @Override
    void descricao() {
        System.out.println("O pedido será entregue de moto por: " + getNome());
    }
}
