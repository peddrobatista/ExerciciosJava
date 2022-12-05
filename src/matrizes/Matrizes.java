package matrizes;

public class Matrizes {
    public static void main(String[] args) {
        System.out.println("Matrizes");
        String[] cars = {"Palio", "Volvo", "BMW"};
        cars[1] = "Porch";
        int[] myNum = {10,20,30,40,50};
        System.out.println(cars[1]);
        System.out.println(myNum[0]);
        System.out.println(cars.length);
        // Percorrendo uma matriz
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        // Percorrendo uma matriz com o foreach
        for (String x: cars) {
            System.out.println(x);
        }
        // Matrizes multidimencionais
        int[][] myNumbers = {{1,2,3,4},{5,6,7}};
        System.out.println(myNumbers[1][2]);
        // Percorrendo a matriz bidimencional
        for (int y = 0; y < myNumbers.length; ++y) {
            for (int z = 0; z < myNumbers[y].length; ++z) {
                System.out.println(myNumbers[y][z]);
            }
        }
    }
}
