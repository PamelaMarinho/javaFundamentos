/*usado quando nao sabe a quantidade de argumentos que receberá
Deve sempre ser deixado por úlitmos nos argumentos caso tenha mais de um.
Como só recebe atributos de classes deve usar classe de tipo primitivo para fazer wrapper */

package javafundamentos.aula59varargs;

public class Varargs {
    public static void main(String[] args) {
        usandoVarargs(1,2,5,6,7,9);
    }
    private static void usandoVarargs(Integer... numbers) {
        for(Integer num : numbers){
            System.out.println(num); //1,2,5,6,7,9
        }
    }

    private static void usandoVarargsPlus(int a, int b, int c, Integer... numbers) {
        for(Integer num : numbers){
            System.out.println(num); //6,7,9
            //considera os 3 primeiros itens como argumentos separados
        }
    }
}
