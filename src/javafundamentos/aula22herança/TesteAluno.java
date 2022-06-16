package javafundamentos.aula22herança;

public class TesteAluno {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        //métodos da classe Pessoa
        aluno.setNome("Ricardo");
        aluno.setIdade(11);
        aluno.setOcupacao("Estudante");
        //método da classe Aluno
        aluno.setEscolaridade("primário");

        aluno.infoAluno();
    }

}
