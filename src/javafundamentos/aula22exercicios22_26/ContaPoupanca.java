package javafundamentos.aula22exercicios22_26;

public class ContaPoupanca  extends ContaBancaria{

    private double rendimento;

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public void calcularNovoSaldo(){
        double saldo =+ getRendimento();
        super.setSaldo(saldo);
    }


}
