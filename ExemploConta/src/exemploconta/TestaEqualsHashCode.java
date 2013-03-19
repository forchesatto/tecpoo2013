/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploconta;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author andreforchesatto
 */
public class TestaEqualsHashCode {
    
   
    public static void main(String[] args) {
        Conta conta1 = new Conta(12, "XXE", "André", new Date(), 1000.0);
        Conta conta2 = new Conta(12, "XXE", "André", new Date(), 1000.0);
        
        Set<Conta> contas = new HashSet<Conta>();
        
        contas.add(conta1);
        contas.add(conta2);
        
        System.out.println("Tamanho SET: "+contas.size());
                
    }
}
