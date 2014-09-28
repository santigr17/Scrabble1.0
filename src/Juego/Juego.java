package Juego;
import Fichas.*;
import ListasSimples.ListaSimple;
import ListasSimples.NodoListaSimple;

public class Juego {
    int numJugadores=0;
    ListaSimple Orden=new ListaSimple();
    Object jugador1=null;
    Object jugador2=null;
    Object jugador3=null;
    Object jugador4=null;
    int tiempo=0;
    
    public Juego(){
       this.jugador1=null;
       this.jugador2=null;
       this.jugador3=null;
       this.jugador4=null;
    }  
    public void guardarOrden(Object jugador1,Object jugador2,Object jugador3, Object jugador4){
        Orden.agregar(jugador1);
        Orden.agregar(jugador2);
        Orden.agregar(jugador3);
        Orden.agregar(jugador4);
        
    }
    public Object Turno(){
        NodoListaSimple temp1 = Orden.getcabeza();
        NodoListaSimple temp2 = Orden.getcabeza();
        while(temp1.getNext()!=null){
            temp1=temp1.getNext();
        }
        temp1.setNext(temp2);
        return temp2.getelem();
    }
      
    
}
