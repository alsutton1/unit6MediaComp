import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

public class Dot
{
    private int locateX;
    private int locateY;
    public Dot(int x, int y)
    {
        locateX = x;
        locateY = y;
    }
    
    public void draw(Graphics2D g2)
    {
        g2.setColor(Color.BLACK);
        int width = locateX + 1;
        int height = locateY + 1;
        
        Rectangle dot1 = new Rectangle(locateX, locateY, width, height);
        g2.fill(dot1);        
    }
}
