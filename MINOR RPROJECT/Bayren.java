package com.example.fifa_21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Bayren extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bayren);
    }
    public void onbayren(View view){
        Intent intent = new Intent(this ,Third.class);
        startActivity(intent);
        finish();
    }
}