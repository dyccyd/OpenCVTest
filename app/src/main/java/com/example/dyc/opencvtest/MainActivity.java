package com.example.dyc.opencvtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text = ((TextView) findViewById(R.id.test));
        text.setText(JniKit.calculate(4)+"");
    }
}
