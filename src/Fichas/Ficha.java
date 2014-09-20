
package Fichas;

/**
 *
 * @author Santi
 */

public class Ficha
{
    int valorPunto=0;
    String valorLetra="";
    int numFichas=0;
    
    public Ficha(int puntos, int fichas,String letra)
    {
        int valorPunto=puntos;
        String valorLetra=letra;
        int numFichas=fichas;
    }
    public void UsarFicha(int menos)
    {
        int temp=numFichas-menos;
        int numFichas=temp;
    }
    
    public int getPunto()
    {
        return this.valorPunto;
    }
    public String getLetra()
    {
        return this.valorLetra;
    }
         
}
