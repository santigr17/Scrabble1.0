import static constants.Constants.DICTIONARY_PATH;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emily
 */
public class Lectura {
    public static boolean Lectura(String pString)
        {
        
            try
            {
                File archivo=new File(DICTIONARY_PATH);
                BufferedReader entrada;          
                entrada=new BufferedReader(new FileReader(archivo));
                String Linea;
                while(entrada.ready())
                { 
                    Linea=entrada.readLine();
                    if(pString.equals(Linea))
                    { 
                        return true;
                    }
                }
                return false;
            }
        catch(IOException error)
            {error.printStackTrace();
                return false;
            }
            

        }
}
