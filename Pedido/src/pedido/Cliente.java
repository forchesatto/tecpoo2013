/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pedido;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andreforchesatto
 */
public class Cliente {

    private String nome;
    private String cpf;
    private List<Pedido> pedidos;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    /**
     * Retorna o total de todos os pedidos do cliente
     * @return 
     */
    public Double getTotalDePedidos(){
        Double total = 0.0;
        for(Pedido pedido: getPedidos()){
            total += pedido.getTotalPedido();
        }
        return total;
    }
    
    public void addPedido(Pedido pedido){
        if(pedidos == null){
            pedidos = new ArrayList<Pedido>();
        }
        pedido.setCliente(this);
        pedidos.add(pedido);
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
