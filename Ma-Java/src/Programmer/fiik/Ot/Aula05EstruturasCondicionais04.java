package Programmer.fiik.Ot;
//Author: Otávio Lisboa | 27/10/26 | 12:22PM
public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        //• Faixa 1 (Até € 34.712): 37,35% (composta pelos 9,70% de imposto puro + 27,65% de taxas sociais descritas na tabela acima).
        //• Faixa 2 (€ 34.713 a € 68.507): 37,35% (aqui as taxas sociais já zeravam por teto de contribuição, tornando-se 37,35% de imposto de renda puro).
        //• Faixa 3 (Acima de € 68.507): 49,50% (imposto de renda puro na alíquota máxima).
        double salarioAnual = 75000;
        double taxa = 0;
        if(salarioAnual <= 34712){
            taxa = taxa + 9.70;
            double valorComTaxa = salarioAnual * (taxa / 100.0);
            System.out.println("Como o(a) senhor(a) recebe um salário de "+salarioAnual+" vai ser contabilizado a taxa anual de "+taxa+"% que fica um total de: €"+valorComTaxa);
        }else if(salarioAnual >= 34713 && salarioAnual < 68507){
            taxa = taxa + 37.35;
            double valorComTaxa = salarioAnual * (taxa / 100.0);
            System.out.println("Como o(a) senhor(a) recebe um salário de "+salarioAnual+" vai ser contabilizado a taxa anual de "+taxa+"% que fica um total de: €"+valorComTaxa);
        }else{
            taxa = taxa + 49.50;
            double valorComTaxa = salarioAnual * (taxa / 100.0);
            System.out.println("COmo o(a) senhor(a) recebe um salário de "+salarioAnual+" vai ser contabilizado a taxa anual de "+taxa+"% que fica um total de: €"+valorComTaxa);
        }
    }
}
