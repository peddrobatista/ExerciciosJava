package arrays;
import java.util.ArrayList;
import java.util.Iterator;
public class Interador {
    public static void main(String[] args) {
        // Faça uma coleção
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Pegue o interador
        Iterator<String> it = cars.iterator();

        // Print o primeiro item
        System.out.println(it.next());
    }
}
