package com.example.android.dateandtimepickers;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDatePicker(View view) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), getString(R.string.datepicker));
    }
    public void processDatePickerResult (int year, int month, int day ){
        String month_string = Integer.toString(month+1);
        String day_string = Integer.toString(day);
        String year_string = Integer.toString(year);
        String dateMessage = month_string + "/" + day_string + "/" + year_string;
        Toast.makeText(this, getString(R.string.date) + dateMessage,
                Toast.LENGTH_SHORT).show();
    }
    public void processTimePickerResult (int hour, int minute){
        String hour_string = Integer.toString(hour);
        String minute_string = Integer.toString(minute);
        String time_message = hour_string + " : " + minute_string;
        Toast.makeText(this, getString(R.string.time) + time_message,
                Toast.LENGTH_SHORT).show();
    }

    public void showTimePicker(View view) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(), getString(R.string.time_picker));
    }
}
