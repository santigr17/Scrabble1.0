/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wordScore;

import Listas.simplelist.SimpleList;

/**
 *
 * @author edr2394
 */
public class WordScore {
    String word;

    public WordScore ( String pWord){
        this.word = pWord;
    }

    public int CalculateScore(){
        return addScores(scoreCalc(wordToCharList(this.word)));
    }
    
    private SimpleList<Character> wordToCharList(String pWord){
        SimpleList <Character> charList = new SimpleList(); 
        try {
            for (int i  = 0  ; i < pWord.length() ; i ++){
                charList.append(pWord.charAt(i));
            }
            return charList;
        }catch (Exception e){
            System.out.println ("Error");
            return charList;
        }
    }
    
    private SimpleList<Integer> scoreCalc(SimpleList<Character> pCharList)
    {
        SimpleList <Character> tmpString = pCharList;
        SimpleList <Integer> scores = new SimpleList();
        while (tmpString.length() != 0){
            //try{
             
                
                String tmp = tmpString.getTailData().toString();
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
                    scores.append(1);
                }
                else if (tmp.equals("d") |
                         tmp.equals("g"))
                {
                    scores.append(2);
                }
                else if(tmp.equals("b")|
                        tmp.equals("c")|
                        tmp.equals("m")|
                        tmp.equals("p"))
                {
                    scores.append(3);
                }
                else if(tmp.equals("f")|
                        tmp.equals("h")|
                        tmp.equals("v")|
                        tmp.equals("w")|
                        tmp.equals("y"))
                {
                    scores.append(4);
                }
                else if(tmp.equals("k"))
                {
                    scores.append(5);
                }
                else if(tmp.equals("j")|
                        tmp.equals("x"))
                {
                    scores.append(8);
                }
                else if(tmp.equals("q")|
                        tmp.equals("z"))
                {
                    scores.append(10);
                }else{
                    System.out.println("Invalid word");
                }
                tmpString.cut();
            //}catch(Exception e){
              //  return scores;
            //}
        }
        return scores;
    }
    private int addScores(SimpleList<Integer> pScores){
        
        int tmp = 0;
        while (pScores.length() != 0){
            int tmp2 = pScores.getTailData();
            //System.out.println(tmp2);
            tmp += tmp2;            
            tmp2 = pScores.cut();
        }
        return tmp;
    }
}

