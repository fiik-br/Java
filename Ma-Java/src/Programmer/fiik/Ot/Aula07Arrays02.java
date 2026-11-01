package Programmer.fiik.Ot;
//Author: Otávio S. Lisboa | 01/11/26 | 18:38PM
public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double 0
        // char '\u0000' ' '
        // boolean false
        // String null
        
        String[] nomes = new String[4];
        nomes[0] = "Lucas";
        nomes[1] = "Gustav";
        nomes[2] = "Laura";
        nomes[3] = "Louise";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
}
