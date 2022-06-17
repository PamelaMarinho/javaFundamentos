package javafundamentos.aula28classeobject;

public class Teste{
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome( "Yuka");


        Aluno aluno2 = new Aluno();
        aluno2.setNome( "Yuka");

        System.out.println(aluno);
        System.out.println(aluno2);
        System.out.println(aluno == aluno2); //retorna true após sobrescrever método equals
    }

    // sinal == compara tipo e referencia
    // equal compara os atributos mas se sobrescrito retorna true
}
