package model;



import java.util.Date;

/**
 *
 * @author andreforchesatto
 */
public abstract class Conta {
    private Integer numero;
    private Agencia agencia;
    private Cliente cliente;
    private Date dataAbertura;
    private Double saldo = 0.0;

    //Construtor vazio
    public Conta(){
        
    }
    
    //Construtor com atributos
    public Conta(Integer numero, Agencia agencia, 
            Cliente cliente, Date dataAbertura) {
        this.setNumero(numero);
        this.agencia = agencia;
        this.cliente = cliente;
        this.dataAbertura = dataAbertura;
    }

    public boolean saca(Double valor) {
        boolean possuiSaldoSuficiente = possuiSaldoSuficiente(valor);
        if (possuiSaldoSuficiente) {
            saldo = saldo - valor;
        }
        return possuiSaldoSuficiente;
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
    
    public abstract boolean possuiSaldoSuficiente(Double valor);

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        if(validaNumeroConta(numero)){
            this.numero = numero;
        }
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
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
