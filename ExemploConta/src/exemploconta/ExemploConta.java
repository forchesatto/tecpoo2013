package exemploconta;

/**
 *
 * @author andreforchesatto
 */
public class ExemploConta {

    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.cliente ="André";
        conta.agencia="Xanxerê";
        conta.numero = 123456;
        conta.limite = 1000.0;
        
        System.out.println(conta.cliente +" - "+conta.numero);
        
        Conta conta2 = new Conta();
        conta2.cliente ="Pedro";
        conta2.agencia="Xaxim";
        conta2.numero = 1256;
        conta2.limite = 1200.0;
        
        System.out.println(conta2.cliente +" - "+conta2.numero);
    }
}
