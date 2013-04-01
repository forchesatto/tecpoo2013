package exercicio;

/**
 *
 * @author andreforchesatto
 */
public class Funcionario {
    
  private String nome;
  private Departamento departamento; //tem um departamento
  private double salario;
  private Data dataEntrada;
  private String rg;
  private boolean estaNaEmpresa = true;
  
  public void recebeAumento(double aumento) {
    salario += aumento;
  }
  
  public double calculaGanhoAnual() {
    return salario * 12;
  }
  
  public void demite(){
      estaNaEmpresa = false;
  }
  
  public void mostra(){
      System.out.println("Nome: "+this.nome);
      System.out.println("Departamento: "+this.departamento);
      System.out.println("RG: "+this.rg);
      System.out.println("Ganho anual: "+this.calculaGanhoAnual());
      System.out.println("Demitido?: "+this.estaNaEmpresa);
      
      System.out.println("Data dia: "+this.dataEntrada.dia);
      System.out.println("Data mes: "+this.dataEntrada.mes);
      System.out.println("Data ano: "+this.dataEntrada.ano);
      
      System.out.println("Data formatada: "+this.dataEntrada.formatada());
  }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Data getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Data dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

}
