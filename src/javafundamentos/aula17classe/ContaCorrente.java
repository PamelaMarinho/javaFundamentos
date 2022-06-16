package javafundamentos.aula17classe;

public class ContaCorrente {

    int agencia;
    double saldo;
    double especial;

    public ContaCorrente(int agencia) {
        this.agencia = agencia;
        System.out.println("classe conta corrente instânciada");
    }

    void sacar(double saque) {
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

    protected void depositar(double deposito){
        saldo += deposito;
        System.out.println("Depósito de R$" + deposito + " realizado com Sucesso");
        imprimirSaldo();
    }

    private void sacarEspecial(){
        especial += saldo;
    }

    public void imprimirSaldo(){
        System.out.println("Saldo: " + saldo);
        System.out.println("Cheque especial: " + especial + "\n");
    }

}

