

package Fichas;
import ListasSimples.*;
import javax.swing.JOptionPane;

/**
 *
 * @author emily
 */


public class bolsa {
    int[] B=new int[27];
    
    
    public void bolsa(){
        B[0]=2;//Espacio
        B[1]=9;// A
        B[2]=2;// B
        B[3]=2;// C
        B[4]=4;// D
        B[5]=12;// E
        B[6]=2;// F
        B[7]=3;// G
        B[8]=2;// H
        B[9]=9;// I
        B[10]=1;// J
        B[11]=1;// K
        B[12]=4;// L
        B[13]=2;// M
        B[14]=6;// N
        B[15]=8;// O
        B[16]=2;// P
        B[17]=1;// Q
        B[18]=6;// R
        B[19]=4;// S
        B[20]=6;// T
        B[21]=4;// U
        B[22]=2;// V
        B[23]=2;// W
        B[24]=1;// X
        B[25]=2;// Y
        B[26]=1;// Z
    }
    public void mostrar()
        {for (int i=0;i<27;i++)
            System.out.print(B[i]+" ");}
    
   
    public void Sacar(int N)
        {B[N]=B[N]-1;
        
        if (1>B[N]) 
        {JOptionPane.showMessageDialog(null,"Ya no tenemos esa ficha, prueba otra");
                }
        
        this.mostrar();
        
        
        }
    
}
