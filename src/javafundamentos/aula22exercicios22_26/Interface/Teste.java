package javafundamentos.aula22exercicios22_26.Interface;

public class Teste {
    public static void main(String[] args) {
        Papagaio papagaio = new Papagaio();
        papagaio.setNome("papagaio");
        papagaio.voar();
        papagaio.emitirSom();
        papagaio.domestico();

        System.out.println(papagaio);

        Cavalo cavalo = new Cavalo();
        cavalo.amamentar();
        cavalo.emitirSom();
        System.out.println(cavalo);
    }
}
