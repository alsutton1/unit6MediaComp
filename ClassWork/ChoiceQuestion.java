
public class ChoiceQuestion extends Question
{
    private int numberOfChoices;
    
    public ChoiceQuestion()
    {
        super();
        numberOfChoices = 0;
    }
    
    //The question should be formatted as:
    //How many sides in a square?
    //1) 2 sides
    //2) 3 sides
    //3) 4 sides (correct)
    public void addChoice(String choice, boolean correct)
    {
        numberOfChoices++;
        
        super.addText("/n" + numberOfChoices + ") " + choice);
        
        if(correct)
        {
            String answerString = "" + numberOfChoices;
            super.setAnswer(answerString);
        }
    }
}
