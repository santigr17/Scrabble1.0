package Matrices;
import ListasSimples.*;
/**
 *
 * @author edr2394
 */
public class Matrizlogica
{
    private ListaSimple<ListaSimple<Integer>> Matriz;
    public Matrizlogica(){
        Matriz= new ListaSimple<ListaSimple<Integer>> ();
    }
    public void crearMatrizlogica(int i)
    {
        int x = 0;
        while (x != i) 
        {
            ListaSimple<Integer> lista = new ListaSimple<Integer> ();
            
            int y = 0;
            while (y != i)
            {
                lista.agregar(0);
                y++;
            }
            this.Matriz.agregar(lista);
            x++;
        } 
    }
    public void setdato(int f,int c,int pnum)
    {
        NodoListaSimple<ListaSimple<Integer>> temp = Matriz.getcabeza();
        for(int x=0;x<f;x++)
        {
            temp = temp.getNext();
        }
        NodoListaSimple<Integer> cabezalistatemp = temp.getelem().getcabeza(); 
        for(int y=0;y<c;y++)
        {
            cabezalistatemp = cabezalistatemp.getNext();
        }
        cabezalistatemp.setelement(pnum);
        cabezalistatemp.getelem();
        temp.getelem().describir();
        /**NodoListaSimple<ListaSimple<E>> temp = Matriz.getcabeza();
        *for(int x = 0;x<i;x++)
        *{
        *    temp= temp.getNext();
        *}           
        *
        *NodoListaSimple<E> cabezalistaTemp = temp.getelem().getcabeza();
        *for (int y=0;y<j;j++)
        *{
        *        cabezalistaTemp = cabezalistaTemp.getNext();
        *}
        *cabezalistaTemp.setelement(pelem);
        *Matriz.getcabeza().getelem().describir();
        *if (cabezalistaTemp.getelem() != null)
        *{
        *    return false;
        *}
        *cabezalistaTemp.setelement(pelem);
        *Matriz.getcabeza().getelem().describir();
        *return true;
        */

    }
}
    
