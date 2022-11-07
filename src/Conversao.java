public class Conversao {
    public static void main(String[] args) {
        System.out.println("Conversões de tipos de dados ");
        /* byte > short > char > int > long > float > double: conversão automática, menor para o maior
            double > float > long > int > char > short > byte : conversão manual, maior para o menor
        */
        // Conversão automática
        int myInt = 9;
        double myDouble = myInt;
        System.out.println(myInt); // saída 9
        System.out.println(myDouble); // saída 9.0
        // Conversão manual
        double d = 9.78d;
        int i = (int) d;
        System.out.println(d); // Saída 9.78
        System.out.println(i); // Saída 9
    }
}
