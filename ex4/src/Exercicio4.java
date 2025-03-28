import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        double perimetro = 2 * Math.PI * raio;
        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("Perímetro: " + perimetro);
        System.out.println("Área: " + area);

        scanner.close();
    }
}

//task: Leia o raio de um círculo. Em seguida imprima o perímetro (2R) e a
//área (pi R2) do círculo com esse raio.