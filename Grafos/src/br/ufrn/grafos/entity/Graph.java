/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.grafos.entity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alison
 */
public class Graph {
    private List<Vertice> vertices;
    private List<Edge> edges;

    public Graph() {
        vertices = new ArrayList<>();
        edges = new ArrayList<>();
    }
    
    public Graph(List<Vertice> vertices, List<Edge> edges) {
        this.vertices = vertices;
        this.edges = edges;
    }
    
    public Graph(Vertice vertice) {
        vertices = new ArrayList<>();
        edges = new ArrayList<>();
        addVertice(vertice);
    }
    
    public Graph(Edge edge) {
        vertices = new ArrayList<>();
        edges = new ArrayList<>();
        addEdge(edge);
    }
    
    public List<Vertice> getVertices() {
        return vertices;
    }

    public void setVertices(List<Vertice> vertices) {
        this.vertices = vertices;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }
    
    public void addEdge(Edge edge){
        boolean control = false;
        for(Edge e : edges){
            if(e.equals(edge))
                control = true;
        }
        if(!control){
            addVertice(edge.getOrigin());
            addVertice(edge.getDestiny());
            edges.add(edge);
        }
    }
    
    public void addVertice(Vertice vertice){
        boolean control = false;
        for(Vertice v : vertices){
            if(v.equals(vertice))
                control = true;
        }
        if(!control)
            vertices.add(vertice);
    }
    
    public boolean equals(Graph graph){
        
        if(this.isEmpty() && graph.isEmpty())
            return true;
        
        if(this.edges.isEmpty() && graph.edges.isEmpty()){
            if(this.nunberOfVertices() == graph.nunberOfVertices()){
                for(Vertice currentVertice : this.vertices){
                    if(!graph.contains(currentVertice))
                        return false;
                }
                return true;
            }
            return false;
        }
        
        if(this.numberOfEdges() == graph.numberOfEdges()){
            for(Edge currentEdge : this.edges){
                if(!graph.contains(currentEdge))
                    return false;
            }
            return true;
        }
        
        return false;
        
    }
    
    @Override
    public String toString(){
        String result = "";
        for(Vertice vertice : vertices){
            result += vertice.toString()+", ";
        }
        result += "\n";
        for(Edge edge: edges){
            result += edge.toString()+",";
        }
        return result;
    }
    
    public boolean contains(Vertice vertice){
        for(Vertice currentVertice : vertices){
            if(currentVertice.equals(vertice))
                return true;
        }
        return false;
    }
    
    public boolean contains(Edge edge){
        for(Edge currentEdge : edges){
            if(currentEdge.equals(edge))
                return true;
        }
        return false;
    }
    
    public boolean isEmpty(){
        return (this.edges.isEmpty() && this.vertices.isEmpty());
    }
    
    public int numberOfEdges(){
        return this.edges.size();
    }
    
    public int nunberOfVertices(){
        return this.vertices.size();
    }
    
}
