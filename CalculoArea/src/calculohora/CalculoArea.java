package calculohora;

/**
 *
 * @author andreluizforchesatto
 */
public class CalculoArea {

    public static void main(String[] args) {
        calcular(new Retangulo(3, 2));
        calcular(new Quadrado(3));
        calcular(new Circulo(3));
    }
    
    public static void calcular(AreaCalculavel desenho){
        System.out.println(desenho.calculaArea());
    }
}
