package br.ufrn.grafos.entity;

public class Position {
    private int row;
    private int column;

    public Position() {
    }

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }
    
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
    
    public boolean equals(Position position){
        return (this.row == position.row && this.column == position.column);
    }
    
    @Override
    public String toString(){
        return row+", "+column;
    }
    
}
