package com.hackslash.getslot;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class SlotsActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slots);
        Intent data=getIntent();
        int state=data.getIntExtra("state",0);
        int district=data.getIntExtra("district",0);
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        Date currentDate=new Date();
        String date=sdf.format(currentDate);
        System.out.println(date);
    }
}