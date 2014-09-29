
package GUI;

import ListasSimples.ListaSimple;
import ListasSimples.NodoListaSimple;
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
        letra = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/1.png")).getImage());
        return letra;
    }
    
    public void cargarImagen(Graphics g,int x, int y)
    {
        g.drawImage(CrearIcon().getImage(), x, y, 33,33,null);
        System.out.println("Letra colocada");
    }
    
    public void pintarAtriles(ListaSimple L,Graphics g, int x, int y)
    {    
        NodoListaSimple<Integer> temp = L.getcabeza();
        for(int i=0;i<7;i++)
        {
         this.cargarImagen(g,x,y);
         temp.getNext();
         x=x+50;
        }
        
    }
}
