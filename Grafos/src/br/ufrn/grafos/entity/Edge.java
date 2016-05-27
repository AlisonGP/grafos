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
    private Vertice origim;
    private Vertice destiny;
    private boolean visited; 
   
    public Edge() {
        this.visited = false;
    }

    public Edge(Vertice origim, Vertice destiny) {
        this.origim = origim;
        this.destiny = destiny;
        this.visited = false;
    }

    public Edge(Vertice origim, Vertice destiny, boolean visited) {
        this.origim = origim;
        this.destiny = destiny;
        this.visited = visited;
    }
    
    public Vertice getOrigim() {
        return origim;
    }

    public void setOrigim(Vertice origim) {
        this.origim = origim;
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
        return this.getOrigim().equals(edge.getOrigim()) && this.getDestiny().equals(edge.getDestiny()) ||
               this.getOrigim().equals(edge.getDestiny()) && this.getDestiny().equals(edge.getOrigim());
    }
}
