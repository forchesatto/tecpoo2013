package exemploconta;

import java.util.ArrayList;

/**
 *
 * @author andreforchesatto
 */
public class TesteAssociacaoBidirecional {
 
    
    public static void main(String[] args){
        Cliente cliente = new Cliente("André", "123456");
        
        Conta conta = new Conta();
        conta.setNumero(1234);

        cliente.getContas().remove(conta);
        
        cliente.addConta(conta);
        
        Conta conta2 = new Conta();
        conta2.setNumero(12345);
        
        cliente.addConta(conta2);
        
        
        System.out.println("Total de contas:" 
                + cliente.getContas().size());
        
        
        
        System.out.println("Total de contas:" 
                + cliente.getContas().size());
        
    }
}
