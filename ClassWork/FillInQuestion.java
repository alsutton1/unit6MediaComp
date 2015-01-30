import java.util.Scanner;

public class FillInQuestion extends Question
{
    //sample question: "The inventor of Java was _James Gosling_"
    //parse the specific question into a question to display card and check the answer
    //question: "The inventor of Java was __"
    //answer: "James Gosling"
    
    public FillInQuestion()
    {
    }
    
    public void setText(String questionText)
    {
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter("_");
        String question = parser.next();
        String answer = parser.next();
        question += "___" + parser.next();
        
        super.setText(question);
        super.setAnswer(question);
    }
}
