package classes;

public class Excecoes {
    // Erros Personalizados
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Acesso negado!!, você deve ter mais de 18 anos");
        } else {
            System.out.println("Acesso concedido!!, você tem idade suficiente");
        }
    }
    public static void main(String[] args) {
        try {
            // Tentando executar o código abaixo
            int[] myNumbers = {1,2,3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            // Tratando o erro de cima caso venha ocorrer
            System.out.println("Algo deu errado!!");
        } finally {
            System.out.println("O 'Try Catch' acabou!");
        }
        checkAge(15);
    }
}
