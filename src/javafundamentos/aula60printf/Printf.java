package javafundamentos.aula60printf;

public class Printf {
    public static void main(String[] args) {

        System.out.printf("%n"); //quebra de linha quando usar printf

        System.out.printf("%c", 'c'); //character c
        System.out.printf("%C", 'c'); //character C

        double pontoFlutuante = 3.1456789;
        System.out.printf("%f", pontoFlutuante); //3,145679
        System.out.printf("%.3f", pontoFlutuante); //3,146
        System.out.printf("R$%10.2f", pontoFlutuante); //R$      3,15
        //System.out.println("R$%,10.2f", pontoFlutuante);

        int num = 1234586;
        System.out.printf("% d", num); // 1234586 (espaço antes)
        System.out.printf("%,d", num); // 1.234.586
        System.out.printf("%+d", num);//+1234586
        System.out.printf("%015d", num);//000000001234586 (completa 15 caracteres com 0 antes)

        String string = "Hello World";
        System.out.printf("%S", string); //HELLO WORLD
        System.out.printf("%s", string); //Hello World
        System.out.printf("%20s", string);//         Hello World
        System.out.printf("%-20s", string);//Hello World         (completa 20 caracteres com espaço depois)
    }
}
