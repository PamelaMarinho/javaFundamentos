package javafundamentos.aula17classe;

public class TesteContaCorrente {
    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente(0001);

        conta.especial = 100;
        conta.saldo = 400.00;

        conta.imprimirSaldo();
        conta.sacar(500.00);
    }
}
