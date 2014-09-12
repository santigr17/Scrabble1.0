
import Listas.simplelist.SimpleList;
import wordScore.WordScore;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edr2394
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
   
    WordScore wordScore = new WordScore("palabra");
    int resultScore = wordScore.CalculateScore();
    System.out.println( resultScore);

    }
    
}
