package javafundamentos.aula29exception.finally_;

public class Finally {
    public static void main(String[] args) {
        int[] vet = {2,4,0,8};

            try{
                for(int i = 0; i < vet.length; i ++) {
                    System.out.println(vet[i] * i);
                    vet[i + 1] = i + 8;
                }
            }catch (ArithmeticException e){
                System.out.println(e);
            }catch (ArrayIndexOutOfBoundsException e1){
                System.out.println(e1);
                System.exit(1);
            }catch (Throwable e2){
                System.out.println("sou um erro generico"+e2);
                System.exit(1);
            }finally {
                System.out.println("Após o erro.. finally");
            }
    }
}

//System.exit() sai do programa terminando a execução da VM. status 0: foi terminado de forma anormal status 1: terminado de forma anormal
//finally é executado sempre após catch ou try(quando nao tem exit)