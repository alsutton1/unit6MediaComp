import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Graphics2D;
import java.awt.Graphics;

public class TriangleComponent extends JComponent
{
    private Point2D points[];
    private int numPoints;
    
    private static final int MAX_POINTS = 3;
    
    public TriangleComponent()
    {
        this.points = new Point2D[MAX_POINTS];
        this.numPoints = 0;
        this.addMouseListener(new Mouse());
    }
    
    public void setPoint(int x, int y)
    {
        if (this.numPoints < 3)
        {
            this.points[numPoints] = new Point2D.Double(x,y);
            this.numPoints++;
        }
        else
        {
            this.numPoints = 0;
        }
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        
        if (this.numPoints > 0)
        {
            g2.draw(new Ellipse2D.Double(this.points[0].getX(), this.points[0].getY(), 1 ,1));
        }
        if (this.numPoints > 1)
        {
            g2.draw(new Line2D.Double(this.points[0], this.points[1]));
        }
        if (this.numPoints > 2)
        {
            g2.draw(new Line2D.Double(this.points[1], this.points[2]));
            g2.draw(new Line2D.Double(this.points[0], this.points[2]));
        }
    }
    
    public class Mouse implements MouseListener
    {
        public void mouseClicked(MouseEvent e)
        {
            setPoint(e.getX(), e.getY());
        }

        public void mouseEntered(MouseEvent e)
        {
        }

        public void mouseExited(MouseEvent e)
        {
        }

        public void mousePressed(MouseEvent e)
        {
        }

        public void mouseReleased(MouseEvent e)
        {
        }
    }
}