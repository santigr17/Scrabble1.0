
package Fichas;

import java.io.IOException;
import javax.swing.JLabel;

/**
 *
 * @author Santi
 */


public class Ficha {
    private JLabel L;
    String Letras[]={"/imagenes.Fichas/a.jpg","/imagenes.Fichas/b.jpg",
        "/imagenes.Fichas/c.jpg","/imagenes.Fichas/d.jpg","/imagenes.Fichas/e.jpg"};
    
    public void pintar() throws IOException
    {
     L=new JLabel("Fuck you"); 
     L.setLayout(null);
     L.setBounds(10,20,100,100);
     L.add(L);
    }
    
}
        

