package javafundamentos.aula64thread;

public class Thread extends java.lang.Thread {

    public String nome;
    public int tempo;

    public Thread(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        start();
    }

    public void run() {
        try {
            for (int i = 0; i <= 3; i++) {
                System.out.println(nome + " contador " + i);
                Thread.sleep(tempo);
            }
            System.out.println("Finalizada thread "+nome);
            } catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }

