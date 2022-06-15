package javafundamentos;

import java.util.Scanner;

public class Aula11WhileDoWhile {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);

       System.out.println("Informe um número");
        int num = scan.nextInt();

        while(num > 10){
            System.out.println("Informe um número");
            num = scan.nextInt();
        }

        do{
            System.out.println("Informe um número menor que 10");
            num = scan.nextInt();
        } while (num > 10);

    }
}
