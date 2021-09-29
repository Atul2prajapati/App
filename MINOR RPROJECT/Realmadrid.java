package com.example.fifa_21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Realmadrid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realmadrid);
    }
    public void onreal(View view){

        Intent intent =new Intent(this ,Third.class);
        startActivity(intent);
        finish();
    }
}