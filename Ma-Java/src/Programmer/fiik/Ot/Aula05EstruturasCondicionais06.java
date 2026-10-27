package Programmer.fiik.Ot;
//Author: Otávio Lisboa | 27/10/26 | 13:16PM
public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Utilizando Switch e dado os valores de 1 a 7, imprima se é dia util ou final de semana
        // Considerando 1 como domingo
        byte dia = 1;
        switch (dia){
            case 1:
                System.out.println("Domingo é um dia de final de semana");
                break;
            case 2:
                System.out.println("Segunda é um dia util da semana");
                break;
            case 3:
                System.out.println("Terça é um dia util da semana");
                break;
            case 4:
                System.out.println("Quarta é um dia util da semana");
                break;
            case 5:
                System.out.println("Quinta é um dia util da semana");
                break;
            case 6:
                System.out.println("Sexta é um dia util da semana");
                break;
            case 7:
                System.out.println("Sabado é dia de final de semana");
                break;
            default:
                System.out.println("Opção inválida");
        }

            //forma limpa:
        byte day = 1;
        switch (day){
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }

    }
}
