package classes;

public class Animal {
    public void animalSounds() {
        System.out.println("Aqui fica os sons dos animais...");
    }
}
class Gato extends Animal {
    public void animalSounds() {
        System.out.println("Miau miau");
    }
}
class Cachorro extends Animal {
    public void animalSounds() {
        System.out.println("Au Au Au");
    }
}
class Teste {
    public static void main(String[] args) {
        Animal meuAnimal = new Animal();
        Animal meuGato = new Gato();
        Animal meuCachorro = new Cachorro();
        meuAnimal.animalSounds();
        meuGato.animalSounds();
        meuCachorro.animalSounds();
    }
}
