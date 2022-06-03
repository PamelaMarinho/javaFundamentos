package JavaFundamentos.Interator;

public class ArrayWhile {
    public static void main(String[] args) {
        int[] vetor = {0,1,2,3,4};

        int count = 0;
        while(count < (vetor.length)){
            System.out.print(vetor[count]);
            count++;
        }
        System.out.println("\nVetor invertido");
        for(int i = (vetor.length-1); i >= 0; i--){
            System.out.print(vetor[i]);
        }
    }
}