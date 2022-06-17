package javafundamentos.aula22exercicios22_26;

public class ContaEspecial extends ContaBancaria{

    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean sacar(double saque){
        if((limite - saque) <= 0){
            limite -= saque;
            return true;
        }else{
            System.out.println("Valor acima do permitido");
            return false;
        }
    }
}
