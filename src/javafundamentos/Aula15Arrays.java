package javafundamentos;

public class Aula15Arrays {
    public static void main(String[] args) {

        double[] temp = new double[5];

        temp[0] = 33.1;
        temp[1] = 32.0;
        temp[3] = 30.0;
        temp[4] = 22.0;

        //usar para input e output
        for(int i = 0; i < temp.length; i++){
            System.out.println("dia "+ (i+1) + " temperatura " + temp[i]);
        }

        //o for abaixo não aceita input quando é de tipo primitivo.  usar para output
        for(double temperatura : temp){
            System.out.println(temperatura);
        }
    }
}
