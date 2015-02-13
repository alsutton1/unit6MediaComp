import java.awt.event.MouseListener;
import javax.swing.JFrame;
import java.awt.event.MouseEvent;
import java.awt.Graphics2D;
import java.awt.Graphics;
import javax.swing.JComponent;

public class Triangle_GUI extends JComponent
{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 300;
    Graphics2D g2;
    JFrame frame;
    
    
    public Triangle_GUI()
    {
        JFrame frame = new JFrame();

        Mouse mouse = new Mouse();
        frame.add(this);
        this.addMouseListener(mouse);
        
        
        
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
    }

    public class Mouse implements MouseListener
    {
        private int xPosition;
        private int yPosition;
        public void mouseClicked(MouseEvent e)
        {
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
            xPosition = e.getX();
            yPosition = e.getY();
            drawDot(xPosition, yPosition);
        }
    }
    
    public void drawDot(int x, int y)
    {
        int nowX = x;
        int nowY = y;
        
        Dot dot = new Dot(nowX, nowY);
        dot.draw(g2);
    }
    
    public static void main(String[] args)
    {
        Triangle_GUI viewer = new Triangle_GUI();
    }
}

        