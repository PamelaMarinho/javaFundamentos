package JavaFundamentos.Interator;

import java.util.Scanner;

public class TabuadaFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tabuada;

        System.out.println("informe a tabuada");
        tabuada = scan.nextInt();

        System.out.println("Tabuada "+tabuada);
        for( int i = 1; i <= 10; i++){
            System.out.println(i + " X " + tabuada + " = " + i * tabuada);
        }
    }
}