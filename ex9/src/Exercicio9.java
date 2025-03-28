import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número real: ");
        double x = scanner.nextDouble();

        long arredondado = (x - (int) x) < 0.5 ? (long) Math.floor(x) : (long) Math.ceil(x);

        System.out.println("Número arredondado: " + arredondado);

        scanner.close();
    }
}


//task: Ler um número real x e imprimi-lo arredondando seu valor para mais
// ou para menos. Se a parte decimal for menor que 0.5 arredonda para
// menos. Se for maior ou igual a 0.5 arredonda para mais.