import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("O número " + n + " é par.");
        } else {
            System.out.println("O número " + n + " é ímpar.");
        }

        scanner.close();
    }
}

//task: Leia uma variável n inteira. Em seguida, imprima uma mensagem
// informando se o número n é par ouímpar