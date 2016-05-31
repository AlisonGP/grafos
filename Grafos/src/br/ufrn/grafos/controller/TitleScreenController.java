package br.ufrn.grafos.controller;

import br.ufrn.grafos.view.TitleScreen;
import javax.swing.JFrame;

public class TitleScreenController {
    
    TitleScreen titleScreen;
    GameScreenController gameScreenController;
    
    public TitleScreenController(){
        gameScreenController = new GameScreenController();
        titleScreen = new TitleScreen();
        titleScreen.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    public void show(){
        titleScreen.setVisible(true);
    }
    
    public void startGrameScreen(int rows, int colunms){
        gameScreenController.show();
    }
}
