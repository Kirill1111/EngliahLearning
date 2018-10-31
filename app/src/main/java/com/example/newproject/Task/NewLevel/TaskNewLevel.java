package com.example.newproject.Task.NewLevel;

import com.example.newproject.Task.Tasks.TaskAnswer;

public class TaskNewLevel {
    private TaskAnswer taskList[];
    private int AnswerID = 0;

    public TaskNewLevel(TaskAnswer[] taskList) {
        this.taskList = taskList;
    }

    public TaskAnswer GetTask() {
        TaskAnswer task = taskList[AnswerID];
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
