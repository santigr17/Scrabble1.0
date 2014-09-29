package jugador;

import Fichas.bolsa;
import ListasSimples.ListaSimple;
import ListasSimples.NodoListaSimple;

public class LogicJugador extends jugador{
    
    
   
    int jugadores=0;
    int TrunoActual=0;
    int numJugadores=4;
    ListaSimple PorCambiar;
    jugador jugador1;
    jugador jugador2;
    jugador jugador3;
    jugador jugador4;
    
    
    public void TerminarTurno(){
        this.TrunoActual++;
        if(this.TrunoActual==5)
        {
            this.TrunoActual=0;
        }
    }
    public void CambiarFichas(ListaSimple atril){//int Un,int Do,int Tr,int Cu,int Ci,int Se,int Si){
        
}
    public void ElegirFicha(int letra){
        //Listathis.Atril
        
             
    }
    /*
    public void borrarAtril(){
        while(Atril.tamaño()!=0)
        {
            Integer temp=Atril.getcabeza().getelem();
            Atril.eliminar(temp);
        }
        System.out.print("Borré la lista");
    }*/
   
    public void rellenarAtril()
    {
        NodoListaSimple<Integer> temp = Atril.getcabeza();
        if(Atril.tamaño()==0)
        {
            while (Atril.tamaño()<7)
            {
                int S1=R.random();
                Atril.agregar(S1);
                //B.Sacar(S1);
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
                    //B.Sacar(S2);
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