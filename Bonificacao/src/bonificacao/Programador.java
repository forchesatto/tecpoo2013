/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bonificacao;

/**
 *
 * @author andreluizforchesatto
 */
public class Programador extends Funcionario{

    @Override
    public Double calculaBonificacao() {
        return getSalario() * 0.8;
    }
    
}
