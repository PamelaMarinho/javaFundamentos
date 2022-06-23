package javafundamentos.aula56static_Import;

import static java.lang.Math.pow;
import static  java.lang.Math.sqrt;
//import java.lang.Math.* tmb pode ser usado para importar todos os métodos porém não é elegante

public class staticImport {
    public static void main(String[] args) {
        double a = 2;
        double b = 3;
        double c = 4;

        System.out.println(pow(2,3));
        System.out.println(sqrt(4));
    }
}

/*quando um método é usado com frequência pode importar de formar static e usar sem chamar a classe.*/