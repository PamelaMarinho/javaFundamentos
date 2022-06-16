package javafundamentos.aula20relacionamentoclasses;

public class Teste {
    public static void main(String[] args) {
        Contato cont = new Contato();

        cont.nome = "Bia";
        cont.telefone = "9999999";

        Endereco end = new Endereco();
        end.setBairro("limão");
        end.setCidade("SP");
        end.setEstado("SP");
        end.setRua("Mario");

        cont.setEndereco(end);

        System.out.println(cont.getNome());
        System.out.println(cont.getTelefone());
        if(cont.getEndereco() != null){
            System.out.println(cont.getEndereco().getEstado());
        }

    }
}
