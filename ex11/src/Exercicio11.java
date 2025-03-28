import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma operação (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        System.out.print("Digite o primeiro número: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double b = scanner.nextDouble();

        double resultado;
        switch (op) {
            case '+':
                resultado = a + b;
                break;
            case '-':
                resultado = a - b;
                break;
            case '*':
                resultado = a * b;
                break;
            case '/':
                resultado = (b != 0) ? a / b : Double.NaN;
                break;
            default:
                System.out.println("Operação inválida.");
                return;
        }

        System.out.println(a + " " + op + " " + b + " = " + resultado);

        scanner.close();
    }
}


//task: Ler um caractere op representando uma operação aritmética (+,-, *,
// /) e em seguida dois números reais a e b. Imprimir a expressão
// matemática junto com o seu resultado no formato:
// a op b = resultado