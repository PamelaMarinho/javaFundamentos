package javafundamentos.aula22exercicios22_26.zoologico;

public class Mamifero extends Animal{
    private String alimento;
    public Mamifero(){
        super();
        this.setAmbiente("terra");
        this.setCor("castanho");
        this.alimento = "mamar";
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
}
