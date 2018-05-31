package com.example.hwamok.mju_classroom_v10;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;


public class ReservationActivity extends AppCompatActivity{
    ImageView btnSelectDate, btnSelectTime;

    static final int DATE_DIALOG_ID=0;
    static final int TIME_DIALOG_ID=1;

    public int year,month,day,hour,minute;
    private int mYear, mMonth, mDay, mHour, mMinute;

    public ReservationActivity()    {
        final Calendar cc = Calendar.getInstance();
        mYear = cc.get(Calendar.YEAR);
        mMonth = cc.get(Calendar.MONTH);
        mDay = cc.get(Calendar.DAY_OF_MONTH);
        mHour = cc.get(Calendar.HOUR_OF_DAY);
        mMinute = cc.get(Calendar.MINUTE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);

        btnSelectDate = (ImageView) findViewById(R.id.btn1);
        btnSelectTime = (ImageView) findViewById(R.id.btn2);

        btnSelectDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(DATE_DIALOG_ID);
            }
        });
        btnSelectTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(TIME_DIALOG_ID);
            }
        });
    }
    private DatePickerDialog.OnDateSetListener mDateSetListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int yearSelected, int monthOfYear, int dayOfMonth) {
            year = yearSelected;
            month = monthOfYear;
            day = dayOfMonth;

            Toast.makeText(getApplicationContext(),"date : "+year+"_"+(month+1)+"_"+day,Toast.LENGTH_SHORT).show();
        }
    };

    private TimePickerDialog.OnTimeSetListener mTimeSEtListener = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int min) {
            hour = hourOfDay;
            minute = min;

            Toast.makeText(getApplicationContext(),"time : "+hour+"_"+minute,Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    protected Dialog onCreateDialog(int id)    {
        switch (id)        {
            case DATE_DIALOG_ID:
                return new DatePickerDialog(this,mDateSetListener,mYear,mMonth,mDay);

            case TIME_DIALOG_ID:
                return new TimePickerDialog(this,mTimeSEtListener,mHour,mMinute,false);
        }
        return null;
    }
}