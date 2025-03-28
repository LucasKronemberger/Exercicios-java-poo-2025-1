import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = scanner.nextInt();

        System.out.print("Digite o limite inferior do intervalo: ");
        int inferior = scanner.nextInt();

        System.out.print("Digite o limite superior do intervalo: ");
        int superior = scanner.nextInt();

        if (n < inferior) {
            System.out.println("O número está antes do intervalo.");
        } else if (n > superior) {
            System.out.println("O número está depois do intervalo.");
        } else {
            System.out.println("O número está dentro do intervalo.");
        }

        scanner.close();
    }
}


//task: Ler um número inteiro n e mais dois números (inferior e superior) que
// formam um intervalo. Ao final, imprima uma mensagem informando
// se n está antes, dentro ou depois do intervalo.