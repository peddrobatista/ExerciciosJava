package classes;
import java.util.regex.Matcher; // Usado para procurar o padrão
import java.util.regex.Pattern; // define um padrão (para ser usado em uma pesquisa)
public class JavaRegEx {
    // Descubrindo se há alguma ocorrência da palavra W3Schools em uma frase
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("W3Schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3Schools!");
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match encontrado");
        } else {
            System.out.println("Match não encontrado");
        }
    }
    /* Primeiro, o padrão é criado usando o Pattern.compile()método.
      O primeiro parâmetro indica qual padrão está sendo pesquisado e
      o segundo parâmetro tem um sinalizador para indicar que a pesquisa
      não deve diferenciar maiúsculas de minúsculas.
      O segundo parâmetro é opcional.
      O matcher()método é usado para procurar o padrão em uma string.
      Ele retorna um objeto Matcher que contém informações sobre a pesquisa realizada.
      O find()método retorna true se o padrão foi encontrado
      na string e false se não foi encontrado.
    */

}
