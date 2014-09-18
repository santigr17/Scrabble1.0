package GUI;
import java.awt.MouseInfo;
import java.awt.Point;
/**
 *
 * @author edr2394
 */
public class Coords 
{
    public void getCoord()
    {
       Point x = MouseInfo.getPointerInfo().getLocation();
       System.out.println("x: "+x.x+" | y: "+x.y);
    }
    
}
