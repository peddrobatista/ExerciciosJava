package classes;

public class ClasseF {
    private String name;
    // Getter
    public String getName() {
        return name;
    }
    // Setter
    public void setName(String newName) {
        this.name = newName;
    }
    public static void main(String[] args) {
        ClasseF myPerson = new ClasseF();
        myPerson.setName("João"); // Definindo o valor da variável
        Student myObj = new Student();
        System.out.println("Nome: " + myObj.fname);
        System.out.println("Idade: "+ myObj.age);
        System.out.println("Ano de Conclusão: "+ myObj.graduationYear);
        myObj.study();
        System.out.println(myPerson.getName()); // Retornando o valor da variável
    }
}
