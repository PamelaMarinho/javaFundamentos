package javafundamentos.aula23herançasuperclasse;

public class TesteProfessor {
    public static void main(String[] args) {

        Professor prof = new Professor();
        prof.setNome("Luisa");
        prof.setIdade(30);

        prof.info();
    }
}
