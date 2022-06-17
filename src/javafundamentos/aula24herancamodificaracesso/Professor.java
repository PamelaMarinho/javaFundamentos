package javafundamentos.aula24herancamodificaracesso;

import javafundamentos.aula22herança.Pessoa;

    public class Professor extends Pessoa {

        /*public Professor() {
            super();
        }*/

        public void info(){
            System.out.println(super.getNome());
            System.out.println(this.getIdade());
        }

        public void publico(){
            System.out.println("sou um método protected");
        }

    }


