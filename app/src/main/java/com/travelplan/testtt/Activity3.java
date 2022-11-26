package com.travelplan.testtt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity3 extends AppCompatActivity {
    private Button p3bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        p3bt = (Button) findViewById(R.id.p3_btn);
        p3bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivity4();
            }
        });
    }
    public void openActivity4() {
        Intent intentp3 = new Intent(this, Activity4.class);
        startActivity(intentp3);
    }
}