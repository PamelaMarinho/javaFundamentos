package javafundamentos.aula19encapsulamento;

public class Documento {

    public int numero;
    private String estado;
    private boolean ativo;

    public Documento(String estado) {
        this.estado = estado;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero(){
        return this.numero;
    }
    //atributo tipo boolean o get é escrito com is ao inves de get
    public boolean isAtivo() {
        return ativo;
    }

    public static void estado(){
        System.out.println("método static");
    }

}
