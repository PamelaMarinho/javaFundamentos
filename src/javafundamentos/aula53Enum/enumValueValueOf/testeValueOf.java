package javafundamentos.aula53Enum.enumValueValueOf;

import javafundamentos.aula53Enum.EnumComoClasse.EnumComoClasse;

public class testeValueOf {
    public static void main(String[] args) {
        EnumComoClasse dia = EnumComoClasse.valueOf(EnumComoClasse.class, "DOMINGO");
        System.out.println(dia.getClass()); //class javafundamentos.aula53Enum.EnumComoClasse.EnumComoClasse
    }
}

/* valueof retorna uma constante do tipo enum no primeiro
 parametro de acordo com o tipo string no segundo parametro.

 valorOf( enum do tipo classe, valor)
 */