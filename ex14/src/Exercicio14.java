import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidade = 0;
        double soma = 0, maior = Double.MIN_VALUE, menor = Double.MAX_VALUE;

        while (true) {
            System.out.print("Digite a nota (ou -1 para sair): ");
            double nota = scanner.nextDouble();

            if (nota == -1) break;

            soma += nota;
            quantidade++;

            if (nota > maior) maior = nota;
            if (nota < menor) menor = nota;
        }

        if (quantidade > 0) {
            double media = soma / quantidade;
            System.out.println("Quantidade de alunos: " + quantidade);
            System.out.println("Média da turma: " + media);
            System.out.println("Maior nota: " + maior);
            System.out.println("Menor nota: " + menor);
        } else {
            System.out.println("Nenhuma nota foi inserida.");
        }

        scanner.close();
    }
}


//task: Ler notas de alunos até que o usuário digite-1. Ao final imprimir a
// quantidade de alunos, a média da turma, a maior nota e a menor nota.