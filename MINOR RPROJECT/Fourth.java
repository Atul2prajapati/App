package com.example.fifa_21;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Calendar;

public class Fourth extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        ImageButton home =(ImageButton) findViewById(R.id.imageButton2);

       /* code  for  alert window  */

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alert = new AlertDialog.Builder(Fourth.this);
                       alert.setMessage("Are you sure Redirect to HOME PAGE");
                       alert.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                           @Override
                           public void onClick(DialogInterface dialog, int which) {
                               Intent intent= new Intent(getBaseContext(),MainActivity.class);
                               startActivity(intent);
                               finish();


                           }
                       });

                       alert.setNegativeButton("no", new DialogInterface.OnClickListener() {
                           @Override
                           public void onClick(DialogInterface dialog, int which) {
                               dialog.cancel();
                           }
                       });
                               AlertDialog alert2 = alert.create();
                               alert2.show();
            }
        });
    }
    /* code for toast */
    public  void clickhere(View view){
        Toast.makeText(getBaseContext(),"Visit FIFA.com To Know More",Toast.LENGTH_LONG).show();
    }
/* code for back button */
    public void Onclick2(View view) {
        Intent intent= new Intent(this,Third.class);
        startActivity(intent);
        finish();


    }


}