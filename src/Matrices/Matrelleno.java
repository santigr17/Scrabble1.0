package Matrices;
import ListasSimples.*;
import static constants.Constants.*;

public class Matrelleno extends Matrizlogica 
{
    Matrizlogica Matriz=new Matrizlogica();
    public void rellenar()
    {
        Matriz.crearMatrizlogica(15);
        Matriz.setdato(0, 0,palabrax3 );
        Matriz.setdato(0, 7,palabrax3 );
        Matriz.setdato(0, 14,palabrax3);
        Matriz.setdato(7, 0, palabrax3);
      
    
    }
      
}
