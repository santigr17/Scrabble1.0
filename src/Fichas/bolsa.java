

package Fichas;
import ListasSimples.*;
import javax.swing.JOptionPane;

/**
 *
 * @author emily
 */


public class bolsa <E>
{
    
    ListaSimple<Integer> Bolsa=new ListaSimple<Integer>();
    
    public void bolsa()
        {
        Bolsa.agregar(2);//Espacio
        Bolsa.agregar(9);// A
        Bolsa.agregar(2);// B
        Bolsa.agregar(2);// C
        Bolsa.agregar(4);// D
        Bolsa.agregar(12);// E
        Bolsa.agregar(2);// F
        Bolsa.agregar(3);// G
        Bolsa.agregar(2);// H
        Bolsa.agregar(9);// I
        Bolsa.agregar(1);// J
        Bolsa.agregar(1);// K
        Bolsa.agregar(4);// L
        Bolsa.agregar(2);// M
        Bolsa.agregar(6);// N
        Bolsa.agregar(8);// O
        Bolsa.agregar(2);// P
        Bolsa.agregar(2);// Q
        Bolsa.agregar(6);// R
        Bolsa.agregar(4);// S
        Bolsa.agregar(6);// T
        Bolsa.agregar(4);// U
        Bolsa.agregar(2);// V
        Bolsa.agregar(2);// W
        Bolsa.agregar(1);// X
        Bolsa.agregar(2);// Y
        Bolsa.agregar(1);// Z
    }
    public void mostrar()
        {
            Bolsa.describir();
        }
    
    public void vacio()
        {
                
        }
    public void Sacar(int N)
        { 
            NodoListaSimple<Integer> temp = Bolsa.getcabeza();
            for (int i=0;i<N;i++)
            {
                temp = temp.getNext();
            }
            if(temp.getelem()>0)
                {
                temp.setelement(temp.getelem()-1);
                }
            else
                {
                temp.getNext().setelement(temp.getelem()-1);
                }
        }
    
}
