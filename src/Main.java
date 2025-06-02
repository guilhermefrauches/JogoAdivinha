import java.util.Random;
import java.util.Scanner;
public class Main {

    public static final String GREEN = "\u001B[32m";
    public static final String RED = "\u001B[31m";
    public static final String PURPLE = "\u001B[35m";
    public static final String BLUE = "\u001B[34m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(101);
        Scanner sc = new Scanner(System.in);
        int palpite;
        boolean acertou = false;

        while (!acertou) {
            System.out.println( PURPLE + "Digite um número: " + RESET);
            palpite = sc.nextInt();

            if (palpite == numeroSecreto) {
                System.out.println(GREEN + "Parabéns! Você acertou!" + RESET);
                acertou = true;
            } else if (palpite > 100 || palpite < 0) {
                System.out.println(RED+ "O numero é inválido, tente outro número." + RESET );

            } else if (palpite < numeroSecreto) {
                System.out.println(BLUE + "O número é maior!" + RESET);
            } else {
                System.out.println(BLUE + "O número é menor!" + RESET);
            }
        }
        sc.close();
    }
}