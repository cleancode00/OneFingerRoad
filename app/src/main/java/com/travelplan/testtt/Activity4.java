package com.travelplan.testtt;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Activity4 extends AppCompatActivity {
    private Button p4bt;
    private Button p4bt2;
    private ImageView img1;


    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        img1 = (ImageView) findViewById(R.id.theplan_iv);
        p4bt = (Button) findViewById(R.id.p4_btn);
        p4bt2 = (Button) findViewById(R.id.p4_btn2);
        p4bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                otheriv();
            }
        });
        p4bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                browser1();
            }
        });
    }

    public void otheriv() {
       i++;
       if(i%3==1){
           img1.setImageResource(R.drawable.a02);
           p4bt2.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   browser2();
               }
           });
       }
       else if(i%3==0){
           img1.setImageResource(R.drawable.a01);
           p4bt2.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   browser1();
               }
           });
       }
       else if(i%3==2){
           img1.setImageResource(R.drawable.a03);
           p4bt2.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   browser3();
               }
           });
       }
       else{
           img1.setImageResource(R.drawable.a02);
           p4bt2.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   browser1();
               }
           });
       }
    }
    public void browser1() {
        Intent browserInt= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com.tw/maps/dir/%E6%9D%B1%E5%90%B3%E5%A4%A7%E5%AD%B8%E5%9F%8E%E4%B8%AD%E6%A0%A1%E5%8D%80+100%E5%8F%B0%E5%8C%97%E5%B8%82%E4%B8%AD%E6%AD%A3%E5%8D%80%E8%B2%B4%E9%99%BD%E8%A1%97%E4%B8%80%E6%AE%B556%E8%99%9F/%E8%B1%A1%E5%B1%B1%E8%A6%AA%E5%B1%B1%E6%AD%A5%E9%81%93+110%E5%8F%B0%E5%8C%97%E5%B8%82%E4%BF%A1%E7%BE%A9%E5%8D%80%E4%BF%A1%E7%BE%A9%E8%B7%AF%E4%BA%94%E6%AE%B5150%E5%B7%B7342%E5%BC%84/%E6%9C%9B%E5%B9%BD%E8%B0%B7+202%E5%9F%BA%E9%9A%86%E5%B8%82%E4%B8%AD%E6%AD%A3%E5%8D%80%E5%85%AB%E6%96%97%E5%AD%90/%E5%9F%BA%E9%9A%86%E5%BB%9F%E5%8F%A3%E7%A2%B3%E7%83%A4%E4%B8%89%E6%98%8E%E6%B2%BB+200%E5%9F%BA%E9%9A%86%E5%B8%82%E4%BB%81%E6%84%9B%E5%8D%80%E4%BB%81%E4%B8%89%E8%B7%AF39%E8%99%9F%E5%BB%9F%E5%8F%A3%E7%AC%AC9%E8%99%9F%E6%94%A4%E4%BD%8D/@25.067496,121.5784648,12z/data=!4m26!4m25!1m5!1m1!1s0x3442a9a09f4fc9eb:0x9c2e6c02ad4bc7eb!2m2!1d121.5099286!2d25.0388741!1m5!1m1!1s0x3442abb286dcae25:0x326b083d1fba31ba!2m2!1d121.570828!2d25.0273924!1m5!1m1!1s0x345d4f775037593b:0xf81d7f315ef3655!2m2!1d121.7975138!2d25.1459997!1m5!1m1!1s0x345d4e3e18896da5:0xab881c779e5d7481!2m2!1d121.7429353!2d25.1285071!3e0?hl=zh-TW&authuser=0"));
        startActivity(browserInt);
    }
    public void browser2() {
        Intent browserInt= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com.tw/maps/dir/%E6%9D%B1%E5%90%B3%E5%A4%A7%E5%AD%B8%E5%9F%8E%E4%B8%AD%E6%A0%A1%E5%8D%80+100%E5%8F%B0%E5%8C%97%E5%B8%82%E4%B8%AD%E6%AD%A3%E5%8D%80%E8%B2%B4%E9%99%BD%E8%A1%97%E4%B8%80%E6%AE%B556%E8%99%9F/%E6%96%B0%E5%8C%97%E5%B8%82%E9%B6%AF%E6%AD%8C%E5%8D%80%E5%B0%96%E5%B1%B1%E5%9F%94%E8%B7%AF%E9%B6%AF%E6%AD%8C%E8%80%81%E8%A1%97/%E6%9C%9B%E5%B9%BD%E8%B0%B7+202%E5%9F%BA%E9%9A%86%E5%B8%82%E4%B8%AD%E6%AD%A3%E5%8D%80%E5%85%AB%E6%96%97%E5%AD%90/%E5%9F%BA%E9%9A%86%E5%BB%9F%E5%8F%A3%E7%A2%B3%E7%83%A4%E4%B8%89%E6%98%8E%E6%B2%BB+200%E5%9F%BA%E9%9A%86%E5%B8%82%E4%BB%81%E6%84%9B%E5%8D%80%E4%BB%81%E4%B8%89%E8%B7%AF39%E8%99%9F%E5%BB%9F%E5%8F%A3%E7%AC%AC9%E8%99%9F%E6%94%A4%E4%BD%8D/@25.0448504,121.4353968,11z/data=!3m1!4b1!4m26!4m25!1m5!1m1!1s0x3442a9a09f4fc9eb:0x9c2e6c02ad4bc7eb!2m2!1d121.5099286!2d25.0388741!1m5!1m1!1s0x34681eabaecb8db3:0xd220ed0c568d1dde!2m2!1d121.3508371!2d24.9519839!1m5!1m1!1s0x345d4f775037593b:0xf81d7f315ef3655!2m2!1d121.7975138!2d25.1459997!1m5!1m1!1s0x345d4e3e18896da5:0xab881c779e5d7481!2m2!1d121.7429353!2d25.1285071!3e0?hl=zh-TW&authuser=0"));
        startActivity(browserInt);
    }
    public void browser3() {
        Intent browserInt= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com.tw/maps/dir/%E6%9D%B1%E5%90%B3%E5%A4%A7%E5%AD%B8%E5%9F%8E%E4%B8%AD%E6%A0%A1%E5%8D%80+100%E5%8F%B0%E5%8C%97%E5%B8%82%E4%B8%AD%E6%AD%A3%E5%8D%80%E8%B2%B4%E9%99%BD%E8%A1%97%E4%B8%80%E6%AE%B556%E8%99%9F/%E6%96%B0%E5%8C%97%E5%B8%82%E8%90%AC%E9%87%8C%E5%8D%80%E9%87%8E%E6%9F%B3/%E6%96%B0%E5%8C%97%E5%B8%82%E6%B7%B1%E5%9D%91%E5%8D%80%E6%B7%B1%E5%9D%91%E8%A1%97%E6%B7%B1%E5%9D%91%E8%80%81%E8%A1%97/%E5%9F%BA%E9%9A%86%E5%B8%82%E4%BB%81%E6%84%9B%E5%8D%80%E4%BB%81%E4%B8%89%E8%B7%AF%E5%BB%9F%E5%8F%A3%E7%AC%AC9%E8%99%9F%E6%94%A4%E4%BD%8D%E5%9F%BA%E9%9A%86%E5%BB%9F%E5%8F%A3%E7%A2%B3%E7%83%A4%E4%B8%89%E6%98%8E%E6%B2%BB/@25.101239,121.5551943,12z/data=!3m1!4b1!4m26!4m25!1m5!1m1!1s0x3442a9a09f4fc9eb:0x9c2e6c02ad4bc7eb!2m2!1d121.5099286!2d25.0388741!1m5!1m1!1s0x345d4c76cd4bab1b:0x2ce3b7f308d5f6af!2m2!1d121.688982!2d25.203595!1m5!1m1!1s0x3442aac459f59e5f:0xabc2e9c435c6bdfd!2m2!1d121.6141688!2d25.0014341!1m5!1m1!1s0x345d4e3e18896da5:0xab881c779e5d7481!2m2!1d121.7429353!2d25.1285071!3e0?hl=zh-TW&authuser=0"));
        startActivity(browserInt);
    }
}
