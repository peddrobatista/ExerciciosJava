package classes;
import java.util.Scanner;
public class MinhaClasse {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Digit seu nome: ");
        String userName = myObj.nextLine();
        System.out.println("Muito prazer "+ userName);
    }
}
