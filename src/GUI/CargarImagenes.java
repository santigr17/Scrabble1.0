
package GUI;

import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author emily
 */
public class CargarImagenes {
    
    public ImageIcon CrearIcon()
    {
        ImageIcon letra;
        letra = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/e.png")).getImage());
        return letra;
    }
    
    public void cargarImagen(Graphics g)
    {
        g.drawImage(CrearIcon().getImage(), 685, 125, 33,33,null);
        System.out.println("Letra colocada");
        
    }
}
