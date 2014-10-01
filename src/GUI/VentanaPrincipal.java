package GUI;

public class VentanaPrincipal extends javax.swing.JFrame {
    Tablero TB=new Tablero();
    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonPlay = new javax.swing.JButton();
        fondoVP = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 600));
        getContentPane().setLayout(null);

        BotonPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/play.png"))); // NOI18N
        BotonPlay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BotonPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonPlayMouseClicked(evt);
            }
        });
        BotonPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPlayActionPerformed(evt);
            }
        });
        getContentPane().add(BotonPlay);
        BotonPlay.setBounds(540, 280, 152, 102);

        fondoVP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        getContentPane().add(fondoVP);
        fondoVP.setBounds(0, 0, 1200, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonPlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonPlayMouseClicked
    TB.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_BotonPlayMouseClicked

    private void BotonPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPlayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonPlayActionPerformed

    public void main() {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonPlay;
    private javax.swing.JLabel fondoVP;
    // End of variables declaration//GEN-END:variables
}
