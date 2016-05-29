/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.grafos.view;

import br.ufrn.grafos.entity.Edge;
import br.ufrn.grafos.service.LabyrinthGeneratorService;
import static java.awt.Color.*;
import java.awt.Graphics;
import static java.awt.SystemColor.window;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author GilbertoSoares
 */

class DrawRect {
    public static void main(String[] a) {
      JFrame window = new JFrame();
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      window.setBounds(30, 30, 300, 300);
      window.getContentPane().add(new MyCanvas());
      window.setVisible(true);
    }
}

public class MyCanvas extends javax.swing.JPanel {

    /**
     * Creates new form MyCanvas
     */
    public int x;
    public int y;
    public LabyrinthGeneratorService labyrinthGeneratorService;
    
    public MyCanvas() {
        initComponents();
    }
    
    public MyCanvas(int x, int y, LabyrinthGeneratorService lab) {
        this.x = x;
        this.y = y;
        labyrinthGeneratorService = lab;
        initComponents();
    }
    
    public int moduloDistancia(int a, int b){
        if(a > b){
            return a - b;
        }
        if(a < b){
            return b - a;
        }
        return 0;
    }

    public void paint(Graphics g) {
        
        g.setColor(white);
        g.fillRect (10, 10, x*20, y*20);
      
        g.setColor(black);
        g.drawRect (10, 10, x*20, y*20);
        
        for (int i = 1; i < x; i++) {
            g.drawLine (10, 10 + (20 * i), (y*20) + 10, 10 + (20 * i));
        }
        
        for (int j = 1; j < x; j++) {
            g.drawLine (10 + (20 * j), 10, 10 + (20 * j), (y*20) + 10);
        }
        
        //exemplo de linha apagada=
        g.setColor(white);
        
        List<Edge> edges = labyrinthGeneratorService.caminhoFinal().getEdges();
        int linhaOrigem;
        int colunaOrigem;
        int linhaDestino;
        int colunaDestino;
        int distanciaLinha;
        int distanciaColuna;
            
        for(Edge edge: edges){
            linhaOrigem = edge.getOrigin().getPosition().getRow();
            colunaOrigem = edge.getOrigin().getPosition().getColumn();
            linhaDestino = edge.getDestiny().getPosition().getRow();
            colunaDestino = edge.getDestiny().getPosition().getColumn();
            
            distanciaLinha = moduloDistancia(linhaOrigem,linhaDestino);
            distanciaColuna = moduloDistancia(linhaOrigem,linhaDestino);
            
            //g.drawLine(11,30,29,30); // coluna
            
            if(linhaOrigem == linhaDestino){
                g.drawLine(30,11,30,29);
                //g.drawLine(30 + (distanciaLinha * 20),11,30 + (distanciaLinha * 20),29); // linha
            }
        }
        
        //g.drawLine(11,30,29,30); // coluna
        //g.drawLine(30,11,30,29); // linha
      
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
