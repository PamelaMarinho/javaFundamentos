package javafundamentos.aula17classe;

public class Carro {

        String marca;
        String cor;
        int ano;
        int consumoCombustível = 5;

        //método sem retorno
        void exibirMarca(){
                System.out.println("Marca: " + marca);
        }

        //método com retorno
        int exibirAno(){
                return ano;
        }

        //método com parâmetro
        double consumoCombustível(int kmRodados){
                return (kmRodados * consumoCombustível);
        }

        public static void estado(){
                System.out.println("método static");
        }

}
