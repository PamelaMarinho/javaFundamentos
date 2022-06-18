package javafundamentos.aula29exception.stackTrace_throws;

public class exception {
    public static void main(String[] args) {
        int[] vet = {2,4,0,8};

        for(int i = 0; i < vet.length; i ++){
            try{
                int a = vet[i+1]/i;
            }catch (Exception e2){
                System.out.println(e2.getMessage());
                e2.printStackTrace();
            }
        }
    }
}

//getMessage e Stacktrace são metodos da super classe throwable

