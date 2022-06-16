package javafundamentos.aula21exercicios;

public class Professor {

    private String nome;
    private String dep;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void info(){
        System.out.println("\n Informações Professor");
        System.out.println(getDep());
        System.out.println(getEmail());
        System.out.println(getNome());
    }
}
