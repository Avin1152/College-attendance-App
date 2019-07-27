package com.example.gietuniversity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.graphics.Color;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class Jsoncallapi extends AppCompatActivity {
    private TextView bunk,total, iio,s11,s12,s13,s14,s21,s22,s23,s24,s31,s32,s33,s34,s41,s42,s43,s44,s51,s52,s53,s54,s61,s62,s63,s64,s71,s72,s73,s74,s81,s82,s83,s84,s91,s92,s93,s94,t1,t2,t3,t4,s101,s102,s103,s104;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jsoncallapi);

        iio=findViewById(R.id.iio);
        total=findViewById(R.id.total);//bunk=findViewById(R.id.bunk);
        s11=findViewById(R.id.s11);s12=findViewById(R.id.s12);s13=findViewById(R.id.s13);s14=findViewById(R.id.s14);
        s21=findViewById(R.id.s21);s22=findViewById(R.id.s22);s23=findViewById(R.id.s23);s24=findViewById(R.id.s24);
        s31=findViewById(R.id.s31);s32=findViewById(R.id.s32);s33=findViewById(R.id.s33);s34=findViewById(R.id.s34);
        s41=findViewById(R.id.s41);s42=findViewById(R.id.s42);s43=findViewById(R.id.s43);s44=findViewById(R.id.s44);
        s51=findViewById(R.id.s51);s52=findViewById(R.id.s52);s53=findViewById(R.id.s53);s54=findViewById(R.id.s54);
        s61=findViewById(R.id.s61);s62=findViewById(R.id.s62);s63=findViewById(R.id.s63);s64=findViewById(R.id.s64);
        s71=findViewById(R.id.s71);s72=findViewById(R.id.s72);s73=findViewById(R.id.s73);s74=findViewById(R.id.s74);
        s81=findViewById(R.id.s81);s82=findViewById(R.id.s82);s83=findViewById(R.id.s83);s84=findViewById(R.id.s84);
        s91=findViewById(R.id.s91);s92=findViewById(R.id.s92);s93=findViewById(R.id.s93);s94=findViewById(R.id.s94);
        s101=findViewById(R.id.s101);s102=findViewById(R.id.s102);s103=findViewById(R.id.s103);s104=findViewById(R.id.s104);
        t1=findViewById(R.id.t1);t2=findViewById(R.id.t2);t3=findViewById(R.id.t3);t4=findViewById(R.id.t4);
        iio.setText("NAME OF STUDENT ");
        String ss="";
        try {
            Bundle gt=getIntent().getExtras();
            String str=gt.getString("abc");
            JSONObject jsonObj = new JSONObject(str);
            String name = jsonObj.getString("stud");//retrive name
            String su=jsonObj.getString("status");//retrive status
            JSONArray ja_data = jsonObj.getJSONArray("table");
            int p=ja_data.length();
           // Toast.makeText(this, ""+su, Toast.LENGTH_LONG).show();
            if(su.equals("success")) {
                iio.setText(name);
                for(int i=0;i<p;i++){
                    JSONObject rec=ja_data.getJSONObject(i);
                    String s0=rec.getString("subject");
                    String[] s=s0.split(":");
                    String s1=rec.getString("held");
                    String s2=rec.getString("attended");
                    String s3=rec.getString("att_per");
                    String s4=rec.getString("faculty");
                    if(!s3.equals(" "))
                        s3+="%";
                    if(s4.equals("Total")){
                        t1.setText("TOTAL");
                        t2.setText(s1);
                        t3.setText(s2);
                        t4.setText(s3);
                        total.setText("Your Attendance is "+s3);
                        int x = Integer.parseInt(s3.replaceAll("[\\D]", ""));
                        if (x < 8000) {
                            total.setBackgroundColor(0xfff00000);
                        } else {
                            total.setBackgroundColor(Color.GREEN);
                        }
                        continue;
                    }
                    if(i==0) {
                        s11.setText(s[0]);s12.setText(s1);s13.setText(s2);s14.setText(s3);
                    }
                    if(i==1) {
                        s21.setText(s[0]);s22.setText(s1);s23.setText(s2);s24.setText(s3);
                    }
                    if(i==2) {
                        s31.setText(s[0]);s32.setText(s1);s33.setText(s2);s34.setText(s3);
                    }
                    if(i==3) {
                        s41.setText(s[0]);s42.setText(s1);s43.setText(s2);s44.setText(s3);
                    }
                    if(i==4) {
                        s51.setText(s[0]);s52.setText(s1);s53.setText(s2);s54.setText(s3);
                    }
                    if(i==5) {
                        s61.setText(s[0]);s62.setText(s1);s63.setText(s2);s64.setText(s3);
                    }
                    if(i==6) {
                        s71.setText(s[0]);s72.setText(s1);s73.setText(s2);s74.setText(s3);
                    }
                    if(i==7) {
                        s81.setText(s[0]);s82.setText(s1);s83.setText(s2);s84.setText(s3);
                    }
                    if(i==8) {
                        s91.setText(s[0]);s92.setText(s1);s93.setText(s2);s94.setText(s3);
                    }
                    if(i==9) {
                        s101.setText(s[0]);s102.setText(s1);s103.setText(s2);s104.setText(s3);
                    }
                }
            }
            if(su.equals("error")){
                Toast.makeText(this, "IN VALID USERID/PASSWORD ", Toast.LENGTH_LONG).show();
               // Intent a = new Intent(Jsoncallapi.this,MainActivity.class);
                //startActivity(a);
               // finish();
            }
        }
        catch (Exception e){
            Toast.makeText(this, " IN VALID USERID / PASSWORD ", Toast.LENGTH_LONG).show();
            Intent a = new Intent(Jsoncallapi.this,MainActivity.class);
            startActivity(a);
            finish();
        }
    }
    @Override
    public void onBackPressed() {
        Intent a = new Intent(Jsoncallapi.this,MainActivity.class);
        startActivity(a);
        finish();
    }
}
