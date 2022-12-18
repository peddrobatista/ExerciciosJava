package classes;

public class Wrappers {
    public static void main(String[] args){
        // Criando objetos wrappers com base em classes wrappers
        Integer myInt = 155;
        Double myDouble = 5.25;
        System.out.println(myDouble);
        // Convertendo objetos wrappers em String
        String myString = myInt.toString();
        System.out.println(myString.length()); // Comprimento da String
    }
}
