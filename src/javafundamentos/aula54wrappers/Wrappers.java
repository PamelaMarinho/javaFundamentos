package javafundamentos.aula54wrappers;

public class Wrappers {
    public static void main(String[] args) {

    // tipo primitivo
    short s = 1;
    byte b = 10;
    int n = 1;
    long l = 1202l;
    float f = 3.5f;
    double d = 2.5d;
    boolean boo = true;
    char c = 'a'; /*ou número que representa essa letra*/

     // Classes Wrappers
     Short s2 = Short.valueOf("32767");
     Byte b2 = Byte.valueOf("127");
     Integer n2 = Integer.valueOf("2147483647");
     Long l2 = Long.valueOf("158");
     Float f2 = Float.valueOf("3.40282347");
     Double d2 = Double.valueOf("158");
     Boolean boo2 = Boolean.valueOf("true");
     Character c2 = Character.valueOf('f'); //precisa ser aspas simples

    short s3 = Short.parseShort("32767");
    byte b3 = Byte.parseByte("127");
    int n3 = Integer.parseInt("2147483647");
    long l3 = Long.parseLong("158");
    float f3 = Float.parseFloat("3.40282347");
    double d3 = Double.parseDouble("158");
    boolean boo3 = Boolean.parseBoolean("true");

        System.out.println( s2 == l3 ); //true (verifica igualdade dos tipos)

    }
}
