package javafundamentos.aula29exception.multiplosCatch;

public class MultiplosCatchOutro {
    public static void main(String[] args) {
        int[] vet = {2,4,0,8};

        for(int i = 0; i < vet.length; i ++){
            try{
                System.out.println(vet[i]*i);
                vet[i+1]=i+8;
            //esse formato é usado a partir do java 7
            }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        }
    }
}

/* throwable é a classe mãe de todos os erros*/