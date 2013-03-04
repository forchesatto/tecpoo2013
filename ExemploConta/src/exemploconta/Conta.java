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
    private Double limite;
    private Double saldo = 0.0;
    
    public Double verificaSaldo(){
        return saldo;
    }
    
    public void deposita(Double valor){
        saldo = saldo + valor;
    }
    
    public void saca(Double valor){
        if(saldo >= valor){
            saldo = saldo - valor;
        } else {
            //TODO: sugerir solução 
            System.out.println("Saldo insuficiente");
        }
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
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
    
}
