package com.travelplan.testtt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    private Button p2bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        final EditText ed1=findViewById(R.id.et1_et);
        final String inp=ed1.getText().toString();
        p2bt = (Button) findViewById(R.id.p2_btn);
        p2bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1.getText().toString().matches("nonono"))
                Toast.makeText(getApplicationContext(),"查無此地點",Toast.LENGTH_SHORT).show();
                else
                openActivity3();
            }
        });
    }
    public void openActivity3() {
        Intent intentp2 = new Intent(this, Activity3.class);
        startActivity(intentp2);
    }
}
