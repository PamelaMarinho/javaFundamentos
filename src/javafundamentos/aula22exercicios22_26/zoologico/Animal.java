package javafundamentos.aula22exercicios22_26.zoologico;

public class Animal {

    private String nome;
    private String cor;
    private String ambiente;
    private int numPatas = 4;
    private double velocidade;
    private double comprimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public String toString() {
        return "Animal:" + '\n' +
                "nome='" + nome + '\n' +
                "cor='" + cor + '\n' +
                "ambiente='" + ambiente + '\n' +
                "numPatas=" + numPatas + '\n' +
                "velocidade=" + velocidade + '\n' +
                "comprimento=" + comprimento + '\n' +
                "******************************";
    }
}
