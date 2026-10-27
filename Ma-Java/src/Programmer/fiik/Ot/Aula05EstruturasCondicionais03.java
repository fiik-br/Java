package Programmer.fiik.Ot;
//Author: Otávio Lisboa | 27/10/26 | 03:10AM
public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = "Eu vou doar R$500";
        String mensagemNaoDoar = "Ainda não tenho como doar.";
        String resultado = salario > 5000 ? "Eu vou doar R$500 : " : "Ainda não tenho condições";
        System.out.println(resultado);
    }
}
