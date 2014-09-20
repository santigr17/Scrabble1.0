
package jugador;
import Fichas.bolsa;
import GUI.random;
import ListasSimples.ListaSimple;
import ListasSimples.NodoListaSimple;


public class jugador<E>
{
    ListaSimple Atril=new ListaSimple();
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
    public void tomarPrimerFicha()
    {
        //Ficha PrimerFicha=new Ficha();       
        
    }
    public void rellenarAtril()
    {
        if(Atril.tamaño()==0)
             for(Object temp=Atril.getcabeza();temp!=Atril.cola();Atril.)
            {
                if (temp==null)
                {
                    
                }                         
            }
        }
    }
    public void mostrar()
    {
        for(int i=0;i<7;i++)
        {
            System.out.println(Atril[i]);
        }
        B.mostrar();
    }
            

    
    
}
