import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de alunos: ");
        int n = scanner.nextInt();

        double soma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite a nota do aluno " + i + ": ");
            double nota = scanner.nextDouble();
            soma += nota;
        }

        double media = soma / n;
        System.out.println("Média da turma: " + media);

        scanner.close();
    }
}

//task: Ler um número de alunos n. Em seguida, ler as notas dos n alunos e
// imprimir, ao final, a média da turma.