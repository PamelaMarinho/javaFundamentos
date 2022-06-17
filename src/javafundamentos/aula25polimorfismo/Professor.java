package javafundamentos.aula25polimorfismo;

public class Professor extends Pessoa {

    public void info(){
        System.out.println("Nome do Professor: "+super.getNome());
    }

}


