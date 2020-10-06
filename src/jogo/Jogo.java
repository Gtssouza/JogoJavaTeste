package jogo;

import javax.swing.JOptionPane;

import jplay.GameImage;
import jplay.Keyboard;
import jplay.URL;
import jplay.Window;

public class Jogo {
    public static void main(String[] args) {
        Window janela = new Window(720, 480);
        GameImage plano = new GameImage(URL.sprite("MenuIniciar.png"));
        Keyboard teclado = janela.getKeyboard();

        while(true){
            plano.draw();
            janela.update();
            if(teclado.keyDown(Keyboard.ENTER_KEY)){
                JOptionPane.showMessageDialog(null, "Funcionando o ENTER");
            }
        }
    }
}
