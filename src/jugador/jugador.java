
package jugador;
//import Fichas;
import ListasSimples.ListaSimple;
import ListasSimples.NodoListaSimple;


public class jugador 
{
    
    ListaSimple Atril = new ListaSimple();
    boolean Turno=false;
    int Puntaje=0; 
    int PrimerFicha=0;
    Object SigJugador=null;
           
          
                        
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
        while (Atril.tamaño()<=7)
        {
            Object Letra= null;//new Ficha.getFicha();
            NodoListaSimple<Letra> L_Disponibles = NodoListaSimple<Letra>;
            //Atril.agregar();
        }
    }
            

    
    
}
