package javafundamentos.aula100teste;

public class TesteClasse {

    public static void main(String[] args) {
        Classe classe = new Classe();

        /*sem instancia -  somente chamar os static */
        System.out.println(Classe.statico());
        System.out.println(Classe.statico);
        //System.out.println(Classe.naoStatic()); error
        //System.out.println(Classe.noStatic); error

        /* pela instância - é possível chamar tanto static como nao static */
        System.out.println(classe.naoStatic());
        System.out.println(classe.noStatic);
        System.out.println(classe.statico());
        System.out.println(classe.statico);

        /* ******************* instância recebe uma cópia dos atributos static da classe ******************  */

        /* As alterações nos atributos não static da instância são vistos apenas na instancia*/
        classe.noStatic = "essa alteração apenas me afetará";
        System.out.println(Classe.statico);

        /* Qualquer alteração feita nos atributos statics das instâncias será refletido na classe.*/
        classe.statico = "essa alteração afetará a Classe mãe, meu atributo e as novas instâncias";
        System.out.println(Classe.statico);

        /* todas as novas instancias serao afetadas pela mudança dos atributos static*/
        Classe novaInstancia = new Classe();
        System.out.println(novaInstancia.statico);

        /* *************** Static Class **********************  */
        //classes aninhadas que sao declaradas static sao  sao chamadas de classes static aninhada
        //classes aninhadas nao static são chamadas classes internas.

        /* *************************************  */
        //método static não pode usar this ou super
        //Abstract métodos não podem ser static
        //métodos static não podem ser sobrescritos
        //método static não pode acessar variável de instância e método de instância, eles precisam de uma referência do obj.

    }
}
