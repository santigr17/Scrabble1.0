package LeerArchivos;
import java.util.Scanner;
import wordScore.WordScore;
/**
 *
 * @author edr2394
 */
public class ValidacionPts
{
    public static void validepts ()
    {
    Lectura l=new Lectura();
    Scanner dato=new Scanner(System.in);
    String palabra;
    System.out.print("Ingrese la palabra a buscar\n");
    palabra=dato.nextLine();
    if (l.Lectura(palabra))
    {
            WordScore wordScore = new WordScore(palabra);
            int resultScore = wordScore.CalculateScore();
            System.out.println( resultScore);
    }
    }
}