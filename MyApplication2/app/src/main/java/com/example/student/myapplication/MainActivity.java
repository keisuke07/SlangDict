package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.text);
        String s = calc(100);
        s += calc(3000);
        s += calc(1000);
        s += calc(10000);
        s+=calc(20000);
        textView.setText(s);
    }

    private String calc(int n) {
        int a = 0;
        for (int i = 1; i <= n; i++) {

            a +=i;
        }
        String s = "1から " + String.valueOf(n) + "を　加えたわ" + String.valueOf(a) + "\n";
   return s;
    }

}