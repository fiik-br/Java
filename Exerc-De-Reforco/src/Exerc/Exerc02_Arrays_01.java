package Exerc;
//Author: Otávio S. Lisboa | 03/11/26 | 15:42PM
public class Exerc02_Arrays_01 {
    public static void main(String[] args) {
        int QuantosNumMaioresQue20 = 0;
        float SomaDosValores = 0;
        float MediaDosValores = 0;
        int[] numeros = {5, 10, 15, 20, 25, 30, 35, 40};
        for (int num : numeros) {
            System.out.println(num);
            if(num > 20){
                QuantosNumMaioresQue20 = QuantosNumMaioresQue20 + 1;
            }
            SomaDosValores = SomaDosValores + num;
            MediaDosValores = SomaDosValores / 8;
        }
        System.out.println("Quantidade de números maiores que 20: "+QuantosNumMaioresQue20);
        System.out.println("A soma dos valores é: "+ SomaDosValores);
        System.out.println("A média dos números: "+MediaDosValores);

    }
}
