import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;

public class ButtonViewer
{
    private static final int FRAME_WIDTH = 100;
    private static final int FRAME_HEIGHT = 60;

    JFrame frame;
    JPanel panel;
    JButton buttonA, buttonB;
    JLabel label;

    public ButtonViewer()
    {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton buttonA = new JButton("(A.)");
        panel.add(buttonA);

        JButton buttonB = new JButton("(B.)");
        panel.add(buttonB);

        JLabel label = new JLabel("No button clicked");

        frame.add(label);
        frame.add(panel);

        ActionListener listener = new ClickListener();
        buttonA.addActionListener(listener);
        buttonB.addActionListener(listener);

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            label.setText("BUTTON " + event.getActionCommand() + "!!!");
        }
    }
    
    public static void main(String[] args)
    {
        ButtonViewer viewer = new ButtonViewer();
    }
}
