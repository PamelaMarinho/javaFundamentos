package javafundamentos.aula22exercicios22_26.Interface;

public class Papagaio extends Ave implements Domestico{
    public void emitirSom(){
        System.out.println("Som de ave");
    }

    public void voar(){
        System.out.println("Voando");
    }

    @Override
    public void domestico() {
        Domestico.super.domestico();
    }

    @Override
    public void passear() {

    }
}
