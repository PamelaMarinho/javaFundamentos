package javafundamentos.aula26herancaClasseAbstrata;

public class Cachorro extends Mamifero implements Estimacao{

    @Override //método da interface
    public void levarPassear() {
        System.out.println("Passear");
    }

    @Override //método da Classe abstrata Mamífero que estendeu Classe Animal
    public void mamar() {
        System.out.println("mamar");
    }

    @Override //método da Classe abstrata Mamífero
    public void barulho() {
        super.barulho();
        System.out.println("Latir");
    }
}
