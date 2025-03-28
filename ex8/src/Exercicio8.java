import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de kilowatts consumidos: ");
        double consumo = scanner.nextDouble();

        System.out.print("Digite o valor do kilowatt: ");
        double valorKw = scanner.nextDouble();

        double valorTotal = consumo * valorKw;
        if (consumo < 150) {
            valorTotal *= 0.9; // Aplica desconto de 10%
        }

        System.out.println("Valor a ser pago: R$ " + valorTotal);

        scanner.close();
    }
}


//Task: Leia duas variáveis com a quantidade de kilowatts consumidos em uma
// casa e o valor do kilowatt. Em seguida, calcule o valor a ser pago,
// concedendo um desconto de 10% caso o consumoseja menor que 150Kw.