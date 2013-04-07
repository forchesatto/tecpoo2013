/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pedido;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author andreforchesatto
 */
public class Pedido {

    private Date data;
    private Integer numero;
    private Cliente cliente;
    private List<ItemPedido> itens;
    
    public Pedido(){}

    public Pedido(Date data, Integer numero, Cliente cliente) {
        this.data = data;
        this.numero = numero;
        this.cliente = cliente;
    }
    
    /**
     * Retorna o total do pedido somando o total de cada item do pedido
     * @return Double
     */
    public Double getTotalPedido(){
        Double total = 0.0;
        for(ItemPedido item: getItens()){
            total += item.getTotalItem();
        }
        return total;
    }
    
    public void addItem(ItemPedido item){
        if(itens == null){
            itens = new ArrayList<ItemPedido>();
        }
        item.setPedido(this);
        itens.add(item);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }
}
