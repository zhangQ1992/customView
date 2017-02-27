package com.example.qing.customview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    Circle mCircle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCircle = (Circle) findViewById(R.id.c);
        mCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCircle.addSide();
            }
        });
    }
}
