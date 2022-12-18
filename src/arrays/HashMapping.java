package arrays;
import java.util.HashMap;
public class HashMapping {
    public static void main(String[] args) {
        // Criando um objeto HashMap chamado capitalCities que armazenda chaves Strings e valores Strings
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        // Criando um objeto chamado pessoas
        HashMap<String, Integer> pessoas = new HashMap<String, Integer>();
        // Adicionando chaves e valores (Nome, idade )
        pessoas.put("Pedro", 22);
        pessoas.put("Maria", 20);
        // Adicionando chaves e valores (capitais, cidades)

        capitalCities.put("Brasil", "São Paulo");
        capitalCities.put("India", "Bubain");
        capitalCities.put("EUAs", "Nova York");
        System.out.println(capitalCities);
        // Acessando um item
        System.out.println(capitalCities.get("Brasil"));
        // Printando chaves e valores
        for (String i: pessoas.keySet()) {
            System.out.println("Chave: " + i + "| valor: " + pessoas.get(i));
        }

    }


}
