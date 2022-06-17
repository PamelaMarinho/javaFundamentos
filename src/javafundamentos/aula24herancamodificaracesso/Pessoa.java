package javafundamentos.aula24herancamodificaracesso;

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    protected String getNome() {
        return nome;
    }
    void setNome(String nome) {
        this.nome = nome;
    }
    protected int getIdade() {
        return idade;
    }
    protected void setIdade(int idade) {
        this.idade = idade;
    }
    public static void teste(){}
    static void testePrivate(){}

}
