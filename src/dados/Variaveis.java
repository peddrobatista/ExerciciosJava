package dados;

public class Variaveis {
    public static void main(String[] args) {
        System.out.println("Seção sobre variáveis");
        String name = "Pedro";
        int myNum;
        myNum = 5;
        int nume = 2;
        nume = 3; // nume agora é 3
        final int n = 15; // a variável n se tornou uma constante
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello... ";
        String firstName = "João ";
        String lastName = "Pedro";
        String fullName = firstName + lastName;
        int x = 5, y = 6;
        int c, b;
        c = b = 50;
        System.out.println(name);
        System.out.println(myNum);
        System.out.println(nume);
        System.out.println(n);
        System.out.println("Olá " + name);
        System.out.println(fullName);
        System.out.println(x + y);
        System.out.println(c + b);

    }
}
