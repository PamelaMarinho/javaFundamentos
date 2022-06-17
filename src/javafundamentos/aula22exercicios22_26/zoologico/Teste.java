package javafundamentos.aula22exercicios22_26.zoologico;

public class Teste {
    public static void main(String[] args) {

        Animal camelo = new Animal();
        camelo.setNome("camelo");
        camelo.setComprimento(150);
        camelo.setVelocidade(2);
        camelo.setCor("Amarelo");

        Peixe tubarao = new Peixe();
        tubarao.setComprimento(300);
        tubarao.setNome("tubarão");
        tubarao.setVelocidade(1.5);

        Mamifero urso = new Mamifero();
        urso.setComprimento(180);
        urso.setNome("urso");
        urso.setVelocidade(0.5);

        Animal[] animais = new Animal[3];
        animais[0] = camelo;
        animais[1] = tubarao;
        animais[2] = urso;

        for(Animal animal : animais){
            System.out.println(animal);
        }
    }

}
