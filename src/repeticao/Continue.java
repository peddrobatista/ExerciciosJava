package repeticao;

public class Continue {
    public static void main(String[] args) {
        System.out.println("Estrutura para continuar um looping");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue; // vai pular o valor 4
            }
            System.out.println(i);
        }
    }
}
