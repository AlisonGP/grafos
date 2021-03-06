package br.ufrn.grafos.service;

import br.ufrn.grafos.entity.Edge;
import br.ufrn.grafos.entity.Graph;
import br.ufrn.grafos.entity.Vertice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LabyrinthGeneratorService {
    public List<Graph> subgraphs = new ArrayList<Graph>();

    public LabyrinthGeneratorService() {
    }
    
    public void generate(Graph graph){
        ArrayList<Edge> edges = (ArrayList) graph.getEdges();
        Collections.shuffle(edges);
        initSubgraphs(graph);
        try{
            int i=0;
            for(Edge edge : edges){
                Graph graph1 = getGraph(edge.getOrigin());
                Graph graph2 = getGraph(edge.getDestiny());
                if(!graph1.equals(graph2)){
                    unionGraph(graph1, graph2);
                    graph1.addEdge(edge);
                    remove(graph2);
                }
            }
            System.out.println(i + " Arestas");
        }catch(NullPointerException ex){
            System.out.println("A lista de subgrafos não foi inicializada corretamente.");
            ex.printStackTrace();
        }
    }
    
    private Graph getGraph(Vertice vertice){
        for(Graph graph: subgraphs){
            if(graph.contains(vertice))
                return graph;
        }
        return null;
    }
    
    private void unionGraph(Graph graph1, Graph graph2){
        for(Edge edge : graph2.getEdges()){
            graph1.addEdge(edge);
        }
    }
    
    private void initSubgraphs(Graph graph){
        for(Vertice vertice : graph.getVertices()){
            subgraphs.add(new Graph(vertice));
        }
    }
    
    public void remove(Graph graph){
        for(int currentIndex = 0; currentIndex < subgraphs.size(); currentIndex++){
            if(subgraphs.get(currentIndex).equals(graph))
                subgraphs.remove(currentIndex);
        }
    }
    
    public Graph caminhoFinal(){
        return subgraphs.get(0);
    }
}
