package exercicio;

/**
 *
 * @author andreforchesatto
 */
public class Funcionario {
    
    String nome;
    String departamento;
    double salario;
    Data dataEntrada;
    String rg;
    boolean estaNaEmpresa = true;
    
  void recebeAumento(double aumento) {
    salario += aumento;
  }
  
  double calculaGanhoAnual() {
    return salario * 12;
  }
  
  void demite(){
      estaNaEmpresa = false;
  }
  
  void mostra(){
      System.out.println("Nome: "+this.nome);
      System.out.println("Departamento: "+this.departamento);
      System.out.println("RG: "+this.rg);
      System.out.println("Ganho anual: "+this.calculaGanhoAnual());
      System.out.println("Demitido?: "+this.estaNaEmpresa);
      
      System.out.println("Data dia: "+this.dataEntrada.dia);
      System.out.println("Data mes: "+this.dataEntrada.mes);
      System.out.println("Data ano: "+this.dataEntrada.ano);
  }
  
  
}
