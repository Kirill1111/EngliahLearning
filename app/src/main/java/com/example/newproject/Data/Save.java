package com.example.newproject.Data;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.Button;
import android.widget.Toast;

import com.example.newproject.MainActivity;
import com.example.newproject.Statistic.WorkTime.Hours;

public class Save {


    static SharedPreferences  myPreferences;

    public static void  Save(String Key , String value) {
        SharedPreferences.Editor editor = myPreferences.edit();
        editor.putString(Key,value);
        editor.apply();
    }

    public static String load(String Key) {
        return myPreferences.getString(Key, "0");
    }
}
