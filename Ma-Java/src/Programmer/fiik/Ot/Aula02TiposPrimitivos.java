package Programmer.fiik.Ot;
//Author: Otávio Lisboa | 25/10/26 | 02:24AM
public class Aula02TiposPrimitivos {
    static void main() {
        //  int, double, float, char, byte, short, long, boolean
        int idadeInt = (int) 10000000000L;
        long numeroGrande = (long) 155.23;
        double salarioDouble = 2000.0D;
        float salarioFloat = (float) 2500.0D;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';

        System.out.println("a idade é "+idadeInt+" anos");
        System.out.println(falso);
        System.out.println("char "+caractere);
        System.out.println(salarioFloat);
        System.out.println(numeroGrande);
    }
}
