package javafundamentos.aula24herancamodificaracesso;

import javafundamentos.aula21exercicios.Aluno;
import javafundamentos.aula23herançasuperclasse.TestePublic;

public class TesteProfessor {

    public static void main(String[] args) {

        Professor prof = new Professor();
        prof.setNome("Luisa"); //protected Pessoa (mesmo pacote)
        prof.setIdade(30); //defaul Pessoa (mesmo pacote)
        prof.publico(); //public Professor
        TestePublic.publico(); //public static (outro pacote - aula23)
        //privado não pode ser usado em um contexto static

    }


}
