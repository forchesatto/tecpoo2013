package model;

/**
 * Corrente é subclasse de Conta. Herda todos os atributos e métodos public e
 * protected da classe Conta
 *
 * @author andreluizforchesatto
 */
public class Corrente extends Conta {

    private Double limite = 0.0;

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    @Override
    public boolean possuiSaldoSuficiente(Double valor) {
        Double saldoTotal = verificaSaldo() + limite;
        if (saldoTotal >= valor) {
            return true;
        }
        return false;
    }

    
}
