/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculohora;

/**
 *
 * @author andreluizforchesatto
 */
public class Circulo implements AreaCalculavel{

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double calculaArea() {
         return Math.PI * raio * raio;
    }
    
    
}
