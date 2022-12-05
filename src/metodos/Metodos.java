package metodos;

public class Metodos {
    // Criando um método
    static void meuMetodo(String nome, int idade ) {
        System.out.println("Esse é meu método!!");
        System.out.println("Olá " + nome + ", você tem "+ idade);
    }
    static int soma(int x) {
        return 5 + x;
    }
    static int soma2(int a, int b) {
        return a + b;
    }
    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Acesso negado! Você não tem idade suficiente");
        } else {
            System.out.println("Acesso concedido! Você tem idade suficiente");
        }
    }
    // Recursão de métodos em Java
    public static int sum(int k) {
        if ( k > 0) {
            return k + sum(k- 1);
        } else {
            return 0;
        }
    }
    // Executando um método
    public static void main(String[] args) {
        // Chamando um método
        int z = soma2(5,3);
        int result = sum(10);
        System.out.println(result);
        meuMetodo("Pedro", 22);
        System.out.println(soma(3));
        System.out.println(z);
        checkAge(20);
    }

}
