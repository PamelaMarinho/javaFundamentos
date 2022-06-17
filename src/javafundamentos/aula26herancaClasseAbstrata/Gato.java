package javafundamentos.aula26herancaClasseAbstrata;

public class Gato extends Mamifero implements Estimacao{
    @Override
    public void levarPassear() {
        System.out.println("Passear");
    }

    @Override
    public void mamar() {
        System.out.println("mamar");
    }

    @Override
    public void barulho() {
        super.barulho();
        System.out.println("Miar");
    }
}
