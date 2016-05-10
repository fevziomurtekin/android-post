package com.tekin.veritabani;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {
    EditText adsoyad,sinif;
   TextView yazdir;
    Button btn,gstr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adsoyad= (EditText) findViewById(R.id.adsoyad);
        sinif= (EditText) findViewById(R.id.sinif);
        btn= (Button) findViewById(R.id.gndr);
        yazdir= (TextView) findViewById(R.id.textView);
        gstr= (Button) findViewById(R.id.goster);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ad=adsoyad.getText().toString();
                String sin=sinif.getText().toString();
                String parameters="&txtName="+ad+"&txtTel="+sin+"&txtMajor";
                HttpURLConnectionExample deneme=new HttpURLConnectionExample(parameters);
                yazdir.setText(parameters);
                deneme.execute();
                Toast.makeText(MainActivity.this,"Form gönderiliyor",Toast.LENGTH_SHORT).show();

            }
        });

        
    }

}