import GUI.*;
import LeerArchivos.*;
import Matrices.*;
import LeerArchivos.ValidacionPts;
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
        Coords punto = new Coords();
        punto.getCoord();
        principal P=new principal();
        P.pintar();
        MatrizTablero x=new MatrizTablero();
        x.madematriz();
        ValidacionPts val = new ValidacionPts();
    }
}

