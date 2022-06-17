package javafundamentos.aula26herancaClasseAbstrata;

public abstract class Animal {
    public abstract void barulho();

    // CLASSE ABSTRACT
   // Não pode ser instânciada
   // Pode possuir metodos e atributos que serão acessíveis nas subclasses se não private.
   // A subclasse que extende-la deve subscrever seus métodos.
}
