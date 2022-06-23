package javafundamentos.aula55autoboxingUnboxing;

public class autoboxing {
    public static void main(String[] args) {

        //atribui valor a um obj do tipo primitivo
        //autoboxing
        Integer i = 123;
        Boolean b_ = true;
        Double d = 2.6;
        Character c_ = 123;

        //atribui um obj do tipo primitivo a uma variável tipo primitivo
        //auto unboxing
        int i2 = i; // int i2 = i.intValue()

        Integer a,b,c;
        a = 1;
        b = 2;
        c = 3;
       // faz auto unboxing com a,b,c porque vai operar com o 3
       //o resultado sera feito o autoboxing porque esta sendo atribuído a um obj tipo primmitivo
       Integer media = (a+b+c)/3;

    }
}
