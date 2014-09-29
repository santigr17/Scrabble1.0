package jugador;

import ListasSimples.ListaSimple;
import ListasSimples.NodoListaSimple;

public class jugador
{
    
    ListaSimple<Integer> Atril=new ListaSimple<Integer>();
    int Puntaje; 
    int Turno;

    
    public jugador(){
        this.Puntaje=0;
        this.Turno=0;
    }   
  
    public Integer getPuntaje(){
        return this.Puntaje;
    }
    public int getTurno(){
        return this.Turno;
    } 
    public ListaSimple<Integer> getAtril()    {
        return this.Atril;
    }
    public void setPuntaje(int Puntos){
        this.Puntaje=Puntos;
    }
    public void setTurno(int turno){
        this.Turno=turno;           
    }
    public void setAtril(ListaSimple atril){
        this.Atril=atril;
    }    
    public void SumarPuntos(int puntos){
        this.Puntaje=this.Puntaje+puntos;
    }               
}


    