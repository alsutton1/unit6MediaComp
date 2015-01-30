
public class ComboTest
{
    public static void main(String args[])
    {
        ComboLock combo = new ComboLock(1,2,3);

        // test if all are correct turns
        combo.reset();
        combo.turnRight(1);
        combo.turnLeft(39);
        combo.turnRight(1);
        combo.reset();

        boolean opens = combo.open();

        if (opens == true)
        {
            System.out.println("The lock has opened!");
        }
        else
        {
            System.out.println("The lock is still closed.");
        }
        
    }
}
