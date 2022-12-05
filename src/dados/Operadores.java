package dados;

public class Operadores {
    public static void main(String[] args) {
        System.out.println("dados.Operadores");
        int soma1 = 100 + 50;
        int soma2 = soma1 + 50;
        int soma3 = soma1 + soma2;
        int x = 3 - 2;
        int y = 3 * 2;
        int z = 3 / 2;
        int a = 3 % 2;
        int b = ++x;
        x += 3; // O restante dos operadores são do mesmo jeito, -= *= /= %=
        System.out.println(x > 2);
        int v1 = 5;
        int v2 = 3;
        System.out.println(v1 < 5 && v2 > 8);

    }
}
