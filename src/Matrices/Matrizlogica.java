package Matrices;
import ListasSimples.*;
/**
 *
 * @author edr2394
 */
public class Matrizlogica<E>
{
    private ListaSimple<ListaSimple<E>> Matriz;
    public Matrizlogica()
    {
        Matriz= new ListaSimple<ListaSimple<E>> ();
    }
    public void crearMatrizlogica(int i)
        {
            int x = 0;
            while (x <= i) 
            {
                ListaSimple<E> lista = new ListaSimple<E> ();
                
                int y = 0;
                while (y <= i)
                {
                    lista.agregar(null);
                    y++;
                }
                this.Matriz.agregar(lista);
                x++;
            } 
        }
    public void setdato(int i,int j, E pelem)
    {

    }
}
    
