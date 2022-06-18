package javafundamentos.aula29exception.criandoException;

public class CriandoException {
    public static void main(String[] args) {

            int[] vet = { 2,6,5,8,9,7,6};
            int[] index = {2,4,0,8};

            for(int i = 0; i < vet.length; i ++){
                try{
                    if( vet[i] % 2 != 0 ){
                        throw new Divisivel(vet[i], index[i]);
                    }
                    double result = vet[i] / index[i];
                    vet[i+1]=i+8;
                }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
                    System.out.println(e);
                }catch (Throwable e2){
                    System.out.println(e2);
                }
        }
    }
}


// criar uma classe que extends exception e criar a própria exception