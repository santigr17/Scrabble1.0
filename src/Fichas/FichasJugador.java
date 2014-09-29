package Fichas;
import ListasSimples.ListaSimple;
public class FichasJugador extends Logicbolsa 
{
    public ListaSimple Atril1 = new ListaSimple();
    public ListaSimple Atril2 = new ListaSimple();
    public ListaSimple Atril3 = new ListaSimple();
    public ListaSimple Atril4 = new ListaSimple();
    bolsa bolsa1 = new bolsa();
    public void inicioatril(int marcador)
    {
        bolsa1.rellenarbolsa();
        if (marcador==2)
        {
           for(int i=0;i<7;i++)
           {
           int letra = bolsa1.random();
           int letra2 = bolsa1.random();
           Atril1.agregar(letra);
           Atril2.agregar(letra2);
           bolsa1.Sacar(letra);
           bolsa1.Sacar(letra2);
           }
           Atril1.describir();
           Atril2.describir();
           bolsa1.mostrar();
        }
        if (marcador==3)
        {
           for(int i=0;i<7;i++)
           {
           Atril1.agregar(bolsa1.random());
           Atril2.agregar(bolsa1.random());
           Atril3.agregar(bolsa1.random());
           }
           Atril1.describir();
           Atril2.describir();
           Atril3.describir();
        }
        if (marcador==4)
        {
           for(int i=0;i<7;i++)
           {
           Atril1.agregar(bolsa1.random());
           Atril2.agregar(bolsa1.random());
           Atril3.agregar(bolsa1.random());
           Atril4.agregar(bolsa1.random());
           }
           Atril1.describir();
           Atril2.describir();
           Atril3.describir();
           Atril4.describir();
        }
    }
}
