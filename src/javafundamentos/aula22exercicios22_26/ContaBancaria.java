package javafundamentos.aula22exercicios22_26;

public class ContaBancaria {

    private String nomeClient;
    private int numConta;
    private double saldo;

    public String getNomeClient() {
        return nomeClient;
    }

    public void setNomeClient(String nomeClient) {
        this.nomeClient = nomeClient;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(double saque){
        if((saldo - saque) >= 0){
            saldo -= saque;
            return true;
        }else{
            System.out.println("Valor acima do permitido");
            return false;
        }
    }

    public void depositar(double deposito){
        double dep = saldo + deposito;
        saldo = dep;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "nomeClient='" + nomeClient + '\'' +
                ", numConta=" + numConta +
                ", saldo=" + saldo +
                '}';
    }
}
