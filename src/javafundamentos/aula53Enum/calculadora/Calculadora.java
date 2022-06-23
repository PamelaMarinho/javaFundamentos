package javafundamentos.aula53Enum.calculadora;

public class Calculadora {
    public static void main(String[] args) {

        int x = 6;
        int y = 2;


        for(Operacoes conta : Operacoes.values()){
            System.out.println(conta);
            System.out.print(x + " ");
            System.out.print(conta.toString());
            System.out.print( " " + y + " = ");
            System.out.println(conta.executarOperacao(x,y));
        }
    }
}
