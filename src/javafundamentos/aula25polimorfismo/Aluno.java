package javafundamentos.aula25polimorfismo;

public class Aluno extends Pessoa {

    public void info(){
        System.out.println("Nome do aluno: "+super.getNome());
    }

}
