package classes;
import java.time.LocalDate; // Importando a classe LocalDate
import java.time.LocalDateTime; // Importando a classe LocalDateTime
import java.time.format.DateTimeFormatter; // Importando a classe DateTimeFormatter
public class Data {
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now();
        LocalDateTime myObj2 = LocalDateTime.now();
        DateTimeFormatter myData = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String myDateFormatted = myObj2.format(myData);
        System.out.println(myObj);
        System.out.println(myObj2);
        System.out.println(myDateFormatted);
    }

}
