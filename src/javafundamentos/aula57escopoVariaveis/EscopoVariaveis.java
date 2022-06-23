package javafundamentos.aula57escopoVariaveis;

public class EscopoVariaveis {
    private int valor;

    public int getValor(){
        return this.valor;
    }

    public void setValor(int valor){
        this.valor = valor;
    }

    public int calculaValor(int valor){
        valor = valor + 10;
        return valor;
        //valor é variavel local pois não usa o this para referenciar a variavel da classe
    }

    public int teste(){
        int valor = 5;

        if(true){
            valor--;
        }
        return valor;
    }

}
