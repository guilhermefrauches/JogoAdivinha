import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(101);
        Scanner sc = new Scanner(System.in);
        int palpite;
        boolean acertou = false;

        while (!acertou) {
            System.out.println("Digite um palpite: ");
            palpite = sc.nextInt();

            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você acertou!");
                acertou = true;
            } else if (palpite > 100 || palpite < 0) {
                System.out.println("O numero é inválido, tente outro número.");

            } else if (palpite < numeroSecreto) {
                System.out.println("O número é maior!");
            } else {
                System.out.println("O número é menor!");
            }
        }
        sc.close();
    }
}