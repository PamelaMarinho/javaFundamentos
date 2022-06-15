package javafundamentos.Aula17Classe;

public class ContaCorrente {

    double saldo;
    double especial;

    void sacar(double saque){
        if(saque <= saldo ){
            saldo -= saque;
            System.out.println("Saque de R$" + saque + " realizado com Sucesso");
            imprimirSaldo();
        }else if(saque <= (saldo+especial)){
            saldo -= saque;
            sacarEspecial();
            System.out.println("Saque do cheque especial no valor de R$" + saque + " realizado com Sucesso");
            imprimirSaldo();
        }else{
            imprimirSaldo();
            System.out.println("você não possui saldo em conta");
        }
    }

    void depositar(double deposito){
        saldo += deposito;
        System.out.println("Depósito de R$" + deposito + " realizado com Sucesso");
        imprimirSaldo();
    }

    void sacarEspecial(){
        especial += saldo;
    }

    void imprimirSaldo(){
        System.out.println("Saldo: " + saldo);
        System.out.println("Cheque especial: " + especial + "\n");
    }

}

