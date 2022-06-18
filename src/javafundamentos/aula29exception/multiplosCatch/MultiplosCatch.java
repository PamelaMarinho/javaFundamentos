package javafundamentos.aula29exception.multiplosCatch;

public class MultiplosCatch {
    public static void main(String[] args) {
        int[] vet = {2,4,0,8};

        for(int i = 0; i < vet.length; i ++){
            try{
                System.out.println(vet[i]*i);
                vet[i+1]=i+8;
            }catch (ArithmeticException e){
                System.out.println(e);
            }catch (ArrayIndexOutOfBoundsException e1){
                System.out.println(e1);
            }catch (Throwable e2){
                System.out.println("sou um erro generico"+e2);
            }
        }
    }
}

/* throwable é a classe mãe de todos os erros*/