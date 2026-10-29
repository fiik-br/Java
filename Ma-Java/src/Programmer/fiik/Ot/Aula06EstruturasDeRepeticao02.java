package Programmer.fiik.Ot;
//Author: Otávio Lisboa | 28/10/26 | 23:35PM
public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // imprima todos os números pares de 0 ate 100000
        int conta = 0;
        while(conta < 100000){
            conta += 1;
            if(conta % 2 == 0){
                System.out.println(conta);
            }
        }
    }
}
