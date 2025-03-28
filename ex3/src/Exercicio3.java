import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário atual: ");
        double salario = scanner.nextDouble();
        System.out.print("Digite o percentual de aumento (%): ");
        double percentual = scanner.nextDouble();

        double novoSalario = salario + (salario * percentual / 100);
        System.out.println("Novo salário: " + novoSalario);

        scanner.close();
    }
}


//task: Leia o salário e o percentual de aumento. Em seguida, aplique o percentual de aumento sobre o salário e imprima o novo salário.