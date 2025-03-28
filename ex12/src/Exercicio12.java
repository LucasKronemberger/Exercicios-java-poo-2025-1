import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int b = scanner.nextInt();

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        int soma = 0;
        int count = 0;

        System.out.print("Números pares no intervalo: ");
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            soma += i;
            count++;
        }

        double media = (double) soma / count;

        System.out.println("\nSoma: " + soma);
        System.out.println("Média: " + media);

        scanner.close();
    }
}


//task: Ler dois números inteiros (a e b) e imprimir os pares no intervalo a..b, além
// da soma e da média desses números. Caso a seja maior que b, imprima os
// números no intervalo b..a.