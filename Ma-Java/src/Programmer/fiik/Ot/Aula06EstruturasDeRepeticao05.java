package Programmer.fiik.Ot;
//Author: Otávio S. Lisboa | 30/10/26 | 22:57PM
public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condição valorParcela >= 1000
        double ValortotalDoCarro = 30000;
        for (int parcela = (int) ValortotalDoCarro; parcela >= 1; parcela--) {
            double ValorParcela = ValortotalDoCarro / parcela;
            if(ValorParcela < 1000){
                continue;
            }
            System.out.println("Parcela: "+parcela+" R$ "+ValorParcela);
            }
        }
    }