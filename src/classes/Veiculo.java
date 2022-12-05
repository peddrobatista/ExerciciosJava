package classes;

public class Veiculo {
    protected String brand = "Ford";
    protected int ano = 2018;
    protected String cor = "Red";
    public void acelerar() {
        System.out.println("Está acelerando...");
    }
}
class Car extends Veiculo {
    private String modelo = "Mustang";

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public static void main(String[] args) {
        // Criando um objeto
        Car myCar = new Car();
        myCar.acelerar();
        System.out.println(myCar.brand);
        System.out.println(myCar.ano);
        System.out.println(myCar.cor);
        System.out.println(myCar.getModelo());
    }
}
