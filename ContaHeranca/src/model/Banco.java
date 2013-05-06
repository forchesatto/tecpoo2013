package model;

import java.util.List;

/**
 * Classe banco que será responsável por calcular o saldo geral do banco
 * @author andreluizforchesatto
 */
public class Banco {

    public Double calculaSaldoBanco(List<Conta> contas){
        Double total = 0.0;
        for(Conta conta: contas){
            total += conta.verificaSaldo();
        }
        return total;
        
    }
}
