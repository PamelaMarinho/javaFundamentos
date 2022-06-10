package Iterator.interator;

import java.util.Scanner;

public class IntegerDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numeros;
        int cont = 0;
        int numero;
        int par = 0;
        int impar = 0;

        System.out.println("quantidade de números: ");
        numeros = scan.nextInt();

        do {
            System.out.println("numero:");
            numero = scan.nextInt();

            if(numero % 2 == 0 ) par++;
            else impar++;

            cont++;
        } while( cont < numeros );

        System.out.println("pares: " + par + " impares: " + impar);
    }
}