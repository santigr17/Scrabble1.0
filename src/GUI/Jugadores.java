package GUI;

public class Jugadores extends javax.swing.JFrame {
    Tablero VTablero = new Tablero();
    MetodosGUI MG=new MetodosGUI();
    
    public Jugadores() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Juga2 = new javax.swing.JButton();
        Juga3 = new javax.swing.JButton();
        Juga4 = new javax.swing.JButton();
        FondoJugadores = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 600));
        getContentPane().setLayout(null);

        Juga2.setFont(new java.awt.Font("Ubuntu Medium", 1, 18)); // NOI18N
        Juga2.setText("2 Jugadores");
        Juga2.setToolTipText("");
        Juga2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Juga2MouseClicked(evt);
            }
        });
        getContentPane().add(Juga2);
        Juga2.setBounds(320, 260, 150, 75);

        Juga3.setFont(new java.awt.Font("Ubuntu Medium", 1, 18)); // NOI18N
        Juga3.setText("3 Jugadores");
        Juga3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Juga3ActionPerformed(evt);
            }
        });
        getContentPane().add(Juga3);
        Juga3.setBounds(530, 370, 150, 75);

        Juga4.setFont(new java.awt.Font("Ubuntu Medium", 1, 18)); // NOI18N
        Juga4.setText("4 Jugadores");
        Juga4.setBorder(new javax.swing.border.MatteBorder(null));
        Juga4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Juga4ActionPerformed(evt);
            }
        });
        getContentPane().add(Juga4);
        Juga4.setBounds(770, 460, 150, 75);

        FondoJugadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondojugadores.png"))); // NOI18N
        getContentPane().add(FondoJugadores);
        FondoJugadores.setBounds(0, 0, 1200, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Juga3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Juga3ActionPerformed
       MG.retorne3();
       VTablero.setVisible(true);
       VTablero.Juga4.setVisible(false);
       this.setVisible(false);  
    }//GEN-LAST:event_Juga3ActionPerformed

    private void Juga4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Juga4ActionPerformed
       MG.retorne4();
       VTablero.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_Juga4ActionPerformed

    private void Juga2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Juga2MouseClicked
        MG.retorne2();
        VTablero.setVisible(true);
        VTablero.Juga3.setVisible(false);
        VTablero.Juga4.setVisible(false);
        this.setVisible(false);
    }//GEN-LAST:event_Juga2MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jugadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoJugadores;
    public javax.swing.JButton Juga2;
    private javax.swing.JButton Juga3;
    private javax.swing.JButton Juga4;
    // End of variables declaration//GEN-END:variables
}
