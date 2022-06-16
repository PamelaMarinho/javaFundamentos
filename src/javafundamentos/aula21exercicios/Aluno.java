package javafundamentos.aula21exercicios;

public class Aluno {

    private String nome;
    private String matricula;
    private double[] notas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return this.notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

//    public void info(){
//        System.out.println("\n informações aluno");
//        System.out.println(getMatricula());
//        System.out.println(getNome());
//        for(double notas : notas){
//            System.out.println(notas);
//        }
//    }
}
