package classes;

public interface Animals {
    public void animalsSounds();
    public void run();
}
class Cachorros implements Animals {
    public void animalsSounds() {
        System.out.println("O cachorro diz AU AU");
    }
    public void run() {
        System.out.println("O cachorro corre rápido");
    }
}
class AnimalPrincipal {
    public static void main(String[] args) {
        Cachorros myDogs = new Cachorros();
        myDogs.animalsSounds();
        myDogs.run();
    }
}
