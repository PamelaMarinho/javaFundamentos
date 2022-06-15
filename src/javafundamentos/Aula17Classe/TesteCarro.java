package javafundamentos.Aula17Classe;

public class TesteCarro {
    public static void main(String[] args) {
        Carro car = new Carro();

        car.ano = 1994;
        car.cor = "prata";
        car.marca = "Honda";

        car.exibirMarca();
        System.out.println("ano: " + car.exibirAno());

        double total = car.consumoCombustível(56);
        System.out.println("Km rodados: " + total);
    }
}
