
package GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;


/**
 *
 * @author emily
 */


public class pintar {
    public void paint(Graphics g)
        {Graphics2D G= (Graphics2D)g;
        G.setColor(Color.black);
        G.fillOval(50, 50, 30, 30);

        }
}
