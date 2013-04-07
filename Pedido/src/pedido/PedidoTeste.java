package pedido;

import java.util.Date;

public class PedidoTeste {

    public static void main(String[] args) {
        Produto cerveja = new Produto(1, "Cerveja", 3.00);
        Produto carne = new Produto(2, "Carne", 13.00);
        Produto carvao = new Produto(3, "Carvão", 7.0);
        
        ItemPedido item1 = new ItemPedido(24.0, 3.00, cerveja);
        ItemPedido item2 = new ItemPedido(10.0, 13.00, carne);
        ItemPedido item3 = new ItemPedido(2.0, 7.0, carvao);
        
        Cliente cliente = new Cliente("André", "9999");
        
        Pedido pedido = new Pedido(new Date(), 1, cliente);
        pedido.addItem(item1);
        pedido.addItem(item2);
        pedido.addItem(item3);
        
        Pedido pedido1 = new Pedido(new Date(), 2, cliente);
        pedido1.addItem(item3);
        
        cliente.addPedido(pedido);
        cliente.addPedido(pedido1);
        
        MaiorEMenorItem maiorMenor = new MaiorEMenorItem(pedido.getItens());
        ItemPedido maior = maiorMenor.getItemMaior();
        ItemPedido menor = maiorMenor.getItemMenor();
        
        System.out.println("Total do pedido: "+pedido.getTotalPedido());
        System.out.println("Total do pedido do cliente: "+cliente.getTotalDePedidos());
        
        System.out.println("Maior item pedido 1: "+maior.getProduto().getNome()+" valor "+maior.getTotalItem());
        System.out.println("Menor item pedido 1: "+menor.getProduto().getNome()+" valor "+menor.getTotalItem());
    }
}
