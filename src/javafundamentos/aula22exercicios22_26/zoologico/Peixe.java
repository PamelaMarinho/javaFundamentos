package javafundamentos.aula22exercicios22_26.zoologico;

public class Peixe extends Animal{

    private String caracteristicas;

    public Peixe(){
            super();
            this.setAmbiente("mar");
            this.setNumPatas(0);
            this.setCor("cinza");
            this.caracteristicas = "barbatanas e cauda";
        }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }


}
