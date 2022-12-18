package arrays;
import java.util.ArrayList;
public class ArrayListes {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>(); // Criando um objeto ArrayList
        // Adicionando elementos ao array
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        System.out.println(cars);
        // Acessando um elemento do array
        System.out.println(cars.get(1));
        // Modificando um elemento do array
        cars.set(2, "Opel");
        System.out.println(cars);
        // Removendo um item do array
        cars.remove(0);
        System.out.println(cars);
    }
}
