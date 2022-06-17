package javafundamentos.aula22exercicios22_26;

public class Teste {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();
        conta.setNomeClient("Sara");
        conta.setNumConta(1234);
        conta.depositar(196.00);
        conta.sacar(10);

        System.out.println(conta);

        ContaEspecial especial = new ContaEspecial();
        especial.setLimite(1000);

        ContaPoupanca poupanca = new ContaPoupanca();
        poupanca.setNomeClient("alice");
        poupanca.setNumConta(891234);
        poupanca.depositar(100.00);
        poupanca.setRendimento(2.8);

        System.out.println(poupanca);


    }

}
