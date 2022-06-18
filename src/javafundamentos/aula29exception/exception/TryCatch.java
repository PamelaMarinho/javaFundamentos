package javafundamentos.aula29exception.exception;

public class TryCatch {
    public static void main(String[] args) {

       try{
           int[] vet = new int[5];
           vet[4] = 5;
       }catch(ArrayIndexOutOfBoundsException e){
           System.out.println(e);
       }

    }
}
