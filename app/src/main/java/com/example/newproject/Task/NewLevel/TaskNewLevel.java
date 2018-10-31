package com.example.newproject.Task.NewLevel;

import com.example.newproject.Task.Task;
import com.example.newproject.Task.Tasks.TaskAnswer;

public class TaskNewLevel {
    private Task taskList[];
    private int AnswerID = 0;

    public TaskNewLevel(Task[] taskList) {
        this.taskList = taskList;
    }

    public Task GetTask() {
        Task task = taskList[AnswerID];
        AnswerID++;
        return task;
    }

    public boolean TestAnswer(int Answer) {
        if (taskList[AnswerID].TestAnswer(Answer) == true)
            return true;
        else
            return false;
    }
}
