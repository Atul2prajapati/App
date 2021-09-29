package com.example.fifa_21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Barcelona extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barcelona);
    }
    public void onbarca(View view){
        Intent inten =new Intent(this,Third.class);
        startActivity(inten);
        finish();

    }
}