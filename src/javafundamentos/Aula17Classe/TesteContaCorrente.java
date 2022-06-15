package javafundamentos.Aula17Classe;

public class TesteContaCorrente {
    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();

        conta.especial = 100;
        conta.saldo = 400.00;

        conta.imprimirSaldo();
        conta.sacar(500.00);





    }
}
