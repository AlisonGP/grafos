/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.grafos.service;

import br.ufrn.grafos.entity.Edge;
import br.ufrn.grafos.entity.Graph;
import br.ufrn.grafos.entity.Vertice;
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
        initSubgraphs(graph);
        try{
            for(Edge edge : edges){
                Graph graph1 = getGraph(edge.getOrigin());
                Graph graph2 = getGraph(edge.getDestiny());
                if(!graph1.equals(graph2)){
                    unionGraph(graph1, graph2);
                    graph1.addEdge(edge);
                }
            }
        }catch(NullPointerException ex){
            System.out.println("A lista de subgrafos não foi inicializada corretamente.");
            ex.printStackTrace();
        }
        //Só pra testar.
        if(subgraphs.size() > 0){
            System.out.println("Maior que zero: "+subgraphs.size());
        }
    }
    
    private Graph getGraph(Vertice vertice){
        for(Graph graph: subgraphs){
            if(graph.getVertices().contains(vertice))
                return graph;
        }
        return null;
    }
    
    private void unionGraph(Graph graph1, Graph graph2){
        for(Edge edge : graph2.getEdges()){
            graph1.addEdge(edge);
        }
        subgraphs.remove(graph2);
    }
    
    private void initSubgraphs(Graph graph){
        for(Vertice vertice : graph.getVertices()){
            subgraphs.add(new Graph(vertice));
        }
    }
}
