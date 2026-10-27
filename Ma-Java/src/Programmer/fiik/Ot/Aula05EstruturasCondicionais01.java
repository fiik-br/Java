package Programmer.fiik.Ot;
//Author: Otávio Lisboa | 27/10/26 | 02:30AM
public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !

        if(isAutorizadoComprarBebida){
            System.out.println("Permitido a comprar bebida alcólica");
        }else{
            System.out.println("Não pode comprar bebida alcólica");
        }

        if(!isAutorizadoComprarBebida){
            System.out.println("Não pode comprar bebida alcólica");
        }
        boolean c = false;
        if(c == true){
            System.out.println("Dentro de algo que nunca deve ser feito");
        }

        System.out.println("Fora do if");
    }
}
