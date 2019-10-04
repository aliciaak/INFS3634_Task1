package com.example.infs3634_task1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button12, button24;
    private ConstraintLayout
            parent_syd, parent_nyc, parent_tokyo, parent_cairo, parent_hk,
            parent_jkt, parent_ldn, parent_madrid, parent_rome, parent_seoul;
    private ImageView
            iv_syd, iv_nyc, iv_tokyo, iv_cairo, iv_hk,
            iv_jkt, iv_ldn, iv_madrid, iv_rome, iv_seoul;
    private TextView
            tv_syd, tv_nyc, tv_tokyo, tv_cairo, tv_hk,
            tv_jkt, tv_ldn, tv_madrid, tv_rome, tv_seoul;
    private TextClock
            time_syd, time_nyc, time_tokyo, time_cairo, time_hk,
            time_jkt, time_ldn, time_madrid, time_rome, time_seoul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //buttons to trigger 12-hour format or 24-hour format
        button12 = findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                time_syd.setFormat12Hour("hh:mm:ss a");
                time_nyc.setFormat12Hour("hh:mm:ss a");
                time_tokyo.setFormat12Hour("hh:mm:ss a");
                time_cairo.setFormat12Hour("hh:mm:ss a");
                time_hk.setFormat12Hour("hh:mm:ss a");
                time_rome.setFormat12Hour("hh:mm:ss a");
                time_jkt.setFormat12Hour("hh:mm:ss a");
                time_ldn.setFormat12Hour("hh:mm:ss a");
                time_madrid.setFormat12Hour("hh:mm:ss a");
                time_seoul.setFormat12Hour("hh:mm:ss a");
            }});

        button24 = findViewById(R.id.button24);
        button24.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                time_syd.setFormat12Hour("HH:mm:ss a");
                time_nyc.setFormat12Hour("HH:mm:ss a");
                time_tokyo.setFormat12Hour("HH:mm:ss a");
                time_cairo.setFormat12Hour("HH:mm:ss a");
                time_hk.setFormat12Hour("HH:mm:ss a");
                time_rome.setFormat12Hour("HH:mm:ss a");
                time_jkt.setFormat12Hour("HH:mm:ss a");
                time_ldn.setFormat12Hour("HH:mm:ss a");
                time_madrid.setFormat12Hour("HH:mm:ss a");
                time_seoul.setFormat12Hour("HH:mm:ss a");
            }
        });

        //SYDNEY, AUSTRALIA
        parent_syd = findViewById(R.id.parent_syd);
        tv_syd = parent_syd.findViewById(R.id.city_name);
        tv_syd.setText(getResources().getString(R.string.Sydney));

        iv_syd = parent_syd.findViewById(R.id.city_img);
        iv_syd.setImageResource(R.drawable.sydney);

        time_syd = parent_syd.findViewById(R.id.city_time);
        time_syd.setTimeZone("Australia/Sydney");

        //NEW YORK, USA
        parent_nyc = findViewById(R.id.parent_nyc);
        tv_nyc = parent_nyc.findViewById(R.id.city_name);
        tv_nyc.setText(getResources().getString(R.string.New_York));

        iv_nyc = parent_nyc.findViewById(R.id.city_img);
        iv_nyc.setImageResource(R.drawable.nyc);

        time_nyc = parent_nyc.findViewById(R.id.city_time);
        time_nyc.setTimeZone("America/New_York");

        //TOKYO, JAPAN
        parent_tokyo = findViewById(R.id.parent_tokyo);
        tv_tokyo = parent_tokyo.findViewById(R.id.city_name);
        tv_tokyo.setText(getResources().getString(R.string.Tokyo));

        iv_tokyo = parent_tokyo.findViewById(R.id.city_img);
        iv_tokyo.setImageResource(R.drawable.tokyo);

        time_tokyo = parent_tokyo.findViewById(R.id.city_time);
        time_tokyo.setTimeZone("Asia/Tokyo");

        //CAIRO, EGYPT
        parent_cairo = findViewById(R.id.parent_cairo);
        tv_cairo = parent_cairo.findViewById(R.id.city_name);
        tv_cairo.setText(getResources().getString(R.string.Cairo));

        iv_cairo = parent_cairo.findViewById(R.id.city_img);
        iv_cairo.setImageResource(R.drawable.cairo);

        time_cairo = parent_cairo.findViewById(R.id.city_time);
        time_cairo.setTimeZone("Africa/Cairo");

        //HONG KONG
        parent_hk = findViewById(R.id.parent_hk);
        tv_hk = parent_hk.findViewById(R.id.city_name);
        tv_hk.setText(getResources().getString(R.string.Hong_Kong));

        iv_hk = parent_hk.findViewById(R.id.city_img);
        iv_hk.setImageResource(R.drawable.hongkong);

        time_hk = parent_hk.findViewById(R.id.city_time);
        time_hk.setTimeZone("Asia/Hong_Kong");

        //JAKARTA, INDONESIA
        parent_jkt = findViewById(R.id.parent_jkt);
        tv_jkt = parent_jkt.findViewById(R.id.city_name);
        tv_jkt.setText(getResources().getString(R.string.Jakarta));

        iv_jkt = parent_jkt.findViewById(R.id.city_img);
        iv_jkt.setImageResource(R.drawable.jakarta);

        time_jkt = parent_jkt.findViewById(R.id.city_time);
        time_jkt.setTimeZone("Asia/Jakarta");

        //LONDON, UK
        parent_ldn = findViewById(R.id.parent_ldn);
        tv_ldn = parent_ldn.findViewById(R.id.city_name);
        tv_ldn.setText(getResources().getString(R.string.London));

        iv_ldn = parent_ldn.findViewById(R.id.city_img);
        iv_ldn.setImageResource(R.drawable.london);

        time_ldn = parent_ldn.findViewById(R.id.city_time);
        time_ldn.setTimeZone("Europe/London");

        //MADRID, SPAIN
        parent_madrid = findViewById(R.id.parent_madrid);
        tv_madrid = parent_madrid.findViewById(R.id.city_name);
        tv_madrid.setText(getResources().getString(R.string.Madrid));

        iv_madrid = parent_madrid.findViewById(R.id.city_img);
        iv_madrid.setImageResource(R.drawable.madrid);

        time_madrid = parent_madrid.findViewById(R.id.city_time);
        time_madrid.setTimeZone("Europe/Madrid");

        //ROME, ITALY
        parent_rome = findViewById(R.id.parent_rome);
        tv_rome = parent_rome.findViewById(R.id.city_name);
        tv_rome.setText(getResources().getString(R.string.Rome));

        iv_rome = parent_rome.findViewById(R.id.city_img);
        iv_rome.setImageResource(R.drawable.italy);

        time_rome = parent_rome.findViewById(R.id.city_time);
        time_rome.setTimeZone("Europe/Rome");

        //SEOUL, SOUTH KOREA
        parent_seoul = findViewById(R.id.parent_seoul);
        tv_seoul = parent_seoul.findViewById(R.id.city_name);
        tv_seoul.setText(getResources().getString(R.string.Seoul));

        iv_seoul = parent_seoul.findViewById(R.id.city_img);
        iv_seoul.setImageResource(R.drawable.seoul);

        time_seoul = parent_seoul.findViewById(R.id.city_time);
        time_seoul.setTimeZone("Asia/Seoul");
    }
}
