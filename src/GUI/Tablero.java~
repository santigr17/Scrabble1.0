package GUI;
import Fichas.*;
public class Tablero extends javax.swing.JFrame {
    MetodosGUI MG=new MetodosGUI();
    Logicbolsa bolsa = new Logicbolsa();
    CargarImagenes C = new CargarImagenes();
    
    public Tablero() {
        initComponents();
        this.setLocationRelativeTo(this); 
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 600));
        getContentPane().setLayout(null);

<<<<<<< HEAD
=======
        tablero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tablero.png"))); // NOI18N
        getContentPane().add(tablero);
        tablero.setBounds(620, 20, 570, 570);

>>>>>>> 1f7c7e998bbce99728b5418aab994d4eb34810b2
        colocar.setFont(new java.awt.Font("Ubuntu Medium", 1, 18)); // NOI18N
        colocar.setText("Colocar(A)");
        colocar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colocarMouseClicked(evt);
            }
        });
        getContentPane().add(colocar);
        colocar.setBounds(50, 430, 180, 50);

        quitar.setFont(new java.awt.Font("Ubuntu Medium", 1, 18)); // NOI18N
        quitar.setText("Quitar(B)");
        quitar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quitarMouseClicked(evt);
            }
        });
        getContentPane().add(quitar);
        quitar.setBounds(380, 430, 200, 50);

        pasar.setFont(new java.awt.Font("Ubuntu Medium", 1, 18)); // NOI18N
        pasar.setText("Pasar Turno(C)");
        pasar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pasarMouseClicked(evt);
            }
        });
        getContentPane().add(pasar);
        pasar.setBounds(50, 500, 180, 50);

        cambiar.setFont(new java.awt.Font("Ubuntu Medium", 1, 18)); // NOI18N
        cambiar.setText("Cambiar Letra(D)");
        cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarActionPerformed(evt);
            }
        });
        getContentPane().add(cambiar);
        cambiar.setBounds(380, 500, 200, 50);

        Juga1.setFont(new java.awt.Font("Ubuntu Medium", 1, 18)); // NOI18N
        Juga1.setForeground(new java.awt.Color(229, 248, 243));
        Juga1.setText("Jugador  1");
        getContentPane().add(Juga1);
        Juga1.setBounds(20, 30, 100, 40);

        Juga2.setFont(new java.awt.Font("Ubuntu Medium", 1, 18)); // NOI18N
        Juga2.setForeground(new java.awt.Color(241, 231, 231));
        Juga2.setText("Jugador  2");
        getContentPane().add(Juga2);
        Juga2.setBounds(20, 90, 130, 30);

        Juga3.setFont(new java.awt.Font("Ubuntu Medium", 1, 18)); // NOI18N
        Juga3.setForeground(new java.awt.Color(245, 231, 231));
        Juga3.setText("Jugador  3");
        getContentPane().add(Juga3);
        Juga3.setBounds(20, 140, 120, 30);

        Juga4.setFont(new java.awt.Font("Ubuntu Medium", 1, 18)); // NOI18N
        Juga4.setForeground(new java.awt.Color(241, 227, 227));
        Juga4.setText("Jugador  4");
        getContentPane().add(Juga4);
        Juga4.setBounds(20, 190, 110, 30);

        tablero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tablero.png"))); // NOI18N
        getContentPane().add(tablero);
        tablero.setBounds(610, 10, 570, 570);

        fondo.setForeground(new java.awt.Color(252, 236, 236));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondomesa.png"))); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 1200, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarActionPerformed
            bolsa.bolsainicio(MG.retorne4());
            
    }//GEN-LAST:event_cambiarActionPerformed

    private void colocarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colocarMouseClicked
            bolsa.bolsainicio(MG.retorne1());
            C.cargarImagen(this.getGraphics());
    }//GEN-LAST:event_colocarMouseClicked

    private void pasarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pasarMouseClicked
            bolsa.bolsainicio(MG.retorne3());
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
}
