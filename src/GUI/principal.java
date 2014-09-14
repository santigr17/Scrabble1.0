/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import javax.swing.JFrame;

/**
 *
 * @author emily
 */
public class principal extends JFrame {
    private fondo F=new fondo();
        public void  ventana(){
            this.setLayout(null);
            this.setTitle("Scrabble");
            this.setBounds(10,10,1200,600);
            this.setLocationRelativeTo(null);
            this.setVisible(true);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            this.add(F);
            F.Fondo();
            
            
        }
}
