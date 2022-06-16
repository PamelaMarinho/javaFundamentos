package javafundamentos.aula21exercicios;

public class Curso {

    private String nome;
    private String horario;
    private Professor professor;
    private Aluno[] aluno;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAluno() {
        return aluno;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }

    public void info(){
        System.out.println("\n Informações Curso");
        System.out.println(getNome());
        System.out.println(getHorario());
    }

}
