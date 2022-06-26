/*CLASSE LOCAL*/
package javafundamentos.aula61classesaninhadas;

public class Externa2 {
    public void metodoQualquer(){
        class Classelocal{
            private String texto = "texto classe local";
            public void imprimiTexto(){
                System.out.println(texto);
            }
        }
        Classelocal local = new Classelocal();
        local.imprimiTexto();
    }

    public static void main(String[] args) {

        Externa2 externa = new Externa2();
        externa.metodoQualquer();
    }
}


