package model;

/**
 * Classe Poupanca é uma subclasse de Conta. 
 * Poupanca herda de conta todos seus atributos e métodos,
 * public e protected
 * @author andreluizforchesatto
 */
public class Poupanca extends Conta{

   @Override
    public boolean possuiSaldoSuficiente(Double valor) {
        Double saldoTotal = verificaSaldo();
        if (saldoTotal >= valor) {
            return true;
        }
        return false;
    }
 
}
