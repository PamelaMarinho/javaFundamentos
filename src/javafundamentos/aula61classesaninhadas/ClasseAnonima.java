/*CLASSE ANONIMA: altera o comportamento durante a instanciação*/

package javafundamentos.aula61classesaninhadas;

public class ClasseAnonima {
    public void imprimeTexto(){
        System.out.println("qq texto");
    }

    public static void main(String[] args) {

        ClasseAnonima anonima = new ClasseAnonima(){
            @Override
            public void imprimeTexto() {
                super.imprimeTexto();
                System.out.println("alterei o texto");
            }
        };

        anonima.imprimeTexto();
    }

}
