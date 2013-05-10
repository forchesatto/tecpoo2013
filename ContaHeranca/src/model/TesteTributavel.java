/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author andreluizforchesatto
 */
public class TesteTributavel {
    
    public static void main(String args[]){
        Corrente cc = new Corrente();
        cc.deposita(100.0);
        System.out.println("Tributos:"+cc.calculaTributos());
        
        Tributavel seguro = new SeguroVida();
        System.out.println("Tributos:"+seguro.calculaTributos());
        
        CalculaImpostoRenda calculadora = new CalculaImpostoRenda();
        calculadora.adiciona(cc);
        calculadora.adiciona(seguro);
                
        System.out.println("IR: "+calculadora.getTotalIR());
    }
}
