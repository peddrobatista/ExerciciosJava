package classes;

public class ClasseD {
    // Criando o construtor
    int x;
    int a;
    String nome;
    public ClasseD(String iNome, int aI) {
          x = 6;
          nome = iNome;
          a = aI;
    }
    public static void main(String[] args) {
        ClasseD myObj = new ClasseD("Pedro", 22);
        System.out.println(myObj.x);
        System.out.println(myObj.a);
        System.out.println("Meu nome é " + myObj.nome + " e eu tenho " + myObj.a);
    }
}
