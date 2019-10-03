package com.example.infs3634_task1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button12, button24;
    private ConstraintLayout parent_syd, parent_nyc, parent_tokyo;
    private ImageView iv_syd, iv_nyc, iv_tokyo;
    private TextView tv_syd, tv_nyc, tv_tokyo;
    private TextClock time_syd, time_nyc, time_tokyo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //SYDNEY
        parent_syd = (ConstraintLayout) findViewById(R.id.parent_syd);
        tv_syd = (TextView) parent_syd.findViewById(R.id.city_name);
        tv_syd.setText("Sydney");

        iv_syd = (ImageView) parent_syd.findViewById(R.id.city_img);
        iv_syd.setImageResource(R.drawable.sydney);

        time_syd = (TextClock) parent_syd.findViewById(R.id.city_time);
        time_syd.setTimeZone("Australia/Sydney");

        //NYC
        parent_nyc = (ConstraintLayout) findViewById(R.id.parent_nyc);
        tv_nyc = (TextView) parent_nyc.findViewById(R.id.city_name);
        tv_nyc.setText("New York");

        iv_nyc = (ImageView) parent_nyc.findViewById(R.id.city_img);
        iv_nyc.setImageResource(R.drawable.nyc);

        time_nyc = (TextClock) parent_nyc.findViewById(R.id.city_time);
        time_nyc.setTimeZone("America/New_York");

        //TOKYO
        parent_tokyo = findViewById(R.id.parent_tokyo);
        tv_tokyo = (TextView) parent_tokyo.findViewById(R.id.city_name);
        tv_tokyo.setText("Tokyo");

        iv_tokyo = (ImageView) parent_tokyo.findViewById(R.id.city_img);
        iv_tokyo.setImageResource(R.drawable.tokyo);

        time_tokyo = (TextClock) parent_tokyo.findViewById(R.id.city_time);
        time_tokyo.setTimeZone("Asia/Tokyo");
    }
}
