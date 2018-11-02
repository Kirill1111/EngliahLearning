package com.example.newproject.Task.Tasks;

import com.example.newproject.Task.Task;

public class TaskTFNS extends Task {
    private int[] Answer;
    private String Text;

    public TaskTFNS(String Text, String[] Answers, int[] Answer)
    {
        super(Answers);
        this.Answer = Answer;
        this.Text = Text;
    }

    public boolean TestAnswer(int[] Answer)
    {
        for(int i = 0 ; i < this.Answer.length ; i++)
        {
            if(this.Answer[i] != Answer[i])
                return false;
        }
            return true;
    }
}
