package model;

import java.util.Arrays;
import java.util.List;

public class Main {

    
    public static void main(String args[]){
        Agencia agencia = new Agencia("Xanxerê", "123-4");
        Cliente cliente = new Cliente("André", "987654");
        
        Conta conta1 = new Corrente();
        Conta conta2 = new Poupanca();
        
        conta1.setCliente(cliente);
        conta1.setAgencia(agencia);
        ((Corrente) conta1).setLimite(100.0);
        
        conta2.setCliente(cliente);
        conta2.setAgencia(agencia);
        
        conta1.deposita(100.0);
        conta1.saca(110.0);
        System.out.println("Saldo conta 1: "+conta1.verificaSaldo());
        
        conta2.deposita(100.0);
        conta2.saca(110.0);
        System.out.println("Saldo conta 2: "+conta2.verificaSaldo());
        
        List<Conta> contas = Arrays.asList(conta1,conta2);
        Banco banco = new Banco();
        Double saldoTotal = banco.calculaSaldoBanco(contas);
        System.out.println("Total geral do banco "+saldoTotal);
        
    }
}
