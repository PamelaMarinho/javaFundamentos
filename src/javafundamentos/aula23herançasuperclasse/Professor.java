package javafundamentos.aula23herançasuperclasse;

import javafundamentos.aula22herança.Pessoa;

    public class Professor extends Pessoa {

        /*public Professor() {
            super();
        }*/

        public void info(){
            System.out.println(super.getNome());
            System.out.println(this.getIdade());
        }

    }


