package javafundamentos.aula26herancaClasseAbstrata;

public class Teste {
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.barulho();
        gato.levarPassear();
        gato.mamar();

        System.out.println();

        Cachorro dog = new Cachorro();
        dog.barulho();
        dog.levarPassear();
        dog.mamar();
    }
}
