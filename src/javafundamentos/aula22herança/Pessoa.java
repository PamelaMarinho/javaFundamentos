package javafundamentos.aula22herança;

public class Pessoa {

    private String nome;
    private String ocupacao;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void info(){
        System.out.println(idade);
        System.out.println(nome);
    }
}
