
package jugador;
import Fichas.bolsa;
import ListasSimples.ListaSimple;
import ListasSimples.NodoListaSimple;

public class jugador
{
    
    ListaSimple<Integer> Atril=new ListaSimple<Integer>();
    boolean Turno=false;
    int Puntaje=0; 
         
    bolsa R=new bolsa();      
    bolsa B=new bolsa();
    
    public jugador(){
        this.Puntaje=0;
        this.Turno=false;
        this.rellenarAtril();
    }
    
  
    public Integer getPuntaje(){
        return this.Puntaje;
    }
    public boolean getTurno(){
        return this.Turno;
    } 
    public ListaSimple<Integer> getAtril()    {
        return this.Atril;
    }

    public void setPuntaje(int Puntos){
        this.Puntaje=Puntos;
    }
    public void setTurno(boolean turno){
        this.Turno=turno;           
    }
    public void setAtril(ListaSimple atril){
        this.Atril=atril;
    }
    public void borrarAtril(){
        while(Atril.tamaño()!=0)
        {
            Integer temp=Atril.getcabeza().getelem();
            Atril.eliminar(temp);
        }
        System.out.print("Borré la lista");
    }
   
    public void rellenarAtril()
    {
        B.rellenarbolsa();
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
        this.rellenarAtril();
    }
                
}


    