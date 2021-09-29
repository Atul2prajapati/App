package com.example.fifa_21;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Third extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        /*this is for bayren club */

        TextView textView= findViewById(R.id.textView7);
        String text="BAYREN MUNICH";
        SpannableString bm =new SpannableString(text);
        ClickableSpan clickableSpan =new ClickableSpan() {
            @Override
            public void updateDrawState( TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(Color.YELLOW);
            }

            @Override
            public void onClick(View widget) {
                Intent intent = new Intent(getBaseContext(), Bayren.class);
                startActivity(intent);
                Toast.makeText(getBaseContext(),"RANK 1",Toast.LENGTH_SHORT).show();
                finish();
            }
        };
        bm.setSpan(clickableSpan,0,13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(bm);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        /*This is for the manchster city */

        TextView textView1 =findViewById(R.id.textView4);
        String text1= "MANCHESTER CITY";
        SpannableString mc = new SpannableString(text1);
        ClickableSpan clickableSpan1= new ClickableSpan() {
            @Override
            public void updateDrawState( TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(Color.YELLOW);
            }

            @Override
            public void onClick( View widget) {
                Intent intent= new Intent(getBaseContext(), Manchester.class);
                startActivity(intent);
                Toast.makeText(getBaseContext(),"RANK 2",Toast.LENGTH_SHORT).show();
                finish();

            }
        };
        mc.setSpan(clickableSpan1,0,15,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView1.setText(mc);
        textView1.setMovementMethod(LinkMovementMethod.getInstance());

        /* this is for INter milan */
        TextView textView2 =findViewById(R.id.textView5);
        String text2= "INTER MILAN";
        SpannableString im= new SpannableString(text2);
        ClickableSpan clickableSpan2 = new ClickableSpan() {
            @Override
            public void updateDrawState( TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(Color.YELLOW);
            }

            @Override
            public void onClick( View widget) {
                Intent intent = new Intent(getBaseContext(),Intermilan.class);
                startActivity(intent);
                Toast.makeText(getBaseContext(),"RANK 3",Toast.LENGTH_SHORT).show();
                finish();
            }
        };
        im.setSpan(clickableSpan2,0,11,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView2.setText(im);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());

        /* THis is for Real madrid */

        TextView textView3 =findViewById(R.id.textView6);
        String text3="REAL MADRID";

        SpannableString rm= new SpannableString(text3);
        ClickableSpan clickableSpan3 =new ClickableSpan() {
            @Override
            public void updateDrawState( TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(Color.YELLOW);
            }

            @Override
            public void onClick( View widget) {
                Intent intent=new Intent(getBaseContext(),Realmadrid.class);
                startActivity(intent);
                Toast.makeText(getBaseContext(),"RANK 4",Toast.LENGTH_SHORT).show();
                finish();
            }
        };
        rm.setSpan(clickableSpan3,0,11,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView3.setText(rm);
        textView3.setMovementMethod(LinkMovementMethod.getInstance());

        /* This is for barcelona */
        TextView textView4 =findViewById(R.id.textView8);
        String text4="F.C. BARCELONA";
        SpannableString fcb=new SpannableString(text4);
        ClickableSpan clickableSpan4= new ClickableSpan() {
            @Override
            public void updateDrawState(TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(Color.YELLOW);
            }

            @Override
            public void onClick( View widget) {
                Intent intent =new Intent(getBaseContext(),Barcelona.class);
                startActivity(intent);
                Toast.makeText(getBaseContext(),"RANK 5",Toast.LENGTH_SHORT).show();
                finish();

            }
        };

        fcb.setSpan(clickableSpan4,0,14,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView4.setText(fcb);
        textView4.setMovementMethod(LinkMovementMethod.getInstance());



    }
    /* this is for next activity */
    public void onclicknext(View view){
        Intent intent=  new Intent(this,Fourth.class);
        startActivity(intent);
        finish();

    }

    /* this is for back page */
    public  void onclickback(View view){
        Intent intent =new Intent(this,second.class);
        startActivity(intent);
        finish();

    }
}