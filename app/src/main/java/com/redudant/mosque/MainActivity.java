package com.redudant.mosque;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;


public class MainActivity extends AppCompatActivity {

    ImageView ivBG;
    TextView tvDay, tvDMYMasehiq, tvDMYHijriah, tvNameMasjid,
            tvAddMasjid, tvNoHp, tvTimeq, timeSchedule, tvImsyak, tvTimeImsyak,
            tvShubuh, tvTimeShubuh, tvDzuhur, tvTimeDzuhur, tvAshar, tvTimeAshar,
            tvMagrib, tvTimeMagrib, tvIsya, tvTimeIsya;


    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDay = (TextView) findViewById(R.id.tvDay);
        tvDMYMasehiq = (TextView) findViewById(R.id.tvDMYMasehi);
        tvDMYHijriah = (TextView) findViewById(R.id.tvDMYHijriah);
        tvNameMasjid = (TextView) findViewById(R.id.tvNameMasjid);
        tvAddMasjid = (TextView) findViewById(R.id.tvAddMasjid);
        tvNoHp = (TextView) findViewById(R.id.tvNoHp);
        tvTimeq = (TextView) findViewById(R.id.tvTime);
        timeSchedule = (TextView) findViewById(R.id.timeSchedule);
        tvImsyak = (TextView) findViewById(R.id.tvImsyak);
        tvTimeImsyak = (TextView) findViewById(R.id.tvTimeImsyak);
        tvShubuh = (TextView) findViewById(R.id.tvShubuh);
        tvTimeShubuh = (TextView) findViewById(R.id.tvTimeShubuh);
        tvDzuhur = (TextView) findViewById(R.id.tvDzuhur);
        tvTimeDzuhur = (TextView) findViewById(R.id.tvTimeDzuhur);
        tvAshar = (TextView) findViewById(R.id.tvAshar);
        tvMagrib = (TextView) findViewById(R.id.tvMagrib);
        tvTimeMagrib = (TextView) findViewById(R.id.tvTimeMagrib);
        tvIsya = (TextView) findViewById(R.id.tvIsya);
        tvTimeIsya = (TextView) findViewById(R.id.tvTimeIsya);

        //Time
        Calendar cal = Calendar.getInstance();
        DateFormat df = new SimpleDateFormat("hh:mm:ssa");
        String date_str = df.format(cal.getTime());
        tvTimeq.setText(date_str);

        DateFormat df2 = new SimpleDateFormat("dd MMM yyyy");
        String date_str2 = df2.format(cal.getTime());
        tvDMYMasehiq.setText(date_str2);

    }

}
