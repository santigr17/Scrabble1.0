/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import Fichas.bolsa;

/**
 *
 * @author emily
 */
public class GameArea extends javax.swing.JFrame {

    bolsa B=new bolsa();
   
    public GameArea() {
        initComponents();
        this.setLocationRelativeTo(this);
        B.bolsa();
    }
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tablero = new javax.swing.JLabel();
        bolsa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GameArea");
        setBackground(new java.awt.Color(9, 114, 12));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1100, 700));
        getContentPane().setLayout(null);

        tablero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tablero.jpg"))); // NOI18N
        tablero.setPreferredSize(new java.awt.Dimension(670, 670));
        getContentPane().add(tablero);
        tablero.setBounds(420, 0, 670, 670);

        bolsa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bolsa.png"))); // NOI18N
        bolsa.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        bolsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bolsaActionPerformed(evt);
            }
        });
        getContentPane().add(bolsa);
        bolsa.setBounds(110, 10, 220, 110);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void bolsaActionPerformed(java.awt.event.ActionEvent evt) {
        random R=new random();
        B.Sacar(R.random());
        
    }

    public void main() {
            java.awt.EventQueue.invokeLater(() -> {
            new GameArea().setVisible(true);
          
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bolsa;
    private javax.swing.JLabel tablero;
    // End of variables declaration//GEN-END:variables
}
