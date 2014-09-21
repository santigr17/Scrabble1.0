
package jugador;
import Fichas.bolsa;
import GUI.random;
import ListasSimples.ListaSimple;
import ListasSimples.NodoListaSimple;

public class jugador
{
    ListaSimple<Integer> Atril=new ListaSimple<Integer>();
    boolean Turno=false;
    int Puntaje=0; 
    int PrimerFicha=0;
    Object SigJugador=null;
         
    random R=new random();      
    bolsa B=new bolsa();
    
    public void TerminarTurno()
    {
        this.Turno=false;
                
        
    }
    public void setSiguiente(Object jugador)
    {
        SigJugador=jugador;
        
    }
    public void rellenarAtril()
    {
        B.bolsa();
        NodoListaSimple<Integer> temp = Atril.getcabeza();
        if(Atril.tamaño()==0)
        {
            while (Atril.tamaño()<7)
            {
                int S1=R.random();
                Atril.agregar(S1);
                B.Sacar(S1);
            }
        }
        else
        {
            while(Atril.tamaño()<7)            
            {
                if(temp==null)
                {
                    int S2=R.random();
                    Atril.agregar(S2);
                    B.Sacar(S2);
                }
                temp=temp.getNext();
            }
        }
        System.out.print(temp);
        Atril.describir();
        B.mostrar();
    } 
    public void mostrar()
    {
        Atril.describir();
    }
    public void usarFicha(int ficha)
    {
        int Compara=Atril.getcabeza().getelem();
        NodoListaSimple temp=Atril.getcabeza();
       
        while(Compara!=ficha)
        {
            Compara=(int) temp.getNext().getelem();
            temp=temp.getNext();
                       
        }
        Atril.eliminar(Compara);
        }
    
    }

    