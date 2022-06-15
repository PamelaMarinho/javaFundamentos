package javafundamentos;

import java.util.Scanner;

public class Aula9Exercicios {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //nota entre 1 e 10
        System.out.println("informe uma nota de 1 a 10");
        int nota = scan.nextInt();

        if(nota<1 || nota>10){
            System.out.println("informe uma nota de 1 a 10");
            nota = scan.nextInt();
        }

        //senha e nome de user
        System.out.println("Informe a senha e nome");
        String senha = scan.next();
        String nome = scan.next();

        while(senha == nome){
            System.out.println("senha e nome não podem ser iguais");
            System.out.println("Informe novamente");
            senha = scan.next();
            nome = scan.next();
        }

         System.out.println("Informe seu nome");
        String nome2 = scan.next();
        System.out.println("Informe sua idade");
        int idade = scan.nextInt();
        System.out.println("Informe seu salário");
        Double salario = scan.nextDouble();
        System.out.println("Informe seu sexo M ou F");
        String genero = scan.next();
        System.out.println("Informe seu estado civil S, C, D ou V");
        String civil = scan.next();

        while(nome.length() > 3){
            System.out.println("Informe seu nome");
            nome = scan.next();
        }

        while(idade < 0 || idade > 150){
            System.out.println("Informe sua idade");
            idade = scan.nextInt();
        }

        while( salario == 0 ){
            System.out.println("Informe seu salário");
            salario = scan.nextDouble();
        }

        while(genero != "M" || genero != "F"){
            System.out.println("Informe seu sexo M ou F");
            genero = scan.next();
        }

        while(civil != "C" || civil != "V" || civil != "S" || civil != "D"){
            System.out.println("Informe seu estado civil S, C, D ou V");
            civil = scan.next();
        }







    }
}
