package javafundamentos.aula53Enum.enumValueValueOf;

import javafundamentos.aula53Enum.DiasFinalSemana;
import javafundamentos.aula53Enum.EnumComoClasse.EnumComoClasse;

public class TesteEnum {
    public static void main(String[] args) {
        EnumComoClasse[] dias = EnumComoClasse.values();

        for(int i = 0; i < dias.length; i++){
            System.out.println(dias[i]);
        }
        //OU
        System.out.println();
        for(EnumComoClasse dia : EnumComoClasse.values()){
            System.out.println(dia);
        }
    }
}

/* retorna o valor DOMINGO e SABADO
 */