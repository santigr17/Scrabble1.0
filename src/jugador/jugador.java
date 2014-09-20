
package jugador;
import Fichas.bolsa;


public class jugador
{
    Object Atril[]=new Object[7];
    boolean Turno=false;
    int Puntaje=0; 
    int PrimerFicha=0;
    Object SigJugador=null;
    Object bolsa=new bolsa();     
          
                        
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
        for(int i=0;i<7;i++)
        {
            if(Atril[i]==null)
            {
                
            }
        }
            Object Letra= null;//new Ficha.getFicha();
          //  NodoListaSimple<Letra> L_Disponibles = NodoListaSimple<Letra>;
            //Atril.agregar();
       // }
    }
    public void mostrar()
    {
        for(int i=0;i<7;i++)
        {
            System.out.println(Atril[i]);
        }
    }
            

    
    
}
