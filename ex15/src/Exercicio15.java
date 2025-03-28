import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vogais = 0, digitos = 0, outros = 0;

        System.out.println("Digite caracteres (termine com '.'): ");
        while (true) {
            char c = scanner.next().charAt(0);

            if (c == '.') break;

            if (Character.isDigit(c)) {
                digitos++;
            } else if ("AEIOUaeiou".indexOf(c) != -1) {
                vogais++;
            } else {
                outros++;
            }
        }

        System.out.println("Quantidade de vogais: " + vogais);
        System.out.println("Quantidade de dígitos: " + digitos);
        System.out.println("Quantidade de outros caracteres: " + outros);

        scanner.close();
    }
}

//task: Ler caracteres até que o usuário digite '.' (ponto). Ao final imprimir: a
// quantidade de vogais, a quantidade de dígitos e a quantidade dos demais
// caracteres.