/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.grafos.view;

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
        TitleScreen game = new TitleScreen();
        game.setVisible(true);
    }
    
    
    public static Graph generateGraph(int line, int cols){
        Graph graph = new Graph();
        int length = line * cols;
        for(int currentIndex = 0; currentIndex < length; currentIndex++){
            
            
        }
        return null;
    }
}
