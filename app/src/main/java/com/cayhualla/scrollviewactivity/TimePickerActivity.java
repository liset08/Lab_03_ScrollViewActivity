package com.cayhualla.scrollviewactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class TimePickerActivity extends AppCompatActivity {


    private TimePicker timePicker;
    private TextView displayTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);

    displayTime=(TextView)findViewById(R.id.textView);
    timePicker=(TimePicker)findViewById(R.id.timePicker);

    timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
        @Override
        public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
            displayTime.setText("Time: " +hourOfDay + ":" +minute);

        }
    });

        Calendar now=Calendar.getInstance();
        int hour=now.get(Calendar.HOUR_OF_DAY);
        int minute=now.get(Calendar.MINUTE);

        timePicker.setCurrentHour(hour);
        timePicker.setCurrentMinute(minute);


    }

    public void pick(View view){
        displayTime.setText("Picked: " + timePicker.getCurrentHour()+":"+timePicker.getCurrentMinute());
    }
}
