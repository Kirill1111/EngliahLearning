package com.example.newproject.Task.Tasks;

import com.example.newproject.Task.Task;

public class TaskAnswer extends Task {
    private int Answer;
    private String Text;

    TaskAnswer(String Text, String[] Answers, int Answer)
    {
        super(Answers);
        this.Answer = Answer;
        this.Text = Text;
    }


    public boolean TestAnswer(int Answer)
    {
        if(this.Answer == Answer)
            return true;
        else
            return false;
    }
}
