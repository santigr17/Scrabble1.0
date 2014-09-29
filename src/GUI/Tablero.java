

package GUI;
import Fichas.*;

public class Tablero extends javax.swing.JFrame {

    MetodosGUI MG = new MetodosGUI();
    Logicbolsa bolsa = new Logicbolsa();
    CargarImagenes C = new CargarImagenes();
    FichasJugador jugador = new FichasJugador();

    public Tablero() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    private void initComponents() {
        colocar = new javax.swing.JButton();
        quitar = new javax.swing.JButton();
        pasar = new javax.swing.JButton();
        cambiar = new javax.swing.JButton();
        Juga1 = new javax.swing.JLabel();
        Juga2 = new javax.swing.JLabel();
        Juga3 = new javax.swing.JLabel();
        Juga4 = new javax.swing.JLabel();
        tablero = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        BJuga2 = new javax.swing.JButton();
        BJuga3 = new javax.swing.JButton();
        BJuga4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 600));
        getContentPane().setLayout(null);
        
        BJuga2.setFont(new java.awt.Font("Ubuntu Medium", 1, 18)); // NOI18N
        BJuga2.setText("2 Jugadores");
        BJuga2.setToolTipText("");
        
        BJuga2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BJuga2ActionPerformed(evt);
            }
        });
        getContentPane().add(BJuga2);
        BJuga2.setBounds(240, 75, 150, 75);

        BJuga3.setFont(new java.awt.Font("Ubuntu Medium", 1, 18)); // NOI18N
        BJuga3.setText("3 Jugadores");
        BJuga3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BJuga3ActionPerformed(evt);
            }
        });
        getContentPane().add(BJuga3);
        BJuga3.setBounds(240, 240, 150, 75);

        BJuga4.setFont(new java.awt.Font("Ubuntu Medium", 1, 18)); // NOI18N
        BJuga4.setText("4 Jugadores");
        BJuga4.setBorder(new javax.swing.border.MatteBorder(null));
        BJuga4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BJuga4ActionPerformed(evt);
            }
        });
        getContentPane().add(BJuga4);
        BJuga4.setBounds(240, 400, 150, 75);


        tablero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tablero.png"))); // NOI18N
        getContentPane().add(tablero);
        tablero.setBounds(620, 20, 570, 570);

        colocar.setFont(new java.awt.Font("Ubuntu Medium", 1, 18)); // NOI18N
        colocar.setText("Colocar(A)");
        colocar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colocarMouseClicked(evt);
            }
        });
        getContentPane().add(colocar);
        colocar.setBounds(50, 430, 180, 50);
        colocar.setVisible(false);

        quitar.setFont(new java.awt.Font("Ubuntu Medium", 1, 18)); // NOI18N
        quitar.setText("Quitar(B)");
        quitar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quitarMouseClicked(evt);
            }
        });
        getContentPane().add(quitar);
        quitar.setBounds(380, 430, 200, 50);
        quitar.setVisible(false);

        pasar.setFont(new java.awt.Font("Ubuntu Medium", 1, 18)); // NOI18N
        pasar.setText("Pasar Turno(C)");
        pasar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pasarMouseClicked(evt);
            }
        });
        getContentPane().add(pasar);
        pasar.setBounds(50, 500, 180, 50);
        pasar.setVisible(false);

        cambiar.setFont(new java.awt.Font("Ubuntu Medium", 1, 18)); // NOI18N
        cambiar.setText("Cambiar Letra(D)");
        cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarActionPerformed(evt);
            }
        });
        getContentPane().add(cambiar);
        cambiar.setBounds(380, 500, 200, 50);
        cambiar.setVisible(false);

        Juga1.setFont(new java.awt.Font("Ubuntu Medium", 1, 18)); // NOI18N
        Juga1.setForeground(new java.awt.Color(229, 248, 243));
        Juga1.setText("Jugador  1");
        getContentPane().add(Juga1);
        Juga1.setBounds(20, 30, 100, 40);
        Juga1.setVisible(false);

        Juga2.setFont(new java.awt.Font("Ubuntu Medium", 1, 18)); // NOI18N
        Juga2.setForeground(new java.awt.Color(241, 231, 231));
        Juga2.setText("Jugador  2");
        getContentPane().add(Juga2);
        Juga2.setBounds(20, 90, 130, 30);
        Juga2.setVisible(false);

        Juga3.setFont(new java.awt.Font("Ubuntu Medium", 1, 18)); // NOI18N
        Juga3.setForeground(new java.awt.Color(245, 231, 231));
        Juga3.setText("Jugador  3");
        getContentPane().add(Juga3);
        Juga3.setBounds(20, 140, 120, 30);
        Juga3.setVisible(false);
        
        Juga4.setFont(new java.awt.Font("Ubuntu Medium", 1, 18)); // NOI18N
        Juga4.setForeground(new java.awt.Color(241, 227, 227));
        Juga4.setText("Jugador  4");
        getContentPane().add(Juga4);
        Juga4.setBounds(20, 190, 110, 30);
        Juga4.setVisible(false);
        
        tablero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tablero.png"))); // NOI18N
        getContentPane().add(tablero);
        tablero.setBounds(610, 10, 570, 570);

        fondo.setForeground(new java.awt.Color(252, 236, 236));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondomesa.png"))); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 1200, 600);

        pack();
    }// </editor-fold>                        

    private void BJuga3ActionPerformed(java.awt.event.ActionEvent evt) {                                      
       jugador.inicioatril(MG.retorne3());
       this.Juga1.setVisible(true);
       this.Juga2.setVisible(true);
       this.Juga3.setVisible(true);
       this.BJuga2.setVisible(false);
       this.BJuga3.setVisible(false);
       this.BJuga4.setVisible(false);
       this.colocar.setVisible(true);
       this.pasar.setVisible(true);
       this.quitar.setVisible(true);
       this.cambiar.setVisible(true);
       //C.pintarAtriles(jugador.Atril1, this.getGraphics(), 150, 150);
       
    }                                     

    
    private void BJuga4ActionPerformed(java.awt.event.ActionEvent evt) {                                      
       jugador.inicioatril(MG.retorne4());
       this.Juga1.setVisible(true);
       this.Juga2.setVisible(true);
       this.Juga3.setVisible(true);
       this.Juga4.setVisible(true);
       this.BJuga2.setVisible(false);
       this.BJuga3.setVisible(false);
       this.BJuga4.setVisible(false);
       this.colocar.setVisible(true);
       this.pasar.setVisible(true);
       this.quitar.setVisible(true);
       this.cambiar.setVisible(true);
       
    }                                     

    
    private void BJuga2ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        jugador.inicioatril(MG.retorne2());
        this.Juga1.setVisible(true);
        this.Juga2.setVisible(true);
        this.BJuga2.setVisible(false);
        this.BJuga3.setVisible(false);
        this.BJuga4.setVisible(false);
        this.colocar.setVisible(true);
        this.pasar.setVisible(true);
        this.quitar.setVisible(true);
        this.cambiar.setVisible(true);
    }                                  
    
    private void cambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarActionPerformed
        bolsa.bolsainicio(MG.retorne4());

    }//GEN-LAST:event_cambiarActionPerformed

    private void colocarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colocarMouseClicked
        bolsa.bolsainicio(MG.retorne1());
        C.pintarAtriles(jugador.Atril1, this.getGraphics(), 150, 330);
    }//GEN-LAST:event_colocarMouseClicked

    private void pasarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pasarMouseClicked
        bolsa.bolsainicio(MG.retorne3());
        jugador.inicioatril(MG.retorne3());
        
    }//GEN-LAST:event_pasarMouseClicked

    private void quitarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitarMouseClicked
        bolsa.bolsainicio(MG.retorne2());
    }//GEN-LAST:event_quitarMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Juga1;
    public javax.swing.JLabel Juga2;
    public javax.swing.JLabel Juga3;
    public javax.swing.JLabel Juga4;
    private javax.swing.JButton cambiar;
    public javax.swing.JButton colocar;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton pasar;
    private javax.swing.JButton quitar;
    private javax.swing.JLabel tablero;
    // End of variables declaration//GEN-END:variables
    public javax.swing.JButton BJuga2;
    private javax.swing.JButton BJuga3;
    private javax.swing.JButton BJuga4;
}
