package javafundamentos;

import java.util.Scanner;

public class aula4Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));

        //next lê qualquer tipo e retorna uma String
        System.out.println("insira seu nome");
        String nome = scan.next();

        //vai gerar uma exception se não informar o tipo informado no next.
        System.out.println("altura");
        double altura = scan.nextDouble();

        //nextLine pega tudo que foi informado
        //next somente a primeira
    }
}
