/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bonificacao;

/**
 *
 * @author andreluizforchesatto
 */
public class CalculaTotalBonificacao {
    
    private Double total = 0.0;
    
    public void registra(Funcionario funcionario){
        total += funcionario.calculaBonificacao();
    }
    
    public Double getTotalBonificacao(){
        return total;
    }
}
