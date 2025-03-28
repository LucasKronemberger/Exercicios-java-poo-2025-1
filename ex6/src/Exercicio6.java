import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância percorrida (Km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Digite o tempo gasto (horas): ");
        double tempo = scanner.nextDouble();

        System.out.print("Digite a quantidade de combustível consumido (litros): ");
        double combustivel = scanner.nextDouble();

        double velocidadeMedia = distancia / tempo;
        double consumoMedio = distancia / combustivel;

        System.out.println("Velocidade média: " + velocidadeMedia + " Km/h");
        System.out.println("Consumo médio: " + consumoMedio + " Km/l");

        scanner.close();
    }
}

//task: Leia a distância percorrida por um carro, o tempo gasto e a quantidade de
// gasolina consumida. Em seguida, imprima a velocidade média (KM/h) e o
// consumo de combustível (Km/l).