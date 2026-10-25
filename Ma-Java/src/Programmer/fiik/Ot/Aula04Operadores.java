package Programmer.fiik.Ot;
//Author: Otávio Lisboa | 25/10/26 | 03:025AM
public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        double numero02 = 20;
        double resultado = numero01 / numero02;
        System.out.println("O valor da conta é: "+resultado);

        // %
        int resto = 20 % 2;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("10 é maior que 20? "+isDezMaiorQueVinte);
        System.out.println("10 é menor que 20? "+isDezMenorQueVinte);
        System.out.println("10 é igual a 20? "+isDezIgualVinte);
        System.out.println("10 é igual a 10? "+isDezIgualDez);
        System.out.println("10 é diferente de 10? "+isDezDiferenteDez);
    }
}
