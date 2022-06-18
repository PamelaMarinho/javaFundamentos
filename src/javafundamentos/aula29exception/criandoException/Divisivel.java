package javafundamentos.aula29exception.criandoException;

public class Divisivel extends Exception {

    private int index;
    private int vet;

    public Divisivel(int index, int vet) {
        this.index = index;
        this.vet = vet;
    }

    @Override
    public String toString() {
        return index + "não é divisível por" + vet;
    }
}
