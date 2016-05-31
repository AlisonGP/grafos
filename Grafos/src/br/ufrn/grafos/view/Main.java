package br.ufrn.grafos.view;

import br.ufrn.grafos.controller.TitleScreenController;

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
