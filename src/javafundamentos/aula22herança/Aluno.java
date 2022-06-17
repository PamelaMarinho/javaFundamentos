package javafundamentos.aula22herança;

public class Aluno extends Pessoa {

    private String escolaridade;

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public void infoAluno(){
        System.out.println(getNome());
        System.out.println(getIdade());
        System.out.println(getOcupacao());
        System.out.println(getEscolaridade());
    }

    static void defaull(){}
}
