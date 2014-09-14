

package GUI;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JDesktopPane;

/**
 *
 * @author emily
 */
public class fondo extends JDesktopPane {
    private Image imagen;
    public void Fondo()
        {
            this.setLayout(null);
            
            this.setBounds(0,0,1200,600);
            
            try {
            imagen=ImageIO.read(getClass().getResource("/imagenes/fondo.jpg"));
            }
            catch(IOException error){
            error.printStackTrace();
                }
            }
    public void paint(Graphics g){
            super.paintComponent(g);
            g.drawImage(imagen, 0, 0, getWidth(),getHeight(),this);
            
        }
    }
        

