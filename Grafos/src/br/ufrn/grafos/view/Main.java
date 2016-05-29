/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.grafos.view;

import br.ufrn.grafos.controller.TitleScreenController;

/**
 *
 * @author Alison
 */
public class Main {
    
    private final TitleScreenController titleScreenController = new TitleScreenController();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }
    
    public void start(){
        titleScreenController.show();
    }
   
}
