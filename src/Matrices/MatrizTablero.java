/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrices;
import static constants.Constants.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author edr2394
 */
public class MatrizTablero 
{
    public void madematriz()
    {
        int Matriz [][] = new int [15][15];
        for(int i=0;i<=14;i++)
        {
            for(int j=0;j<=14;j++)
            {
                Matriz[7][7] = centro;
                Matriz[0][0] = palabrax3;
                Matriz[0][7] = palabrax3;
                Matriz[0][14] = palabrax3;
                Matriz[7][0] = palabrax3;
                Matriz[7][14] = palabrax3;
                Matriz[14][0] = palabrax3;
                Matriz[14][7] = palabrax3;
                Matriz[14][14] = palabrax3;
                Matriz[1][13] = palabrax2;
                Matriz[2][12] = palabrax2;
                Matriz[3][11] = palabrax2;
                Matriz[4][10] = palabrax2;
                Matriz[10][4] = palabrax2;
                Matriz[11][3] = palabrax2;
                Matriz[12][2] = palabrax2;
                Matriz[13][1] = palabrax2;
                Matriz[1][1] = palabrax2;
                Matriz[2][2] = palabrax2;
                Matriz[3][3] = palabrax2;
                Matriz[4][4] = palabrax2;
                Matriz[10][10] = palabrax2;
                Matriz[11][11] = palabrax2;
                Matriz[12][12] = palabrax2;
                Matriz[13][13] = palabrax2;
                Matriz[1][5] = letrax3;
                Matriz[1][9] = letrax3;
                Matriz[5][1] = letrax3;
                Matriz[5][5] = letrax3;
                Matriz[5][9] = letrax3;
                Matriz[5][13] = letrax3;
                Matriz[9][1] = letrax3;
                Matriz[9][5] = letrax3;
                Matriz[9][9] = letrax3;
                Matriz[9][13] = letrax3;
                Matriz[13][5] = letrax3;
                Matriz[13][9] = letrax3;
                Matriz[0][3] = letrax2;
                Matriz[0][11] = letrax2;
                Matriz[2][6] = letrax2;
                Matriz[2][8] = letrax2;
                Matriz[3][0] = letrax2;
                Matriz[3][7] = letrax2;
                Matriz[3][14] = letrax2;
                Matriz[6][2] = letrax2;
                Matriz[6][6] = letrax2;
                Matriz[6][8] = letrax2;
                Matriz[6][12] = letrax2;
                Matriz[7][3] = letrax2;
                Matriz[7][11] = letrax2;
                Matriz[8][2] = letrax2;
                Matriz[8][6] = letrax2;
                Matriz[8][8] = letrax2;
                Matriz[8][12] = letrax2;
                Matriz[11][0] = letrax2;
                Matriz[11][7] = letrax2;
                Matriz[11][13] = letrax2;
                Matriz[12][6] = letrax2;
                Matriz[12][8] = letrax2;
                Matriz[14][3] = letrax2;
                Matriz[14][11] = letrax2;
                Matriz[i][j]= simple;
                
            }
        }
        System.out.println("\n Matriz 15 x 15 \n");
        for(int i=0;i<=14;i++)
        {
            for(int j=0;j<=14;j++)
                
                System.out.print(Matriz[i][j] + "\t");
                System.out.println();
            
        }
    }
    
}
