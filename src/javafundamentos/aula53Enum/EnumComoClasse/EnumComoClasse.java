package javafundamentos.aula53Enum.EnumComoClasse;

public enum EnumComoClasse {
    SABADO(1), DOMINGO(2);

    private int valor;

    EnumComoClasse(int valor){
        this.valor = valor;
    }

    public int getValor(){
        return this.valor;
    }
}


/*
Enums extends classe java.lang.Enum
enum como classe precisa ter construtor, atributos
construtor não precisa de modificador de acesso
pode implementar interface
atributos precisam ser privates
SABADO(1), DOMINGO(2) são construtores com número.
não pode ser instanciado com new
pode ser comparado usando == (diferente das classes que precisam ser comparadas com equal)
pode ser declarado separadamente ou dentro da classe
pode declarar um enumerador dentro de uma classe
 */