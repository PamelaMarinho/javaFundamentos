package javafundamentos;

import java.util.Scanner;

public class Aula13IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe sua idade");
        int idade = scan.nextInt();

        if(idade >= 18) {
            System.out.println("maior de idade");
        }else if(idade < 18){
            System.out.println("menor de idade");
        }else {
            System.out.println("idade incorreta");
        }

    }
}
