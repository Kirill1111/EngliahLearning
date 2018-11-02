package com.example.newproject;


import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.newproject.Data.DataBaseHelper;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;

public class TaskAnswer extends Fragment {

    private DataBaseHelper mDBHelper;
    private SQLiteDatabase mDb;
    TextView qestion;

    Button Answer1;
    Button Answer2;
    Button Answer3;
    Button Answer4;

    Button Next;
    Button Back;

    TaskAnswer task;
    int UserAnsver;
    int TrueAnswer;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_task_answer, null);

        qestion = (TextView) view.findViewById(R.id.b7);

        Answer1 = (Button) view.findViewById(R.id.b1);
        Answer2 = (Button) view.findViewById(R.id.b2);
        Answer3 = (Button) view.findViewById(R.id.b3);
        Answer4 = (Button) view.findViewById(R.id.b4);

        Next = (Button) view.findViewById(R.id.b6);
        Back = (Button) view.findViewById(R.id.b5);

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(UserAnsver == TrueAnswer) {
                   Toast toast = Toast.makeText(getActivity(),
                           "Пора покормить кота!",
                           Toast.LENGTH_SHORT);
                   toast.setGravity(Gravity.CENTER, 0, 0);
                   toast.show();
               }
            }
        });

        Answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserAnsver = 1;
            }
        });
        Answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserAnsver = 2;
            }
        });

        Answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserAnsver = 3;
            }
        });

        Answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserAnsver = 4;
            }
        });


        Init();
        return view;
    }

    private void Init() {
        mDBHelper = new DataBaseHelper(getActivity());

        try {
            mDBHelper.updateDataBase();
        } catch (IOException mIOException) {
            throw new Error("UnableToUpdateDatabase");
        }

        mDb = mDBHelper.getWritableDatabase();

        Cursor cursor = mDb.rawQuery("SELECT * FROM TaskAnswersList", null);
        cursor.move(1);

        qestion.setText(cursor.getString(1));
        Answer1.setText(cursor.getString(2));
        Answer2.setText(cursor.getString(3));
        Answer3.setText(cursor.getString(4));
        Answer4.setText(cursor.getString(5));

        TrueAnswer = Integer.parseInt(cursor.getString(6));

    }

}
