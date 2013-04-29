package br.unoesc.poo.sobrecarga;

/**
 *
 * @author andreforchesatto
 */
public class TesteCalculadora {
    
    public static void main(String args[]){
        Calculadora calculadora = new Calculadora();
        Double resultado1 = calculadora.soma(11.25, 12.39);
        System.out.println("Total double: "+resultado1);
        
        Float resultado2 = calculadora.soma(11.25f, 12.39f);
        System.out.println("Total float: "+resultado2);
    }
}
