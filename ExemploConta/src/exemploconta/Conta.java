package exemploconta;

import java.util.Date;

/**
 *
 * @author andreforchesatto
 */
public class Conta {
    private Integer numero;
    private String agencia;
    private String cliente;
    private Date dataAbertura;
    private Double limite = 0.0;
    private Double saldo = 0.0;

    //Construtor vazio
    public Conta(){
        
    }
    
    //Construtor com atributos
    public Conta(Integer numero, String agencia, 
            String cliente, Date dataAbertura, Double limite) {
        this.setNumero(numero);
        this.agencia = agencia;
        this.cliente = cliente;
        this.dataAbertura = dataAbertura;
        this.limite = limite;
    }
    
    public boolean validaNumeroConta(Integer numero){
        if(numero >= 1 && numero <= 9999){
            return true;
        }
        return false;
    }
    
    public boolean transferir(Double valor, Conta conta2){
        if(saca(valor)){
            conta2.deposita(valor);
            return true;
        }
        return false;
    }
    
    public Double verificaSaldo(){
        return saldo;
    }
    
    public void deposita(Double valor){
        saldo = saldo + valor;
    }
    
    public boolean possuiSaldoSuficiente(Double valor){
        Double saldoTotal = saldo + limite;
        if(saldoTotal >= valor){
            return true;
        }
        return false;
    }
    
    public boolean saca(Double valor){
        boolean possuiSaldoSuficiente = possuiSaldoSuficiente(valor);
        if(possuiSaldoSuficiente){
            saldo = saldo - valor;
        }
        return possuiSaldoSuficiente;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        if(validaNumeroConta(numero)){
            this.numero = numero;
        }
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + (this.numero != null ? this.numero.hashCode() : 0);
        hash = 61 * hash + (this.agencia != null ? this.agencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Conta other = (Conta) obj;
        if (this.numero != other.numero && (this.numero == null || !this.numero.equals(other.numero))) {
            return false;
        }
        if ((this.agencia == null) ? (other.agencia != null) : !this.agencia.equals(other.agencia)) {
            return false;
        }
        return true;
    }
    
    
    
}
