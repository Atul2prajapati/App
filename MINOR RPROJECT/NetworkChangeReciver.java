package com.example.fifa_21;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

public class NetworkChangeReciver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        try {
            if(isonline(context)) {
                Toast.makeText(context, "NETWORK CONNCTED", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(context, "NETWORK DISSCONNECTED ", Toast.LENGTH_SHORT).show();
            }

        } catch (NullPointerException e) {
            e.printStackTrace();
        }

}

    public boolean isonline(Context context) {
        try {
            ConnectivityManager cm = (ConnectivityManager) context.getSystemService(context.CONNECTIVITY_SERVICE);
            NetworkInfo networkinfo = cm.getActiveNetworkInfo();
            return(networkinfo!=null && networkinfo.isConnected());

        } catch (NullPointerException e) {
            e.printStackTrace();
            return false;
        }
    }
    }