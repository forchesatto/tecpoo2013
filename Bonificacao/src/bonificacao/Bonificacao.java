/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bonificacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author andreluizforchesatto
 */
public class Bonificacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSalario(2000.0);
        Contador contador = new Contador();
        contador.setSalario(5000.0);
        Programador programador = new Programador();
        programador.setSalario(10000.0);
        
        CalculaTotalBonificacao calculadora = 
                new CalculaTotalBonificacao();
        calculadora.registra(contador);
        calculadora.registra(gerente);
        calculadora.registra(programador);
        
        System.out.println("Total de bonificação: "
                +calculadora.getTotalBonificacao());
        
        List<Autenticavel> aute = new ArrayList<>();
        gerente.setSenha("123456");
        gerente.setUsuario("23");
        aute.add(gerente);
        contador.setSenha("1234567");
        contador.setUsuario("12");
        aute.add(contador);
        
        Autenticador autenticador = new Autenticador();
        autenticador.setTodosAutenticaveis(aute);
        
        autenticador.autentica(gerente);
        
        Teste teste = new Teste();
                teste.a = "a";
    }
}
