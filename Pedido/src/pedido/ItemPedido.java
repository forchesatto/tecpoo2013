/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pedido;

/**
 *
 * @author andreforchesatto
 */
public class ItemPedido implements Cloneable{

    private Double qtdPedido;
    private Double vlrUnitario;
    private Produto produto;

    public ItemPedido(Double qtdPedido, Double vlrUnitario, Produto produto) {
        this.qtdPedido = qtdPedido;
        this.vlrUnitario = vlrUnitario;
        this.produto = produto;
    }

    /**
     * Retorna o total de um item multiplicado o valor de qtdPedido * vlrUnitario
     * @return Double
     */
    public Double getTotalItem(){
        if(qtdPedido != null && vlrUnitario != null){
            return qtdPedido * vlrUnitario;
        }
        return 0.0;
    }
    
    public Double getQtdPedido() {
        return qtdPedido;
    }

    public void setQtdPedido(Double qtdPedido) {
        this.qtdPedido = qtdPedido;
    }

    public Double getVlrUnitario() {
        return vlrUnitario;
    }

    public void setVlrUnitario(Double vlrUnitario) {
        this.vlrUnitario = vlrUnitario;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public Object clone(){
        return new ItemPedido(qtdPedido, vlrUnitario, produto);
    }
    
    
}
