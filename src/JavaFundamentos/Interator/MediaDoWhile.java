package JavaFundamentos.Interator;

import java.util.Scanner;

public class MediaDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int cont = 0;

        do {
            System.out.println("número: ");
            numero = scan.nextInt();
             ++cont;
        } while (cont < 5);
    }
}