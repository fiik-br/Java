package Programmer.fiik.Ot;
//Author: Otávio Lisboa | 27/10/26 | 02:53AM
public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        int idade = 19;
        String categoria;

        if(idade < 15){
            categoria = ("Está na categoria: Infantil**");
        }else if(idade >= 15 && idade < 18){
            categoria = ("Está na categoria: Juvenil**");
        }else{
            categoria = ("Está na categoria: Adulto**");
        }
        System.out.println(categoria);
    }
}
