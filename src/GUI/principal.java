/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

/**
 *
 * @author emily
 */
public class principal extends javax.swing.JFrame {
    public principal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        play = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Scrabble");
        setBounds(new java.awt.Rectangle(10, 10, 10, 10));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1150, 550));
        setMinimumSize(new java.awt.Dimension(1150, 550));
        setName("principal"); // NOI18N
        getContentPane().setLayout(null);

        play.setBackground(null);
        play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/play.png"))); // NOI18N
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });
        getContentPane().add(play);
        play.setBounds(490, 230, 200, 140);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        fondo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 1190, 590);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_playActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void pintar() {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JButton play;
    // End of variables declaration//GEN-END:variables
}
