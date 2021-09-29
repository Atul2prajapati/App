package com.example.fifa_21;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class second extends AppCompatActivity {
    public Button onclick1;
    public Button onclick2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    }
    /* this code is used to go back */
    public void Onclick2(View view){
        Intent intent1 =new Intent(this,MainActivity.class);
        startActivity(intent1);
        finish();
    }
 /*   code for next page */
    public void Onclick1(View view) {
        Intent intent = new Intent(this, Third.class);
        startActivity(intent);
        Toast.makeText(this, "Tap on Name to view Detail!!!", Toast.LENGTH_SHORT).show();
        finish();


    }
    }
