
package Fichas;
import ListasSimples.*;
import javax.swing.JOptionPane;
import java.util.Random;

public class bolsa <E>
{  
    ListaSimple<Integer> Bolsa=new ListaSimple<Integer>();
    
    public void bolsa()
        {
        Bolsa.agregar(2);//Espacio0
        Bolsa.agregar(9);// A1
        Bolsa.agregar(2);// B2
        Bolsa.agregar(2);// C3
        Bolsa.agregar(4);// D4
        Bolsa.agregar(12);//E5
        Bolsa.agregar(2);// F6
        Bolsa.agregar(3);// G7
        Bolsa.agregar(2);// H8
        Bolsa.agregar(9);// I9
        Bolsa.agregar(1);// J10
        Bolsa.agregar(1);// K11
        Bolsa.agregar(4);// L12
        Bolsa.agregar(2);// M13
        Bolsa.agregar(6);// N14
        Bolsa.agregar(8);// O15
        Bolsa.agregar(2);// P16
        Bolsa.agregar(2);// Q17
        Bolsa.agregar(6);// R18
        Bolsa.agregar(4);// S19
        Bolsa.agregar(6);// T20
        Bolsa.agregar(4);// U21
        Bolsa.agregar(2);// V22
        Bolsa.agregar(2);// W23
        Bolsa.agregar(1);// X24
        Bolsa.agregar(2);// Y25
        Bolsa.agregar(1);// Z26
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
    
    public int random(){ 
    int R=(int) Math.floor(Math.random()*26+1);
    //System.out.println(R);
    return R;
    }
    
}
