/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.grafos.controller;
import br.ufrn.grafos.view.TitleScreen;
import br.ufrn.grafos.view.GameScreen;
import javax.swing.JFrame;
/**
 *
 * @author aliso
 */
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
