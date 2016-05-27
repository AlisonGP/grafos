/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.grafos.service;

import br.ufrn.grafos.entity.Edge;
import br.ufrn.grafos.entity.Graph;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author aliso
 */
public class LabyrinthGenerator {
    List<Graph> subgraphs = new ArrayList<Graph>();
    
    public void generate(Graph graph){
        ArrayList<Edge> edges = (ArrayList) graph.getEdges();
        Collections.shuffle(edges);
        for(Edge edge : edges){
            
        }
    }
    
}
