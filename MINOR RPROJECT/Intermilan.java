package com.example.fifa_21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Intermilan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermilan);
    }
    public void oninter(View view){
        Intent intent =new Intent(this, Third.class);
        startActivity(intent);
        finish();

    }
}