package javafundamentos.aula100teste;

public class Classe {

    public static String statico= "nome";
    public String noStatic = "nao static";

    public static String getStatico() {
        return statico;
    }

    public static void setStatico(String statico) {
        Classe.statico = statico;
    }

    public String getNoStatic() {
        return noStatic;
    }

    public void setNoStatic(String noStatic) {
        this.noStatic = noStatic;
    }

    public static String statico(){
        return "nome";
    }

    public String naoStatic(){
        return "nao static";
    }
}

