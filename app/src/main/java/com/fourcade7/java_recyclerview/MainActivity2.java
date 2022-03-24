package com.fourcade7.java_recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView=findViewById(R.id.textview2);
        imageView=findViewById(R.id.imageview2);

        Intent intent=getIntent();
        int rasm=intent.getIntExtra("img",0);
        String ism= intent.getStringExtra("name");

        imageView.setImageResource(rasm);
        textView.setText(ism);
    }
}