package condicionais;

public class Condicionais {
    public static void main(String args[]) {
        System.out.println("Estruturas condicionais");
        int n1 = 7;
        int n2 = 8;
        double media = (n1 + n2) / 2;
        if (media >= 7) {
            System.out.println("APROVADO!!!"); // Caso a expressão seja verdadeira
        } else if (media >= 5 && media <= 6.9){
            System.out.println("VOCÊ ESTÁ DE RECUPERAÇÃO!!!"); // Caso a expressão seja falsa
        } else {
            System.out.println("REPROVADO!!!"); // Caso as expressões acima não sejam verdadeiras
        }
        int hora = 20;
        String resultado = (hora >= 18)? "Boa noite!!!": "Boa tarde!!!";
        System.out.println(resultado);
    }
}
