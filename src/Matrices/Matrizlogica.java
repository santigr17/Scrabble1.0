package Matrices;
import ListasSimples.*;
import static constants.Constants.*;
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
        temp.getelem().describir();
    }
    
    
    public void rellenar()
    {
        NodoListaSimple<ListaSimple<Integer>> temp = Matriz.getcabeza();
        int cantidad = 15;
        for (int x=0;x < cantidad;x++)
        {
            temp = temp.getNext();
            NodoListaSimple esp =temp.getelem().getcabeza();
            for(int y=0;y < cantidad;y++)
            {
                if ((x==0 && y==0)||(x==0 && y==7)||(x==0 && y==14))
                {
                
                esp.setelement(palabrax3);
                }
                
            }
            temp.getelem().describir();
        }
    }
}
    
