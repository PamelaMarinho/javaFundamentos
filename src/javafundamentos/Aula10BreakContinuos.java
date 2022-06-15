package javafundamentos;

import java.util.Scanner;

public class Aula10BreakContinuos {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("informe um número");
        int num = scan.nextInt();

        for(int i = 1; i <= num; i++){
            System.out.println(i);
            if(i % 2 == 0){
                break;
            }
        }

        System.out.println("informe um número");
        int num2 = scan.nextInt();

        for(int i = 1; i <= num2; i++){

            if(i % 3 == 0){
                continue;
            }
            System.out.println(i);
        }

    }
}
