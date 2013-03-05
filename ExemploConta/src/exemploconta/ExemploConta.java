package exemploconta;

import java.util.Date;

/**
 *
 * @author andreforchesatto
 */
public class ExemploConta {

    public static void main(String[] args) {
        Conta conta = new Conta(123456, 
                "Xanxerê", "André", 
                new Date(), 1000.0); //Construtor com atributos
        
        conta.deposita(100.00);
        
        if(!conta.saca(110.00)){
            System.out.println("Sem saldo para 110");
        }
        
        if(conta.saca(90.00)){
            System.out.println("Conseguiu sacar 90");
        }
        
        if(!conta.saca(1200.00)){
            System.out.println("Não consegiu sacar 1200");
        }
        
        
        System.out.println(conta.getCliente() +" - "+conta.getNumero());
        System.out.println("Saldo conta:"+conta.verificaSaldo());
        
        Conta conta2 = new Conta(); //Usando construtor vazio
        conta2.setCliente("Pedro");
        conta2.setAgencia("Xaxim");
        conta2.setNumero(1256);
        conta2.setLimite(1200.0);
        
        System.out.println(conta2.getNumero()+"Saldo: "+conta2.verificaSaldo());
        
        System.out.println("-----Transferindo dinheiro conta 1 para conta 2----");
        conta.transferir(300.0, conta2);
        
        System.out.println(conta2.getNumero()+"Saldo: "+conta2.verificaSaldo());
        
        Cliente cliente = new Cliente();
        cliente.nome="José";
        cliente.cpf="888899999";
        cliente.cidade="Xanxerê";
        
        System.out.println(cliente.nome +" - "+cliente.cpf);
    }
}
