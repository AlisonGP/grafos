/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.grafos.view;

import br.ufrn.grafos.controller.GameScreenController;
import br.ufrn.grafos.entity.Edge;
import br.ufrn.grafos.entity.Graph;
import br.ufrn.grafos.entity.Vertice;
import java.util.ArrayList;

/**
 *
 * @author Alison
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TitleScreen game = new TitleScreen();
        //game.setVisible(true);
        GameScreenController gameScreenController = new GameScreenController();
        Graph graph = gameScreenController.generateGraph(3, 3);
        gameScreenController.generateLabyrinth(graph);
    }    
   
}
