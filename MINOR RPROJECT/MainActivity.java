package com.example.fifa_21;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button onclick;
    public Intent intent;
    BroadcastReceiver broadcastReceiver = new NetworkChangeReciver();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* this is for registerNtworkbroadcast */
    protected void registerNetworkBroadcastreciver(){

  if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.N){

      registerReceiver(broadcastReceiver,new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION));
  }
  if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){

            registerReceiver(broadcastReceiver,new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION));
        }

    }
    protected  void unregisterNetwork(){
        try {
            unregisterReceiver(broadcastReceiver);
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }

    }

    /* this code to go to next activity */
    public void onclick (View view ){
            Intent intent = new Intent(this, second.class);
            startActivity(intent);
            finish();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterNetwork();
    }
}