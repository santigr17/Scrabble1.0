
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
        for (int i=0;i<7;i++)
        {
            int S=R.random();
            Atril.agregar(S);
            B.Sacar(S);
        }
        Atril.describir();
        B.mostrar();
       /** if(Atril.tamaño()==0)
        {
            NodoListaSimple<Integer> temp=null;
        }
        else
        {
            for(int i=0;i<7;i++)
            {
                System.out.println(temp);
                {
                    
                }
                       if(temp==null)
            {
               temp.setelement(R.random());
               temp.getNext();
            }
           
            
        }*/
    } 
    public void mostrar()
    {
        Atril.describir();
    }
}
    