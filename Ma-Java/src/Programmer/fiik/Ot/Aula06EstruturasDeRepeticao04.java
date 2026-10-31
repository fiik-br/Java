package Programmer.fiik.Ot;
//Author: Otávio S. Lisboa | 29/10/26 | 13:18PM
public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condição valorParcela >= 1000
        double ValortotalDoCarro = 40000;
        for (int parcela = 1; parcela <= ValortotalDoCarro; parcela++) {
            double ValorParcela = ValortotalDoCarro / parcela;
            if( ValorParcela < 1000){
                break;
            }
                System.out.println("Parcela: "+parcela+" R$ "+ValorParcela);
            }
        }
    }