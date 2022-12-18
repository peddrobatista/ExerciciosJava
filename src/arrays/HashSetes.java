package arrays;
import java.util.HashSet;
public class HashSetes {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars); // O BMW vai aparecer apenas uma vez, por que ele é único
    }
}
