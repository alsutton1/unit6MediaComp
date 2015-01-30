


public class Question
{  
    private String text;
    private String answer;
    public Question()
    {
        text = "";
        answer = "";
    }
    
    public boolean checkAnswer(String response)
    {
        return response.equals(answer);
    }
    
    public void addText(String addedText)
    {
        text += addedText;
    }
    
    public void setText(String questionText)
    {
        text = questionText;
    }
    
    public void setAnswer(String answerText)
    {
        answer = answerText;
    }
    
    public void display()
    {
        System.out.println(text);
    }
}
