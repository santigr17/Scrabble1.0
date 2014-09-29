package jugador;

import Fichas.bolsa;
import ListasSimples.ListaSimple;
import ListasSimples.NodoListaSimple;

public class LogicaJugador {
    
    
   
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
        if(this.numJugadores==4){
            if(this.TrunoActual==5){     
                    this.TrunoActual=0;
            }
        }
        else if(this.numJugadores==3){
            if(this.TrunoActual==4){
                this.TrunoActual=0;
            }
        }
        else if(this.numJugadores==2){
            if(this.TrunoActual==3){
                this.TrunoActual=0;
            }
        }
    }
}