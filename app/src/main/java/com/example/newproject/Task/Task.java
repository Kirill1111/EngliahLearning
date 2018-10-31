package com.example.newproject.Task;

public class Task {
    private String[] Answers;
    private int Answer;
    private String Text;

    public Task(String Text , String[] Answers , int Answer)
    {
        this.Text = Text;
        this.Answer = Answer;
        this.Answers = Answers;
    }

    public boolean TestAnswer(int Answer)
    {
        if(this.Answer == Answer)
            return true;
        else
            return false;
    }

}
