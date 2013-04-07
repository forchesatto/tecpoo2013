/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pedido;

import java.util.List;

/**
 *
 * @author andreforchesatto
 */
public class MaiorEMenorItem {
    
    private ItemPedido itemMaior;
    private ItemPedido itemMenor;
    
    public MaiorEMenorItem(List<ItemPedido> itens){
        for(ItemPedido item: itens){
            if(itemMenor == null || item.getTotalItem()< itemMenor.getTotalItem()){
                    itemMenor = item;
            }
            if(itemMaior == null || item.getTotalItem()> itemMaior.getTotalItem()){
                    itemMaior = item;
            }
        }
    }

    public ItemPedido getItemMaior() {
        return itemMaior;
    }

    public ItemPedido getItemMenor() {
        return itemMenor;
    }
    
}
