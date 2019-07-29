package com.example.timepicker_datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click(View view)
    {
        Calendar c=Calendar.getInstance();
        final int h=c.get(Calendar.HOUR);
        final int m=c.get(Calendar.MINUTE);

        TimePickerDialog.OnTimeSetListener td=new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int i, int i1) {
                String time=h+":"+m+"-";
                Toast.makeText(MainActivity.this,time,Toast.LENGTH_SHORT).show();
            }
        };
        TimePickerDialog tp=new TimePickerDialog(this,td,h,m,true);
        tp.show();
    }
}
