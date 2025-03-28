public class Exercicio2 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Digite o primeiro número decimal: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o segundo número decimal: ");
        double b = scanner.nextDouble();

        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + ((b != 0) ? (a / b) : "Indefinido"));
        scanner.close();
    }
}

//Task: Altere o tipo das duas variáveis do exercício 1 para ponto flutuante.