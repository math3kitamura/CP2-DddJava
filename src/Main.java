import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pedido pedido = new Pedido();

        int opcao;

        do {

            System.out.println("\n===== MENU E-COMMERCE =====");
            System.out.println("1 - Entrega com Carro");
            System.out.println("2 - Entrega com Moto");
            System.out.println("3 - Entrega com Bike");
            System.out.println("4 - Atualizar Status");
            System.out.println("5 - Sair");

            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:

                    EntregadorCarro carro = new EntregadorCarro("Carlos", 30, 20);

                    pedido.setNome(carro.getNome());
                    pedido.setQuantidadeMaxProdutos(carro.getQuantidadeMaxProdutos());
                    pedido.setTaxa(carro.getTaxa());

                    System.out.println("\n=== PEDIDO COM ENTREGA DE CARRO ===");

                    System.out.print("Nome do cliente: ");
                    pedido.cliente = sc.nextLine();

                    System.out.print("Produto: ");
                    pedido.produto = sc.nextLine();

                    System.out.print("Quantidade: ");
                    pedido.quantidade = sc.nextDouble();

                    System.out.print("Valor do produto: ");
                    pedido.valorProduto = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Status do pedido: ");
                    pedido.statusPedido = sc.nextLine();

                    carro.descricao();
                    carro.taxaDeEntrega();

                    pedido.quantidadeDeProdutos();
                    pedido.descricao();

                    break;


                case 2:

                    EntregadorMoto moto = new EntregadorMoto("Joao", 15, 15);

                    pedido.setNome(moto.getNome());
                    pedido.setQuantidadeMaxProdutos(moto.getQuantidadeMaxProdutos());
                    pedido.setTaxa(moto.getTaxa());

                    System.out.println("\n=== PEDIDO COM ENTREGA DE MOTO ===");

                    System.out.print("Nome do cliente: ");
                    pedido.cliente = sc.nextLine();

                    System.out.print("Produto: ");
                    pedido.produto = sc.nextLine();

                    System.out.print("Quantidade: ");
                    pedido.quantidade = sc.nextDouble();

                    System.out.print("Valor do produto: ");
                    pedido.valorProduto = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Status do pedido: ");
                    pedido.statusPedido = sc.nextLine();

                    moto.descricao();
                    moto.taxaDeEntrega();

                    pedido.quantidadeDeProdutos();
                    pedido.descricao();

                    break;

                case 3:

                    EntregadorBike bike = new EntregadorBike("Marcos", 10, 10);

                    pedido.setNome(bike.getNome());
                    pedido.setQuantidadeMaxProdutos(bike.getQuantidadeMaxProdutos());
                    pedido.setTaxa(bike.getTaxa());

                    System.out.println("\n=== PEDIDO COM ENTREGA DE BIKE ===");

                    System.out.print("Nome do cliente: ");
                    pedido.cliente = sc.nextLine();

                    System.out.print("Produto: ");
                    pedido.produto = sc.nextLine();

                    System.out.print("Quantidade: ");
                    pedido.quantidade = sc.nextDouble();

                    System.out.print("Valor do produto: ");
                    pedido.valorProduto = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Status do pedido: ");
                    pedido.statusPedido = sc.nextLine();

                    bike.descricao();
                    bike.taxaDeEntrega();

                    pedido.quantidadeDeProdutos();
                    pedido.descricao();

                    break;

                case 4:

                    System.out.println("\n1 - Atualizar apenas status");
                    System.out.println("2 - Atualizar status com observacao");

                    int escolha = sc.nextInt();
                    sc.nextLine();

                    if (escolha == 1) {

                        System.out.print("Novo status: ");
                        String status = sc.nextLine();

                        pedido.atualizarStatus(status);

                    } else {

                        System.out.print("Novo status: ");
                        String status = sc.nextLine();

                        System.out.print("Observacao: ");
                        String observacao = sc.nextLine();

                        pedido.atualizarStatus(status, observacao);
                    }

                    break;

                case 5:

                    System.out.println("Sistema encerrado.");
                    break;

                default:

                    System.out.println("Opcao invalida.");
            }

        } while (opcao != 5);

        sc.close();
    }
}