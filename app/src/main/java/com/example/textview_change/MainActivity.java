package com.example.textview_change;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView myTextview = (TextView)findViewById(R.id.myTextview);
        myTextview.setText("My Awesome Text");
//        myTextview.setTextColor(Color.parseColor("#FF1493"));
        myTextview.setTextColor(getResources().getColor(R.color.changecolor));
    }
}
