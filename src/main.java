import GUI.*;
import LeerArchivos.*;
import Matrices.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edr2394
 */
public class main 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {   
        principal p=new principal();
        p.ventana();
        MatrizTablero x=new MatrizTablero();
        x.madematriz();
}
}
