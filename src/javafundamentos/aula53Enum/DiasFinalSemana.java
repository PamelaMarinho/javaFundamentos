package javafundamentos.aula53Enum;

public class DiasFinalSemana {
    public static void main(String[] args) {
        usandoConstante();
        usandoEnum();
    }

    private static void usandoConstante(){
        int sabado = FinalSemana.SABADO;
        int domingo = FinalSemana.DOMINGO;

        System.out.println("usando Constantes");
        imprimeDias(sabado);
        imprimeDias(domingo);
    }

    private static void imprimeDias(int dia){
        switch (dia){
            case 7:
                System.out.println("Dia: Sabado");
                break;
            case 1:
                System.out.println("Dia: Segunda");
                break;
            default:
                System.out.println("Número incorreto");
        }
    }

    private static void imprimeDiasEnum(SemanaEnum dia){
        switch (dia){
            case SABADO:
                System.out.println("Dia: SABADO");
                break;
            case DOMINGO:
                System.out.println("Dia: DOMINGO");
                break;
            default:
                System.out.println("Número incorreto");
        }
    }

    private static void usandoEnum(){

        SemanaEnum SABADO = SemanaEnum.SABADO;
        SemanaEnum DOMINGO = SemanaEnum.DOMINGO;

        System.out.println("Usando ENUM");
        imprimeDiasEnum(SABADO);
        imprimeDiasEnum(DOMINGO);
    }
}
