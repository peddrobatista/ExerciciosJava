package repeticao;

public class Break {
    public static void main(String[] args) {
        System.out.println("Estrutura para interromper um looping");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break; // vai interromper o looping quando a condição for verdadeira,
            }
            System.out.println(i);
        }
    }
}
