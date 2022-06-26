/*CLASSE INTERNA*/
package javafundamentos.aula61classesaninhadas;

public class Externa {
        private String texto = "externa";
        public class Interna{
            private String texto = "interna";
            public void imprimi(){
                System.out.println(texto);
                System.out.println(Externa.this.texto);
            }
        }

    public static void main(String[] args) {
        Externa externa = new Externa();
        Interna interna = externa.new Interna();

        interna.imprimi();
    }
}
