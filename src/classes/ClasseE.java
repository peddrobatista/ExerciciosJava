package classes;
// classe principal só pode ser usada e acessada pela subclasse
abstract class ClasseE {
    public String fname = "Pedro";
    public int age = 22;
    public abstract void study(); // método abstrato
}
// subclasse herdada de ClasseE
class Student extends ClasseE {
    public int graduationYear = 2018;
    public void study() {
        System.out.println("Estudando Java");
    }
}

