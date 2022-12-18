package arquivos;
import java.io.IOException; // Importe a classe IOException para lidar com erros
import java.io.File;
// Criando um arquivo
public class Criar {
    public static void main(String[] args) {
        try {
            File myObj = new File("C:\\Users\\peddr\\JavaProjects\\ExerciciosJava\\src\\arquivos\\filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("Arquivo criado: " + myObj.getName());
            } else {
                System.out.println("Arquivo já existe.");
            }
        } catch (IOException e) {
            System.out.println("Um erro ocorreu.");
            e.printStackTrace();
        }
    }
}
