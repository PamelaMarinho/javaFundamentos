package javafundamentos.aula27final;

public class Teste {
    public static void main(String[] args) {

        ClasseFinal.PODE_ALTERAR = 22;
        // ClasseFinal.SEM_ALTERAR = 33; (vai dar erro pois é final)
        System.out.println(ClasseFinal.SEM_ALTERAR);
        System.out.println(ClasseFinal.PODE_ALTERAR);

    }
}
