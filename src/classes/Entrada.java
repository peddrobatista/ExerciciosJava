package classes;
import java.util.Scanner; // importando a classe Scanner
public class Entrada {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in); // Cria um objeto scanner
        System.out.println("Digite seu nome, idade e salário: ");

        // String input
        String userName = myInput.nextLine();

        // Numerical input
        int age = myInput.nextInt();
        double salary = myInput.nextDouble();

        // Output inpuy by user
        System.out.println("Nome: " + userName);
        System.out.println("Idade: "+ age);
        System.out.println("Salário: "+ salary);

    }
}
