
package jugador;
import Fichas.bolsa;
import GUI.random;


public class jugador
{
    int Atril[]=new int[7];
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
        B.bolsa();             
        for(int i=0;i<7;i++)
           { 
               if (Atril[i]==0)
               {
                   Atril[i]=R.random();
                   B.Sacar(Atril[i]);
               }
               
           }
           
     }
            Object Letra= null;//new Ficha.getFicha();
          //  NodoListaSimple<Letra> L_Disponibles = NodoListaSimple<Letra>;
            //Atril.agregar();
       // }
    
    public void mostrar()
    {
        for(int i=0;i<7;i++)
        {
            System.out.println(Atril[i]);
        }
        B.mostrar();
    }
            

    
    
}
