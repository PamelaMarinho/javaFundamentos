package javafundamentos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Aula8Exercicios {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Maior número
        System.out.println("informe o primeiro número");
        int num1 = scan.nextInt();
        System.out.println("informe o segundo número");
        int num2 = scan.nextInt();

        if(num1 > num2){
            System.out.println(num1);
        }else{
            System.out.println(num2);
        }

        //Negativo ou positivo
        System.out.println("informe um número");
        int num3 = scan.nextInt();

        if (num3 < 0){
            System.out.println("número negativo");
        }else {
            System.out.println("número positivo");
        }

        //Sexo feminino ou masculino
        System.out.println("informe o sexo");
        String letra = scan.next();

        if (letra.equalsIgnoreCase("M")){
            System.out.println("Masculino");
        } else if ( letra.equalsIgnoreCase("F")){
            System.out.println("Feminino");
        } else{
            System.out.println("letra inválida");
        }

        /*ArrayList<String> arr = new ArrayList<String>();
        Collections.addAll(arr,"a","e","o","u","i");
        System.out.println("Informe uma letra");
        String word = scan.next();
        String wordSplit =  word.split("");
        System.out.println(wordSplit);*/

        //média
        System.out.println("nota 1");
        int nota1 = scan.nextInt();
        System.out.println("nota 2");
        int nota2 = scan.nextInt();

        double media = (nota1 + nota2)/2;

        System.out.println("média: "+ media);

        if(media == 7){
            System.out.println("Aprovado");
        } else if (media <7){
            System.out.println("reprovado");
        } else if (media == 10){
            System.out.println("aprovado com distinção");
        }

        //maior número
        System.out.println("número 1");
        int num11 = scan.nextInt();
        System.out.println("número 2");
        int num22 = scan.nextInt();
        System.out.println("número 3");
        int num33 = scan.nextInt();

        if(num11 > num22 && num11 > num33){
            System.out.println("maior número "+num11);
        } else if (num22 > num11 && num22 > num33){
            System.out.println("maior número "+num22);
        } else{
            System.out.println("maior número "+num33);
        }

        //turno de estudo
        System.out.println("Qual turno você estuda? M T ou N");
        String turno = scan.next();

        switch(turno) {
            case ("M"):
                System.out.println("manha");
                break;
            case ("T"):
                System.out.println("tarde");
                break;
            case("N"):
                System.out.println("noite");
                break;
            default:
                System.out.println("inválido");
        }



    }
}
