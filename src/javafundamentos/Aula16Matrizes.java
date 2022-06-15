package javafundamentos;

public class Aula16Matrizes {
    public static void main(String[] args) {
        //array multidimensionais ou matrizes
        int[][] nota = {{5,8},{9,1}};
        nota[1][0] = 6;

        for(int i = 0; i < nota.length; i++){
            for(int j = 0; j < nota.length; j++){
                System.out.println(nota[i][j]);
            }
        }

        int[][] notas = new int[2][2];

        notas[0][0] = 5;
        notas[0][1] = 8;

        notas[1][0] = 9;
        notas[1][1] = 1;

         double media;
        for( int i = 0; i < notas.length; i++){

            media = 0;
             for(int j = 0; j < notas[i].length; j++){
                System.out.println("nota " + notas[i][j]);
                media += notas[i][j];
            }
            System.out.println("média " + (media/2));
            System.out.println();
        }

    /* matrix de 3 dimensões */
    int[][][] volume = new int[2][2][2];

        for( int i = 0; i < volume.length; i++){
            for(int j = 0; j < volume[i].length; j++){
                for(int k = 0; k < volume[i][j].length; k++){
                    System.out.println( volume[i][j][k] );
                }
            }
            System.out.println();
        }
    }
}
