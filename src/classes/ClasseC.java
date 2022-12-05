package classes;

public class ClasseC {
    // Métodos Estáticos
    static void mensagem() {
        System.out.println("Bom dia!!");
    }
    // Métodos Públicos
    public void mensagem2() {
        System.out.println("Olá Mundo!!!");
    }
    public void fullThrottle() {
        System.out.println("O carro vai mais rápido que puder");
    }
    public void speed(int maxSpeed) {
        System.out.println("A velocidade máxima é "+ maxSpeed);
    }
    // Método principal
    public static void main(String[] args) {
        mensagem();
        ClasseC myObj = new ClasseC();
        ClasseC myCar = new ClasseC();
        myObj.mensagem2();
        myCar.fullThrottle();
        myCar.speed(200);
    }
}
