package javafundamentos;

import java.util.Scanner;

public class aula7switchCase {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int dia = scan.nextInt();

        String semana = "";
        switch (dia) {
            case (1): semana = "domingo";
                break;
            case (2): semana = "segunda";
                break;
            case (3): semana = "terça";
                break;
            case (4): semana = "quarta";
                break;
            case (5): semana = "quinta";
                break;
            case (6): semana = "sexta";
                break;
            case (7): semana = "sábado";
                break;
        }
        System.out.println(semana);
    }
}
