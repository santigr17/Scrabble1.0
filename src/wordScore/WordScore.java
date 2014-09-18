/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordScore;
import ListasSimples.ListaSimple;
/**
 *
 * @author edr2394
 */
public class WordScore 
{
    String word;

    public WordScore ( String pWord)
    {
        this.word = pWord;
    }

    public int CalculateScore()
    {
        return addScores(scoreCalc(wordToCharList(this.word)));
    }
    
    private ListaSimple<Character> wordToCharList(String pWord){
        ListaSimple <Character> charList = new ListaSimple(); 
        try 
        {
            for (int i  = 0  ; i < pWord.length() ; i ++)
            {
                charList.agregar(pWord.charAt(i));
            }
            return charList;
        }
        catch (Exception e){
            System.out.println ("Error");
            return charList;
        }
    }
    
    private ListaSimple<Integer> scoreCalc(ListaSimple<Character> pCharList)
    {
        ListaSimple <Character> tmpString = pCharList;
        ListaSimple <Integer> scores = new ListaSimple();
        while (tmpString.tamaño() != 0){
            //try{
             
                
                String tmp = tmpString.cola().toString();
                if (tmp.equals("a")| 
                       tmp.equals("e") |
                        tmp.equals("i") |
                        tmp.equals("o") |
                        tmp.equals("u") |
                        tmp.equals("n") |
                        tmp.equals("r") |
                        tmp.equals("l") |
                        tmp.equals("t") |
                        tmp.equals("s"))
                {
                    scores.agregar(1);
                }
                else if (tmp.equals("d") |
                         tmp.equals("g"))
                {
                    scores.agregar(2);
                }
                else if(tmp.equals("b")|
                        tmp.equals("c")|
                        tmp.equals("m")|
                        tmp.equals("p"))
                {
                    scores.agregar(3);
                }
                else if(tmp.equals("f")|
                        tmp.equals("h")|
                        tmp.equals("v")|
                        tmp.equals("w")|
                        tmp.equals("y"))
                {
                    scores.agregar(4);
                }
                else if(tmp.equals("k"))
                {
                    scores.agregar(5);
                }
                else if(tmp.equals("j")|
                        tmp.equals("x"))
                {
                    scores.agregar(8);
                }
                else if(tmp.equals("q")|
                        tmp.equals("z"))
                {
                    scores.agregar(10);
                }
                else
                {
                    System.out.println("Invalid word");
                }
                tmpString.cortar();
        }
        return scores;
    }
    private int addScores(ListaSimple<Integer> pScores)
    { 
        int tmp = 0;
        while (pScores.tamaño() != 0)
        {
            int tmp2 = pScores.cola();
            tmp += tmp2;            
            tmp2 = pScores.cortar();
        }
        return tmp;
    }
}

