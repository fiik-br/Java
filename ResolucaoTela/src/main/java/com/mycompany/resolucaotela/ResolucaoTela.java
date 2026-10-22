package com.mycompany.resolucaotela;

/**
 *
 * @author kiri
 */
import java.awt.Toolkit;
import java.awt.Dimension;

public class ResolucaoTela {

    public static void main(String[] args) {
    Toolkit kit = Toolkit.getDefaultToolkit();
    Dimension dimensao = kit.getScreenSize();
    int largura = dimensao.width;
    int altura = dimensao.height;
    
        System.out.println("A resolução da tela é " + largura + "x"+ altura);
    }
}
