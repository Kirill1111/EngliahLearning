package com.example.newproject.Statistic.WorkTime;

import com.example.newproject.Data.Save;
import com.example.newproject.Task.Task;
import com.example.newproject.Task.Tasks.TaskAnswer;

import java.util.Calendar;

public class WorkTimePresenter   {

    private static Hours hours = new Hours(0);
    private  static Hours StartTime ;
    private static String Save_Key = "HoursStatistic";

    public static Hours GetTimeAll() {
        return hours;
    }

    public static Hours AddTime(Hours hour) {
        return Hours.Add(hours , hour);
    }

    public static void Load()
    {
        StartTime = new Hours(Calendar.getInstance().get(Calendar.MILLISECOND));
        hours = new Hours(Long.parseLong(Save.load(Save_Key)));
    }

    public static void Save()
    {
        Hours EndTime = new Hours(Calendar.getInstance().get(Calendar.MILLISECOND));
        AddTime(Hours.Sub(EndTime , StartTime));
        Save.Save(Save_Key,hours.toString());
    }
}
