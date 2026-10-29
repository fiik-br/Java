package Exerc;
//Author: Otávio Lisboa | 29/10/26 | 13:42PM
public class Exerc01 {
    public static void main(String[] args) {
        double ValorMoto = 12000;
        for (int parcelas = 1; parcelas <= ValorMoto ; parcelas++) {
            double valorParcela = ValorMoto / parcelas;
            if(valorParcela < 500){
                break;
            }
            System.out.printf("Parcela: %d | R$ %.2f%n", parcelas, valorParcela);
        }
    }
}
