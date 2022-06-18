package javafundamentos.aula22exercicios22_26.Interface;

public class Cavalo  extends Mamifero implements NaoDomestico{
    @Override
    public void amamentar() {
        super.amamentar();
        System.out.println("amamentando");
    }

    public void emitirSom(){
        System.out.println("Som de cavalo");
    }

    @Override
    public void brincar() {
    }

    @Override
    public void darBanho() {
    }
}
