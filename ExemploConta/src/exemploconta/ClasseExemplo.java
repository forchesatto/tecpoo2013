package exemploconta;

/**
 *
 * @author andreforchesatto
 */
public class ClasseExemplo {

    private static int quantidadeObjeto; //Atributo static
    
    public ClasseExemplo() {
        ClasseExemplo.quantidadeObjeto++;
    }

    public static int getQuantidadeObjetos() { //Método static
        return ClasseExemplo.quantidadeObjeto;
    }
    
    public static void main(String args[]){
        ClasseExemplo obj1 = new ClasseExemplo();
        ClasseExemplo obj2 = new ClasseExemplo();
        ClasseExemplo obj3 = new ClasseExemplo();
        System.out.println(ClasseExemplo.getQuantidadeObjetos());
    }
}
