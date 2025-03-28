import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tempo em segundos: ");
        int tempoTotal = scanner.nextInt();

        int horas = tempoTotal / 3600;
        int minutos = (tempoTotal % 3600) / 60;
        int segundos = tempoTotal % 60;

        System.out.println("Tempo formatado: " + horas + "h " + minutos + "m " + segundos + "s");

        scanner.close();
    }
}


//Leia uma variável t com um tempo qualquer em segundos e imprima esse
// valor em hora, minuto e segundo.