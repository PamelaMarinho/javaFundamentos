package javafundamentos.aula25polimorfismo;

public class Pessoa {
    private String nome;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void info(){
        System.out.println( getNome() );
    }
}
