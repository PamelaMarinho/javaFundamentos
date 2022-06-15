package javafundamentos;

public class Aula12LoopFor {
    public static void main(String[] args) {

        for(int i = 1; i < 5 ; i++){
            System.out.println(i);
        }

        //for com duas variáveis
        for(int i = 1, j = 10; i < j; i++, j--){
            System.out.println("i = " + i +" ; j =" + j);
        }

        //declaração fora
        int i = 0;
        for(; i < 5; i++){
            System.out.println(i);
        }

        int soma = 0;
        for( int b = 1; i < 5; soma += i++) {
            System.out.println(soma);
        }

        //sem chaves. usado apenas quando tiver uma linha após a regra
        for( int d = 1; i < 5; soma += i++)
                System.out.println(soma);

    }
}
