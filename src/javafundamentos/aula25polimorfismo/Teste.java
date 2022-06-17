package javafundamentos.aula25polimorfismo;

public class Teste {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Amanda");

        Pessoa aluno = new Aluno();
        aluno.setNome("alice");

        Pessoa prof = new Professor();
        prof.setNome("Maria");

        pessoa.info();
        prof.info();
        aluno.info();
    }

}
