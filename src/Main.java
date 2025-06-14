import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import static Colors.Colors.*;
public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(101);
        Scanner sc = new Scanner(System.in);
        int palpite;
        boolean acertou = false;

        while (!acertou) {
            System.out.println(PURPLE + "Digite um número de 0 á 100: " + RESET);

            try {
                palpite = sc.nextInt();

                if (palpite == numeroSecreto) {
                    System.out.println(GREEN + "Parabéns! Você acertou!" + RESET);
                    acertou = true;
                } else if (palpite > 100 || palpite < 0) {
                    System.out.println(RED + "O número é inválido, tente outro número." + RESET);
                } else if (palpite < numeroSecreto) {
                    System.out.println(BLUE + "O número é maior!" + RESET);
                } else {
                    System.out.println(BLUE + "O número é menor!" + RESET);
                }

            } catch (InputMismatchException e) {
                System.out.println(RED + "Entrada inválida. Digite um número inteiro." + RESET);
                sc.next();
                continue;
            }
        }

        sc.close();
    }
}