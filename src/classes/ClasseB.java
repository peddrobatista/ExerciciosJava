package classes;

public class ClasseB {
    // criando uma constante
    final int y = 10;
    String nome = "Pedro";
    int idade = 22;
    public static void main(String[] args) {
        ClasseA myObj3 = new ClasseA();
        ClasseA myObj4 = new ClasseA();
        ClasseB myOBj = new ClasseB();
        // Modificando os atributos
        myObj3.x = 40;
        System.out.println(myObj3.x);
        System.out.println(myObj4.x);
        System.out.println("Meu nome é " + myOBj.nome + " e minha idade é "+ myOBj.idade);

    }
}
