package sg.edu.rp.c346.id22022096.datetimeapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button dispdate;
    Button disptime;
    TextView textView;
    Button reset;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dp = findViewById(R.id.date);
        tp = findViewById(R.id.time);
        dispdate = findViewById(R.id.showdate);
        disptime = findViewById(R.id.showtime);
        textView = findViewById(R.id.textView);
        reset = findViewById(R.id.reset);

        disptime.setOnClickListener(v -> {
            int disphour = tp.getHour();
            int dispmin= tp.getMinute();

            textView.setText("Time is "+disphour + ":" + dispmin);

        });

        dispdate.setOnClickListener(v -> {
            int year = dp.getYear();
            int month = dp.getMonth();
            int day = dp.getDayOfMonth();
            
            textView.setText(String.format("Date is " + day+"/"+month+"/"+year));
        });

        reset.setOnClickListener(view -> {
            dp.updateDate(2020,0,1);
            tp.setHour(12);
            tp.setMinute(00);

        });

    }
}