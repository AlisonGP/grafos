/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.grafos.entity;

/**
 *
 * @author aliso
 */
public class Edge {
    private Vertice origin;
    private Vertice destiny;
    private boolean visited; 
   
    public Edge() {
        this.visited = false;
    }

    public Edge(Vertice origin, Vertice destiny) {
        this.origin = origin;
        this.destiny = destiny;
        this.visited = false;
    }

    public Edge(Vertice origin, Vertice destiny, boolean visited) {
        this.origin = origin;
        this.destiny = destiny;
        this.visited = visited;
    }
    
    public Vertice getOrigin() {
        return origin;
    }

    public void setOrigin(Vertice origin) {
        this.origin = origin;
    }

    public Vertice getDestiny() {
        return destiny;
    }

    public void setDestiny(Vertice destiny) {
        this.destiny = destiny;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
    
    public boolean equals(Edge edge){
        return this.getOrigin().equals(edge.getOrigin()) && this.getDestiny().equals(edge.getDestiny()) ||
               this.getOrigin().equals(edge.getDestiny()) && this.getDestiny().equals(edge.getOrigin());
    }
    
    public String toString(){
        return "("+origin+", "+destiny+")";
    }
}
