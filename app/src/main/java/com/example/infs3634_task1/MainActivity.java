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
    private ConstraintLayout parent_syd, parent_nyc, parent_tokyo, parent_cairo, parent_hk, parent_italy, parent_jkt, parent_ldn, parent_madrid, parent_seoul;
    private ImageView iv_syd, iv_nyc, iv_tokyo, iv_cairo, iv_hk, iv_italy, iv_jkt, iv_ldn, iv_madrid, iv_seoul;
    private TextView tv_syd, tv_nyc, tv_tokyo, tv_cairo, tv_hk, tv_italy, tv_jkt, tv_ldn, tv_madrid, tv_seoul;
    private TextClock time_syd, time_nyc, time_tokyo, time_cairo, time_hk, time_italy, time_jkt, time_ldn, time_madrid, time_seoul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //buttons to trigger 12-hour format or 24-hour format
        button12 = (Button) findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                time_syd.setFormat12Hour("hh:mm:ss a");
                time_nyc.setFormat12Hour("hh:mm:ss a");
                time_tokyo.setFormat12Hour("hh:mm:ss a");
                time_cairo.setFormat12Hour("hh:mm:ss a");
                time_hk.setFormat12Hour("hh:mm:ss a");
                time_italy.setFormat12Hour("hh:mm:ss a");
                time_jkt.setFormat12Hour("hh:mm:ss a");
                time_ldn.setFormat12Hour("hh:mm:ss a");
                time_madrid.setFormat12Hour("hh:mm:ss a");
                time_seoul.setFormat12Hour("hh:mm:ss a");
            }
        });

        button24 = (Button) findViewById(R.id.button24);
        button24.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                time_syd.setFormat12Hour("HH:mm:ss a");
                time_nyc.setFormat12Hour("HH:mm:ss a");
                time_tokyo.setFormat12Hour("HH:mm:ss a");
                time_cairo.setFormat12Hour("HH:mm:ss a");
                time_hk.setFormat12Hour("HH:mm:ss a");
                time_italy.setFormat12Hour("HH:mm:ss a");
                time_jkt.setFormat12Hour("HH:mm:ss a");
                time_ldn.setFormat12Hour("HH:mm:ss a");
                time_madrid.setFormat12Hour("HH:mm:ss a");
                time_seoul.setFormat12Hour("HH:mm:ss a");
            }
        });

        //SYDNEY, AUSTRALIA
        parent_syd = (ConstraintLayout) findViewById(R.id.parent_syd);
        tv_syd = (TextView) parent_syd.findViewById(R.id.city_name);
        tv_syd.setText("Sydney");

        iv_syd = (ImageView) parent_syd.findViewById(R.id.city_img);
        iv_syd.setImageResource(R.drawable.sydney);

        time_syd = (TextClock) parent_syd.findViewById(R.id.city_time);
        time_syd.setTimeZone("Australia/Sydney");

        //NEW YORK, USA
        parent_nyc = (ConstraintLayout) findViewById(R.id.parent_nyc);
        tv_nyc = (TextView) parent_nyc.findViewById(R.id.city_name);
        tv_nyc.setText("New York");

        iv_nyc = (ImageView) parent_nyc.findViewById(R.id.city_img);
        iv_nyc.setImageResource(R.drawable.nyc);

        time_nyc = (TextClock) parent_nyc.findViewById(R.id.city_time);
        time_nyc.setTimeZone("America/New_York");

        //TOKYO, JAPAN
        parent_tokyo = findViewById(R.id.parent_tokyo);
        tv_tokyo = (TextView) parent_tokyo.findViewById(R.id.city_name);
        tv_tokyo.setText("Tokyo");

        iv_tokyo = (ImageView) parent_tokyo.findViewById(R.id.city_img);
        iv_tokyo.setImageResource(R.drawable.tokyo);

        time_tokyo = (TextClock) parent_tokyo.findViewById(R.id.city_time);
        time_tokyo.setTimeZone("Asia/Tokyo");

        //CAIRO, EGYPT
        parent_cairo = (ConstraintLayout) findViewById(R.id.parent_cairo);
        tv_cairo = (TextView) parent_cairo.findViewById(R.id.city_name);
        tv_cairo.setText("Cairo");

        iv_cairo = (ImageView) parent_cairo.findViewById(R.id.city_img);
        iv_cairo.setImageResource(R.drawable.cairo);

        time_cairo = (TextClock) parent_cairo.findViewById(R.id.city_time);
        time_cairo.setTimeZone("Africa/Cairo");

        //HONG KONG
        parent_hk = (ConstraintLayout) findViewById(R.id.parent_hk);
        tv_hk = (TextView) parent_hk.findViewById(R.id.city_name);
        tv_hk.setText("Hong Kong");

        iv_hk = (ImageView) parent_hk.findViewById(R.id.city_img);
        iv_hk.setImageResource(R.drawable.hongkong);

        time_hk = (TextClock) parent_hk.findViewById(R.id.city_time);
        time_hk.setTimeZone("Asia/Hong_Kong");

        //ITALY, ROME
        parent_italy = (ConstraintLayout) findViewById(R.id.parent_italy);
        tv_italy = (TextView) parent_italy.findViewById(R.id.city_name);
        tv_italy.setText("Italy");

        iv_italy = (ImageView) parent_italy.findViewById(R.id.city_img);
        iv_italy.setImageResource(R.drawable.italy);

        time_italy = (TextClock) parent_italy.findViewById(R.id.city_time);
        time_italy.setTimeZone("Europe/Rome");

        //JAKARTA, INDONESIA
        parent_jkt = (ConstraintLayout) findViewById(R.id.parent_jkt);
        tv_jkt = (TextView) parent_jkt.findViewById(R.id.city_name);
        tv_jkt.setText("Jakarta");

        iv_jkt = (ImageView) parent_jkt.findViewById(R.id.city_img);
        iv_jkt.setImageResource(R.drawable.jakarta);

        time_jkt = (TextClock) parent_jkt.findViewById(R.id.city_time);
        time_jkt.setTimeZone("Asia/Jakarta");

        //LONDON, UK
        parent_ldn = (ConstraintLayout) findViewById(R.id.parent_ldn);
        tv_ldn = (TextView) parent_ldn.findViewById(R.id.city_name);
        tv_ldn.setText("London");

        iv_ldn = (ImageView) parent_ldn.findViewById(R.id.city_img);
        iv_ldn.setImageResource(R.drawable.london);

        time_ldn = (TextClock) parent_ldn.findViewById(R.id.city_time);
        time_ldn.setTimeZone("Europe/London");

        //MADRID, SPAIN
        parent_madrid = (ConstraintLayout) findViewById(R.id.parent_madrid);
        tv_madrid = (TextView) parent_madrid.findViewById(R.id.city_name);
        tv_madrid.setText("Madrid");

        iv_madrid = (ImageView) parent_madrid.findViewById(R.id.city_img);
        iv_madrid.setImageResource(R.drawable.madrid);

        time_madrid = (TextClock) parent_madrid.findViewById(R.id.city_time);
        time_madrid.setTimeZone("Europe/Madrid");

        //SEOUL, SOUTH KOREA
        parent_seoul = (ConstraintLayout) findViewById(R.id.parent_seoul);
        tv_seoul = (TextView) parent_seoul.findViewById(R.id.city_name);
        tv_seoul.setText("Seoul");

        iv_seoul = (ImageView) parent_seoul.findViewById(R.id.city_img);
        iv_seoul.setImageResource(R.drawable.seoul);

        time_seoul = (TextClock) parent_seoul.findViewById(R.id.city_time);
        time_seoul.setTimeZone("Asia/Seoul");
    }
}
