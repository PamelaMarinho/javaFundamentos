package javafundamentos.aula17classe;

public class TesteCarro {
    public static void main(String[] args) {
        Carro car = new Carro();

        car.ano = 1994;
        car.cor = "prata";
        car.marca = "Honda";

        car.exibirMarca();
        System.out.println("ano: " + car.exibirAno());

        double total = car.consumoCombust√≠vel(56);
        System.out.println("Km rodados: " + total);


    }
}
