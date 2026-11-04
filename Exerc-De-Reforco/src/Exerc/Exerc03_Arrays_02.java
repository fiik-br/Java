package Exerc;
//Author: Otávio S. Lisboa | 04/11/26 | 16:01PM
public class Exerc03_Arrays_02 {
    public static void main(String[] args) {
        int MaiorQue18 = 0;
        int MenorQue18 = 0;
        int somaMaiorQue18 = 0;
        int[] idades = {12, 18, 25, 15, 30, 17, 22, 14};
        for(int age : idades) {
            System.out.println(age);
            if (age >= 18) {
                MaiorQue18 = MaiorQue18 + 1;
            }
            if (age < 18){
                MenorQue18 = MenorQue18 + 1;
            }
            if (age >= 18){
                somaMaiorQue18 = somaMaiorQue18 + age;
            }
        }
        System.out.println("Pessoas maiores ou iguais a 18: "+MaiorQue18);
        System.out.println("Pessoas menores de 18: "+MenorQue18);
        System.out.println("Soma das pessoas maiores ou iguais a 18: "+somaMaiorQue18);
    }
}
