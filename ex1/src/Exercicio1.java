public class Exercicio1 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro: ");
        int a = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int b = scanner.nextInt();

        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + ((b != 0) ? (a / b) : "Indefinido"));
        scanner.close();
    }
}


//Task: Leia duas variáveis inteiras e imprima a soma, subtração, multiplicação e
//divisão entre elas.