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
 * @author aliso
 */
public class Vertice {
    
    /** Posição na matriz */
    private Position position;
    /** Lista de arestas com os vertices adjacentes. */
    private List<Edge> adjacents;

    public Vertice() {
        this.adjacents = new ArrayList<>();
    }

    public Vertice(Position position) {
        this.position = position;
        this.adjacents = new ArrayList<>();
    }
    
    public Vertice(Position position, List<Edge> adjacents) {
        this.position = position;
        this.adjacents = adjacents;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public List<Edge> getAdjacents() {
        return adjacents;
    }

    public void setAdjacents(List<Edge> adjacents) {
        this.adjacents = adjacents;
    }

    public boolean equals(Vertice vertice) {
       return this.position.equals(vertice.getPosition());
    }
    
}
