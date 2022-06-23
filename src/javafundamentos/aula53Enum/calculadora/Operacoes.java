package javafundamentos.aula53Enum.calculadora;

public enum Operacoes {
    SOMA("+"){
        @Override
        public double executarOperacao(double d1, double d2) {
            return d1 + d2;
        }
    }, DIV("/"){
        @Override
        public double executarOperacao(double d1, double d2) {
            return d1 / d2;
        }
    }, MULT("*") {
        @Override
        public double executarOperacao(double d1, double d2) {
            return d1 * d2;
        }
    }, SUB("-") {
        @Override
        public double executarOperacao(double d1, double d2) {
            return d1 -d2;
        }
    };
    private String simbolo;
    Operacoes(String simbolo){
        this.simbolo = simbolo;
    }

    public abstract double executarOperacao(double d1, double d2);

    public String toString(){
        return this.simbolo;
    }

}

/*
enum = conjunto de objetos de mesma assinatura.
enum é um conjunto de classes que herdam operacoes.
o java implicitamente cria uma classe anonima para as operações(soma, div, sub, mult) que implementam Operacoes
como o método é abstract é preciso sobrescrever dentro das operações(afinal são classes que extendem outra classe com
método abstract).


 */