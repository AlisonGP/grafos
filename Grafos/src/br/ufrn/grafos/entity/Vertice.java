package br.ufrn.grafos.entity;

import java.util.ArrayList;
import java.util.List;

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
    
    public Vertice(int row, int column) {
        this.position = new Position(row, column);
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

    public void setPosition(int row, int column) {
        this.position.setRow(row);
        this.position.setColumn(column);
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
    
    @Override
    public String toString(){
        return "("+position.toString()+")";
    }
}
