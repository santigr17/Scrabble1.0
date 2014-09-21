package Matrices;
import ListasSimples.*;
import static constants.Constants.*;

public class Matrelleno extends Matrizlogica 
{
    Matrizlogica Matriz=new Matrizlogica();
    public void rellenar()
    {
       Matriz.crearMatrizlogica(15);
       Matriz.setdato(0, 0, palabrax3);
       Matriz.setdato(0, 7, palabrax3);
       Matriz.setdato(0, 14, palabrax3);
       Matriz.setdato(7, 0, palabrax3);
       Matriz.setdato(7, 14, palabrax3);
       Matriz.setdato(14, 0, palabrax3);
       Matriz.setdato(14, 7, palabrax3);
       Matriz.setdato(14, 14, palabrax3);
       Matriz.setdato(1, 13, palabrax2);
       Matriz.setdato(2, 12, palabrax2);
       Matriz.setdato(3, 11, palabrax2);
       Matriz.setdato(4, 10, palabrax2);
       Matriz.setdato(10, 4, palabrax2);
       Matriz.setdato(11, 3, palabrax2);
       Matriz.setdato(12, 2, palabrax2);
       Matriz.setdato(13, 1, palabrax2);
       Matriz.setdato(1, 1, palabrax2);
       Matriz.setdato(2, 2, palabrax2);
       Matriz.setdato(3, 3, palabrax2);
       Matriz.setdato(4, 4, palabrax2);
       Matriz.setdato(10, 10, palabrax2);
       Matriz.setdato(11, 11, palabrax2);
       Matriz.setdato(12, 12, palabrax2);
       Matriz.setdato(13, 13, palabrax2);
       Matriz.setdato(1, 5, letrax3);
       Matriz.setdato(1, 9, letrax3);
       Matriz.setdato(5, 1, letrax3);
       Matriz.setdato(5, 5, letrax3);
       Matriz.setdato(5, 9, letrax3);
       Matriz.setdato(5, 13, letrax3);
       Matriz.setdato(9, 1, letrax3);
       Matriz.setdato(9, 5, letrax3);
       Matriz.setdato(9, 9, letrax3);
       Matriz.setdato(9, 13, letrax3);
       Matriz.setdato(13, 5, letrax3);
       Matriz.setdato(13, 9, letrax3);
       Matriz.setdato(0, 3, letrax2);
       Matriz.setdato(0, 11, letrax2);
       Matriz.setdato(2, 6, letrax2);
       Matriz.setdato(2, 8, letrax2);
       Matriz.setdato(3, 0, letrax2);
       Matriz.setdato(3, 7, letrax2);
       Matriz.setdato(3, 14, letrax2);
       Matriz.setdato(6, 2, letrax2);
       Matriz.setdato(6, 6, letrax2);
       Matriz.setdato(6, 8, letrax2);
       Matriz.setdato(6, 12, letrax2);
       Matriz.setdato(7, 3, letrax2);
       Matriz.setdato(7, 11, letrax2);
       Matriz.setdato(8, 2, letrax2);
       Matriz.setdato(8, 6, letrax2);
       Matriz.setdato(8, 8, letrax2);
       Matriz.setdato(8, 12, letrax2);
       Matriz.setdato(11, 0, letrax2);
       Matriz.setdato(11, 7, letrax2);
       Matriz.setdato(11, 14, letrax2);
       Matriz.setdato(12, 6, letrax2);
       Matriz.setdato(12, 8, letrax2);
       Matriz.setdato(14, 3, letrax2);
       Matriz.setdato(14, 11, letrax2);
       Matriz.setdato(7, 7, centro);
       Matriz.mostrarmatriz(15);
    }     
}
