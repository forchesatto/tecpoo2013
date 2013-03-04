package exemploconta;

/**
 *
 * @author andreforchesatto
 */
public class ExemploConta {

    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setCliente("André");
        conta.setAgencia("Xanxerê");
        conta.setNumero(123456);
        conta.setLimite(1000.0);
        conta.deposita(100.00);
        conta.saca(39.00);
        
        System.out.println(conta.getCliente() +" - "+conta.getNumero());
        System.out.println("Saldo conta:"+conta.verificaSaldo());
        
        Conta conta2 = new Conta();
        conta2.setCliente("Pedro");
        conta2.setAgencia("Xaxim");
        conta2.setNumero(1256);
        conta2.setLimite(1200.0);
        System.out.println(conta2.getCliente() +" - "+conta2.getNumero());
        
        Cliente cliente = new Cliente();
        cliente.nome="José";
        cliente.cpf="888899999";
        cliente.cidade="Xanxerê";
        
        System.out.println(cliente.nome +" - "+cliente.cpf);
    }
}
