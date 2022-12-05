package repeticao;

public class While {
    public static void main(String[] args) {
        System.out.println("Estrutura While");
        int i = 0;
        int x = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        do {
            System.out.println(x);
            x++;
        } while (x < 5);
    }
}
