package Fichas;
public class Logicbolsa extends bolsa
{
  bolsa bolsa= new bolsa();
  public void bolsainicio(int marcador1)
    {
        if (bolsa.tamaño() == 0)
        {
        bolsa.rellenarbolsa();
        }
        if (bolsa.tamaño() != 0)
        {
            if (marcador1 == 1)
            {
                bolsa.Sacar(bolsa.random());
                bolsa.mostrar();
            }
            if (marcador1 == 4)
            {
               bolsa.Sacar(bolsa.random());
               bolsa.meter(bolsa.random());
               bolsa.mostrar();
            }
        }
    }
}
