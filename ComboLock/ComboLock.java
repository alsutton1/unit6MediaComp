
public class ComboLock
{
    private int comboNum1;
    private int comboNum2;
    private int comboNum3;
    private boolean ifMatch = true;

    private int currNum;
    private int turns;

    public ComboLock( int secret1, int secret2, int secret3 ) 
    {
        comboNum1 = secret1;
        comboNum2 = secret2;
        comboNum3 = secret3;
    }

    public void reset()
    {
        currNum = 0;
        turns = 0;
        ifMatch = true;
    }

    public void turnLeft( int ticks ) 
    {
        currNum += (40 - ticks);
        if (ifMatch == true)
        {
            if (currNum != comboNum2)
            {
                ifMatch = false;
            }
        }
        turns++;
    }

    public void turnRight( int ticks ) 
    {
        currNum += ticks;
        if (turns == 0)
        {
            if (currNum != comboNum1)
            {
                ifMatch = false;
            }
        }
        else if (turns == 2)
        {
            if (currNum != comboNum3)
            {
                ifMatch = false;
            } 
        }
        turns++;
    }

    public boolean open() 
    {
        return ifMatch;
    }
}