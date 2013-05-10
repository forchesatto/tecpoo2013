/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author andreluizforchesatto
 */
public class CalculaImpostoRenda {
    
    private double totalIR = 0;
    
    public void adiciona(Tributavel tributo){
        totalIR += tributo.calculaTributos();
    }

    public double getTotalIR() {
        return this.totalIR;
    }

    
}
