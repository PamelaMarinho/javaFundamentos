package javafundamentos.aula21exercicios;

public class Exercicio {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setNome("química");
        curso.setHorario("manha");

        Professor professor = new Professor();
        professor.setDep("geral");
        professor.setNome("Lilian");
        professor.setEmail("lilial@");
        curso.setProfessor(professor);

        Aluno[] aluno = new Aluno[3];
        for(int i = 0; i < 2; i++){
            String nome = "marcio";
            String matricula = "ativo";
            double[] notas = new double[3];
            for(int j = 0; j < 2; j++){
                notas[j] = j++;
            }
            Aluno aluno1 = new Aluno();
            aluno1.setMatricula(matricula);
            aluno1.setNome(nome);
            aluno1.setNotas(notas);
        }
        curso.setAluno(aluno);

            professor.info();
            curso.info();

    }
}
