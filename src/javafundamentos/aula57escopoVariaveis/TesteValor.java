package javafundamentos.aula57escopoVariaveis;

public class TesteValor {
    public static void main(String[] args) {
        EscopoVariaveis escopo = new EscopoVariaveis();

        System.out.println(escopo.getValor()); //0
        escopo.setValor(15);
        System.out.println(escopo.calculaValor(25)); //25 + 10
        System.out.println(escopo.teste()); //4
        System.out.println(escopo.getValor()); //15

    }
}

