package com.example.techquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button startBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Listner to switch the activity
        startBtn = findViewById(R.id.start_btn);
        startBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent categoryIntent = new Intent( MainActivity.this,CategoriesActivity.class);
                startActivity(categoryIntent);
            }
        });
    }
}
