package Exerc;
//Author: Otávio S. Lisboa | 04/11/26 | 16:40PM
import java.util.Arrays;

public class Exerc04_Arrays_03 {
    public static void main(String[] args) {
        int alunosAprovados = 0;
        int alunosReprovados = 0;
        float MediaDaTurma = 0;
        int MaiorNota = 0;
        int[] notas = {7, 4, 10, 6, 3, 9, 5, 8};
        for(float nota : notas){
            System.out.println(nota);
            if (nota >= 6){
                alunosAprovados = alunosAprovados + 1;
            }else{
                alunosReprovados = alunosReprovados + 1;
            }
            MediaDaTurma = MediaDaTurma + nota / 8;
            Arrays.sort(notas);
            MaiorNota = notas[notas.length - 1];
        }
        System.out.println("Alunos Aprovados: "+alunosAprovados);
        System.out.println("Alunos Reprovados: "+alunosReprovados);
        System.out.println("Média da turma: "+MediaDaTurma);
        System.out.println("Maior nota: "+MaiorNota);
    }
}
